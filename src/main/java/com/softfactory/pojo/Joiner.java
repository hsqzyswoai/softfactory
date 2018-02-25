package com.softfactory.pojo;

import java.io.Serializable;
import java.util.Date;
/*
    加盟商实体类
 */
public class Joiner implements Serializable {

    private Integer joinerId;//加盟商id
    private String joinerName;//加盟商名称
    private Integer organId;//组织Id
    private String joinerLoc;//加盟商地址
    private String joinerLinkname;//加盟商联系人
    private String joinerPhone;//加盟商电话
    private String joinerEmail;//加盟商邮件
    private String joinerAddress;//加盟商地址
    private String joinerBank;//银行
    private String joinerHolder;//银行卡持有者
    private String joinerBanknum;//银行卡号
    private String joinerExplain;//加盟说明
    private Integer joLevelId;//加盟级别
    private Integer joHeigherId;//隶属组织Id
    private Date joinerDate;//加盟日期
    private Integer userId;//所属用户ID
    private String joinerStatus;//状态 1:   0:
    private String joinerRemark;//备注

    public Integer getJoinerId() {
        return joinerId;
    }

    public void setJoinerId(Integer joinerId) {
        this.joinerId = joinerId;
    }

    public String getJoinerName() {
        return joinerName;
    }

    public void setJoinerName(String joinerName) {
        this.joinerName = joinerName;
    }

    public Integer getOrganId() {
        return organId;
    }

    public void setOrganId(Integer organId) {
        this.organId = organId;
    }

    public String getJoinerLoc() {
        return joinerLoc;
    }

    public void setJoinerLoc(String joinerLoc) {
        this.joinerLoc = joinerLoc;
    }

    public String getJoinerLinkname() {
        return joinerLinkname;
    }

    public void setJoinerLinkname(String joinerLinkname) {
        this.joinerLinkname = joinerLinkname;
    }

    public String getJoinerPhone() {
        return joinerPhone;
    }

    public void setJoinerPhone(String joinerPhone) {
        this.joinerPhone = joinerPhone;
    }

    public String getJoinerEmail() {
        return joinerEmail;
    }

    public void setJoinerEmail(String joinerEmail) {
        this.joinerEmail = joinerEmail;
    }

    public String getJoinerAddress() {
        return joinerAddress;
    }

    public void setJoinerAddress(String joinerAddress) {
        this.joinerAddress = joinerAddress;
    }

    public String getJoinerBank() {
        return joinerBank;
    }

    public void setJoinerBank(String joinerBank) {
        this.joinerBank = joinerBank;
    }

    public String getJoinerHolder() {
        return joinerHolder;
    }

    public void setJoinerHolder(String joinerHolder) {
        this.joinerHolder = joinerHolder;
    }

    public String getJoinerBanknum() {
        return joinerBanknum;
    }

    public void setJoinerBanknum(String joinerBanknum) {
        this.joinerBanknum = joinerBanknum;
    }

    public String getJoinerExplain() {
        return joinerExplain;
    }

    public void setJoinerExplain(String joinerExplain) {
        this.joinerExplain = joinerExplain;
    }

    public Integer getJoLevelId() {
        return joLevelId;
    }

    public void setJoLevelId(Integer joLevelId) {
        this.joLevelId = joLevelId;
    }

    public Integer getJoHeigherId() {
        return joHeigherId;
    }

    public void setJoHeigherId(Integer joHeigherId) {
        this.joHeigherId = joHeigherId;
    }

    public Date getJoinerDate() {
        return joinerDate;
    }

    public void setJoinerDate(Date joinerDate) {
        this.joinerDate = joinerDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getJoinerStatus() {
        return joinerStatus;
    }

    public void setJoinerStatus(String joinerStatus) {
        this.joinerStatus = joinerStatus;
    }

    public String getJoinerRemark() {
        return joinerRemark;
    }

    public void setJoinerRemark(String joinerRemark) {
        this.joinerRemark = joinerRemark;
    }
}
