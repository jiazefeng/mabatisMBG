package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_restaurant")
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商户id
     */
    @Column(name = "merchant_id")
    private Integer merchantId;

    /**
     * 商圈id
     */
    @Column(name = "tradingarea_id")
    private Integer tradingareaId;

    /**
     * 微信支付商户ID
     */
    @Column(name = "mch_id")
    private String mchId;

    /**
     * 名称
     */
    private String name;

    /**
     * 封面URL
     */
    @Column(name = "cover_url")
    private String coverUrl;

    /**
     * 备注
     */
    private String memo;

    /**
     * 排序号
     */
    private Integer orderno;

    /**
     * 营业开始时间
     */
    @Column(name = "business_start_time")
    private String businessStartTime;

    /**
     * 营业结束时间
     */
    @Column(name = "business_end_time")
    private String businessEndTime;

    /**
     * 地址
     */
    private String address;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 标签（使用标签表数据，逗号分隔）
     */
    private String tags;

    /**
     * 类型   //1：美食，2：牧家乐，3：农家乐
     */
    private String type;

    /**
     * 是否删除    0 未删除   1 已删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 创建时间
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
     * 推荐1是0否
     */
    @Column(name = "is_top")
    private Integer isTop;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String district;

    @Column(name = "video_url")
    private String videoUrl;

    /**
     * 图片
     */
    @Column(name = "img_url")
    private String imgUrl;

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
     * 获取商圈id
     *
     * @return tradingarea_id - 商圈id
     */
    public Integer getTradingareaId() {
        return tradingareaId;
    }

    /**
     * 设置商圈id
     *
     * @param tradingareaId 商圈id
     */
    public void setTradingareaId(Integer tradingareaId) {
        this.tradingareaId = tradingareaId;
    }

    /**
     * 获取微信支付商户ID
     *
     * @return mch_id - 微信支付商户ID
     */
    public String getMchId() {
        return mchId;
    }

    /**
     * 设置微信支付商户ID
     *
     * @param mchId 微信支付商户ID
     */
    public void setMchId(String mchId) {
        this.mchId = mchId;
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
     * 获取封面URL
     *
     * @return cover_url - 封面URL
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    /**
     * 设置封面URL
     *
     * @param coverUrl 封面URL
     */
    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
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
     * 获取营业开始时间
     *
     * @return business_start_time - 营业开始时间
     */
    public String getBusinessStartTime() {
        return businessStartTime;
    }

    /**
     * 设置营业开始时间
     *
     * @param businessStartTime 营业开始时间
     */
    public void setBusinessStartTime(String businessStartTime) {
        this.businessStartTime = businessStartTime;
    }

    /**
     * 获取营业结束时间
     *
     * @return business_end_time - 营业结束时间
     */
    public String getBusinessEndTime() {
        return businessEndTime;
    }

    /**
     * 设置营业结束时间
     *
     * @param businessEndTime 营业结束时间
     */
    public void setBusinessEndTime(String businessEndTime) {
        this.businessEndTime = businessEndTime;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取标签（使用标签表数据，逗号分隔）
     *
     * @return tags - 标签（使用标签表数据，逗号分隔）
     */
    public String getTags() {
        return tags;
    }

    /**
     * 设置标签（使用标签表数据，逗号分隔）
     *
     * @param tags 标签（使用标签表数据，逗号分隔）
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * 获取类型   //1：美食，2：牧家乐，3：农家乐
     *
     * @return type - 类型   //1：美食，2：牧家乐，3：农家乐
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型   //1：美食，2：牧家乐，3：农家乐
     *
     * @param type 类型   //1：美食，2：牧家乐，3：农家乐
     */
    public void setType(String type) {
        this.type = type;
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

    /**
     * 获取推荐1是0否
     *
     * @return is_top - 推荐1是0否
     */
    public Integer getIsTop() {
        return isTop;
    }

    /**
     * 设置推荐1是0否
     *
     * @param isTop 推荐1是0否
     */
    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区
     *
     * @return district - 区
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置区
     *
     * @param district 区
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return video_url
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * @param videoUrl
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     * 获取图片
     *
     * @return img_url - 图片
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置图片
     *
     * @param imgUrl 图片
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}