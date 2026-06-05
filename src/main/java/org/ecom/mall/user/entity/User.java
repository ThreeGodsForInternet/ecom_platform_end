package org.ecom.mall.user.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(User)实体类
 *
 * @author makejava
 * @since 2026-06-06 01:33:35
 */
public class User implements Serializable {
    private static final long serialVersionUID = -93741361275361921L;
/**
     * 主键
     */
    private Long id;
/**
     * 用户名
     */
    private String username;
/**
     * 手机号
     */
    private String phone;
/**
     * 邮箱
     */
    private String email;
/**
     * 密码
     */
    private String password;
/**
     * 昵称
     */
    private String nickname;
/**
     * 头像
     */
    private String avatar;
/**
     * 状态 0正常 1禁用
     */
    private Integer status;
/**
     * 是否匿名用户 0否 1是
     */
    private Integer isAnonymous;
/**
     * 创建时间
     */
    private Date createTime;
/**
     * 更新时间
     */
    private Date updateTime;
/**
     * 是否删除 0否 1是
     */
    private Integer isDelete;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Integer isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

}

