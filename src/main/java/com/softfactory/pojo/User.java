package com.softfactory.pojo;

import java.io.Serializable;

/**
 * 系统用户信息类
 * 
 * @author SONG
 */
public class User implements Serializable {
  private static final long serialVersionUID = 1L;
  private Integer userId;
  private String userName;
  private String password;
  private String flag;

  public User() {

  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }
}