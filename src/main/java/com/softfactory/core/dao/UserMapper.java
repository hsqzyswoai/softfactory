package com.softfactory.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import com.softfactory.pojo.User;

@Repository("userMapper")
public interface UserMapper {

  @Select("SELECT USER_ID,USER_NAME,USER_PASSWORD,USER_FLAG  FROM SYS_USER WHERE USER_NAME=#{username} AND USER_PASSWORD=#{password}")
  @ResultMap("com.softfactory.core.dao.UserMapper.user-result")
  User login(@Param("username") String username, @Param("password") String password);

  @Update("UPDATE SYS_USER SET PASSWORD=#{password} WHERE ID=#{id}")
  int changePassword(@Param("id") Integer id, @Param("password") String password);

  // ** CRUD *********************************************************
  @Insert("insert into SYS_USER(ID,USERNAME,PASSWORD,STATUS,PHOTO_PATH) values(#{id},#{username},#{password},#{status},#{photoPath})")
  @SelectKey(statement = "select SEQ_SYS_USERS.nextval from dual", keyProperty = "id", resultType = int.class, before = true)
  int add(User user);

  @Update("update SYS_USER set USERNAME=#{username},PASSWORD=#{password},STATUS=#{status},PHOTO_PATH=#{photoPath} where ID=#{id}")
  int modify(User user);

  @Delete("delete from SYS_USER where ID=#{id}")
  int remove(Integer id);

  @Select("SELECT ID,USERNAME,PASSWORD,STATUS,PHOTO_PATH as photoPath FROM SYS_USER WHERE ID=#{id}")
  User findById(Integer id);

  List<User> findPager(@Param("pageno") Integer pageno, @Param("pagesize") Integer pagesize, @Param("sort") String sort,
      @Param("order") String order, @Param("username") String username, @Param("status") String status);

  long findPagerTotal(@Param("username") String username, @Param("status") String status);

  @Delete("delete from SYS_USER_ROLE where USER_ID=#{userId} and ROLE_ID=#{roleId}")
  void removeUserRole(@Param("userId") Integer userId, @Param("roleId") Integer roleId);

  @Insert("insert into SYS_USER_ROLE(USER_ID,ROLE_ID) values(#{userId},#{roleId})")
  void addUserRole(@Param("userId") Integer userId, @Param("roleId") Integer roleId);
}
