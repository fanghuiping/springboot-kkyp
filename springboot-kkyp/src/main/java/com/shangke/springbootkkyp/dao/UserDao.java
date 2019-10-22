package com.shangke.springbootkkyp.dao;

import com.shangke.springbootkkyp.dao.sqlProvidr.UserSqlProvider;
import com.shangke.springbootkkyp.pojo.User;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.mapstruct.Mapper;

@Mapper
public interface UserDao {
    @InsertProvider(type = UserSqlProvider.class,method = "save")
    int save(User user);

    @SelectProvider(type = UserSqlProvider.class,method = "findById")
    String findById(Long id);






}
