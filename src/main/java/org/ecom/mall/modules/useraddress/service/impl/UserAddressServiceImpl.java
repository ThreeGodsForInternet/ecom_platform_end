package org.ecom.mall.modules.useraddress.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.ecom.mall.modules.useraddress.domain.UserAddress;
import org.ecom.mall.modules.useraddress.service.UserAddressService;
import org.ecom.mall.modules.useraddress.mapper.UserAddressMapper;
import org.springframework.stereotype.Service;

/**
 * @author sls-0
 * @description 针对表【user_address(用户地址表)】的数据库操作Service实现
 * @createDate 2026-06-08
 */
@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress>
    implements UserAddressService {

}