package org.ecom.mall.modules.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ecom.mall.modules.user.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author sls-0
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2026-06-06 21:26:23
* @Entity generator.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




