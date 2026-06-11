package org.ecom.mall.modules.auth.controller;

import jakarta.validation.Valid;
import org.ecom.mall.common.Result;
import org.ecom.mall.config.security.AppUserDetails;
import org.ecom.mall.config.security.JwtUtils;
import org.ecom.mall.modules.auth.dto.LoginRequest;
import org.ecom.mall.modules.auth.dto.LoginResponse;
import org.ecom.mall.modules.auth.dto.RegisterRequest;
import org.ecom.mall.modules.user.domain.User;
import org.ecom.mall.modules.user.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    public AuthController(AuthenticationManager authenticationManager,
                          JwtUtils jwtUtils,
                          UserService userService,
                          PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
        this.jwtUtils = jwtUtils;
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    /** 登录 */
    @PostMapping("/login")
    public Result<LoginResponse> login(@Valid @RequestBody LoginRequest request) {
//       交给验证管理器处理
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );

//       获取用户详细
        AppUserDetails userDetails = (AppUserDetails) authentication.getPrincipal();
        User user = userDetails.getUser();

        String token = jwtUtils.generateToken(user.getId(), user.getUsername(), user.getRole());

        LoginResponse resp = new LoginResponse(
                token, user.getUsername(), user.getNickname(), user.getRole()
        );
        return Result.success(resp);
    }

    /** 注册 */
    @PostMapping("/register")
    public Result<LoginResponse> register(@Valid @RequestBody RegisterRequest request) {
        // 检查用户名是否已存在
        User existing = userService.findByUsername(request.getUsername());
        if (existing != null) {
            return Result.error(400, "用户名已存在");
        }
// 是否可以简化
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setPhone(request.getPhone());
        user.setEmail(request.getEmail());
        user.setNickname(request.getNickname() != null ? request.getNickname() : request.getUsername());
        user.setRole("ROLE_USER");
        user.setStatus(0);
        user.setIsAnonymous(0);
        user.setIsDelete(0);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());

        userService.save(user);

        String token = jwtUtils.generateToken(user.getId(), user.getUsername(), user.getRole());

//         为啥注册时就创建 jwt ？
        LoginResponse resp = new LoginResponse(
                token, user.getUsername(), user.getNickname(), user.getRole()
        );
        return Result.success(resp);
    }
}