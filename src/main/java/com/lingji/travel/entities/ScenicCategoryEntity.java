package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_scenie_category")
public class ScenicCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商户id
     */
    @Column(name = "merchant_id")
    private Integer merchantId;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 是否删除    0 未删除   1 已删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 状态 1：启用 0：禁用
     */
    private Integer status;

    /**
     * 创建日期
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 修改用户
     */
    @Column(name = "modify_user")
    private Integer modifyUser;

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
     * 获取商户id
     *
     * @return merchant_id - 商户id
     */
    public Integer getMerchantId() {
        return merchantId;
    }

    /**
     * 设置商户id
     *
     * @param merchantId 商户id
     */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * 获取分类名称
     *
     * @return name - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取状态 1：启用 0：禁用
     *
     * @return status - 状态 1：启用 0：禁用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 1：启用 0：禁用
     *
     * @param status 状态 1：启用 0：禁用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建日期
     *
     * @return create_time - 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建日期
     *
     * @param createTime 创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
}