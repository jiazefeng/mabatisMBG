package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_tradingarea")
public class TradingareaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商户id
     */
    @Column(name = "merchant_id")
    private Integer merchantId;

    /**
     * 名称
     */
    private String name;

    /**
     * 注释
     */
    private String memo;

    /**
     * 排序号
     */
    private Integer orderno;

    /**
     * 是否删除    0 未删除   1 已删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 创建日期
     */
    private Date createdate;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 创建用户
     */
    @Column(name = "create_user")
    private Integer createUser;

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
     * 获取注释
     *
     * @return memo - 注释
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置注释
     *
     * @param memo 注释
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取排序号
     *
     * @return orderno - 排序号
     */
    public Integer getOrderno() {
        return orderno;
    }

    /**
     * 设置排序号
     *
     * @param orderno 排序号
     */
    public void setOrderno(Integer orderno) {
        this.orderno = orderno;
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
     * 获取创建日期
     *
     * @return createdate - 创建日期
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * 设置创建日期
     *
     * @param createdate 创建日期
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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