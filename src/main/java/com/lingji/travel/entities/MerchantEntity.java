package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_merchant")
public class MerchantEntity {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 备注
     */
    private String memo;

    /**
     * 公众号appid
     */
    private String appid;

    /**
     * 服务商商户号
     */
    private String mchid;

    /**
     * 状态  1 启用  0禁用
     */
    private Integer status;

    /**
     * 是否删除    0 未删除   1 已删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 创建时间
     */
    private Date createdate;

    /**
     * 创建用户
     */
    @Column(name = "create_user")
    private Integer createUser;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取备注
     *
     * @return memo - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取公众号appid
     *
     * @return appid - 公众号appid
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置公众号appid
     *
     * @param appid 公众号appid
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 获取服务商商户号
     *
     * @return mchid - 服务商商户号
     */
    public String getMchid() {
        return mchid;
    }

    /**
     * 设置服务商商户号
     *
     * @param mchid 服务商商户号
     */
    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    /**
     * 获取状态  1 启用  0禁用
     *
     * @return status - 状态  1 启用  0禁用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态  1 启用  0禁用
     *
     * @param status 状态  1 启用  0禁用
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * @return createdate - 创建时间
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * 设置创建时间
     *
     * @param createdate 创建时间
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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
}