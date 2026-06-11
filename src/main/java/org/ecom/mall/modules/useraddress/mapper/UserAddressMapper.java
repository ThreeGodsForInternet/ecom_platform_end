package org.ecom.mall.modules.useraddress.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ecom.mall.modules.useraddress.domain.UserAddress;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author sls-0
 * @description 针对表【user_address(用户地址表)】的数据库操作Mapper
 * @createDate 2026-06-08
 */
@Mapper
public interface UserAddressMapper extends BaseMapper<UserAddress> {

}