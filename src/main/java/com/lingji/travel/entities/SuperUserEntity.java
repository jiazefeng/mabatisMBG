package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_super_user")
public class SuperUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 手机号
     */
    @Column(name = "phone_num")
    private String phoneNum;

    /**
     * 办公电话
     */
    @Column(name = "officePhone")
    private String officephone;

    /**
     * 头像
     */
    private String logo;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 最后登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 是否删除    0 未删除   1 已删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 0 禁用  1 启用
     */
    private Integer status;

    /**
     * 修改用户
     */
    @Column(name = "modify_user")
    private Integer modifyUser;

    /**
     * 创建用户
     */
    @Column(name = "create_user")
    private Integer createUser;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 商户ID
     */
    @Column(name = "merchantId")
    private Integer merchantid;

    /**
     * 是否是核销员 0：是；1否
     */
    private Integer writer;

    /**
     * 所属系统：1：景区；2：酒店；3：饭店
     */
    @Column(name = "system_type")
    private Integer systemType;

    /**
     * 所属数据ID
     */
    @Column(name = "data_id")
    private Integer dataId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取真实姓名
     *
     * @return name - 真实姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置真实姓名
     *
     * @param name 真实姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取手机号
     *
     * @return phone_num - 手机号
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 设置手机号
     *
     * @param phoneNum 手机号
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 获取办公电话
     *
     * @return officePhone - 办公电话
     */
    public String getOfficephone() {
        return officephone;
    }

    /**
     * 设置办公电话
     *
     * @param officephone 办公电话
     */
    public void setOfficephone(String officephone) {
        this.officephone = officephone;
    }

    /**
     * 获取头像
     *
     * @return logo - 头像
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置头像
     *
     * @param logo 头像
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取登录时间
     *
     * @return login_time - 登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登录时间
     *
     * @param loginTime 登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取最后登录时间
     *
     * @return last_login_time - 最后登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLoginTime 最后登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取是否删除    0 未删除   1 已删除
     *
     * @return is_delete - 是否删除    0 未删除   1 已删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除    0 未删除   1 已删除
     *
     * @param isDelete 是否删除    0 未删除   1 已删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取0 禁用  1 启用
     *
     * @return status - 0 禁用  1 启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0 禁用  1 启用
     *
     * @param status 0 禁用  1 启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取修改用户
     *
     * @return modify_user - 修改用户
     */
    public Integer getModifyUser() {
        return modifyUser;
    }

    /**
     * 设置修改用户
     *
     * @param modifyUser 修改用户
     */
    public void setModifyUser(Integer modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * 获取创建用户
     *
     * @return create_user - 创建用户
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建用户
     *
     * @param createUser 创建用户
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取商户ID
     *
     * @return merchantId - 商户ID
     */
    public Integer getMerchantid() {
        return merchantid;
    }

    /**
     * 设置商户ID
     *
     * @param merchantid 商户ID
     */
    public void setMerchantid(Integer merchantid) {
        this.merchantid = merchantid;
    }

    /**
     * 获取是否是核销员 0：是；1否
     *
     * @return writer - 是否是核销员 0：是；1否
     */
    public Integer getWriter() {
        return writer;
    }

    /**
     * 设置是否是核销员 0：是；1否
     *
     * @param writer 是否是核销员 0：是；1否
     */
    public void setWriter(Integer writer) {
        this.writer = writer;
    }

    /**
     * 获取所属系统：1：景区；2：酒店；3：饭店
     *
     * @return system_type - 所属系统：1：景区；2：酒店；3：饭店
     */
    public Integer getSystemType() {
        return systemType;
    }

    /**
     * 设置所属系统：1：景区；2：酒店；3：饭店
     *
     * @param systemType 所属系统：1：景区；2：酒店；3：饭店
     */
    public void setSystemType(Integer systemType) {
        this.systemType = systemType;
    }

    /**
     * 获取所属数据ID
     *
     * @return data_id - 所属数据ID
     */
    public Integer getDataId() {
        return dataId;
    }

    /**
     * 设置所属数据ID
     *
     * @param dataId 所属数据ID
     */
    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }
}