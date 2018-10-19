package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_hotel")
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商户id
     */
    @Column(name = "merchant_id")
    private Integer merchantId;

    /**
     * 商圈ID
     */
    @Column(name = "tradingarea_id")
    private Integer tradingareaId;

    /**
     * 微信支付商户ID
     */
    private String mchid;

    /**
     * 名称
     */
    private String name;

    /**
     * 电话
     */
    private String tel;

    /**
     * 封面图
     */
    @Column(name = "coverUrl")
    private String coverurl;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    private String address;

    /**
     * 位置
     */
    private String location;

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
     * 是否删除    0 未删除   1 已删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 创建日期
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Integer createUser;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 星级
     */
    @Column(name = "starLevel")
    private Integer starlevel;

    /**
     * 是否推荐1是0否
     */
    @Column(name = "is_top")
    private Boolean isTop;

    /**
     * 是否有停车场  0  无  1 有
     */
    private Integer park;

    /**
     * 是否有wifi    0 否  1 是
     */
    private Integer wifi;

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
     * 酒店介绍
     */
    private String description;

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
     * 获取商圈ID
     *
     * @return tradingarea_id - 商圈ID
     */
    public Integer getTradingareaId() {
        return tradingareaId;
    }

    /**
     * 设置商圈ID
     *
     * @param tradingareaId 商圈ID
     */
    public void setTradingareaId(Integer tradingareaId) {
        this.tradingareaId = tradingareaId;
    }

    /**
     * 获取微信支付商户ID
     *
     * @return mchid - 微信支付商户ID
     */
    public String getMchid() {
        return mchid;
    }

    /**
     * 设置微信支付商户ID
     *
     * @param mchid 微信支付商户ID
     */
    public void setMchid(String mchid) {
        this.mchid = mchid;
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
     * 获取电话
     *
     * @return tel - 电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话
     *
     * @param tel 电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取封面图
     *
     * @return coverUrl - 封面图
     */
    public String getCoverurl() {
        return coverurl;
    }

    /**
     * 设置封面图
     *
     * @param coverurl 封面图
     */
    public void setCoverurl(String coverurl) {
        this.coverurl = coverurl;
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
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取位置
     *
     * @return location - 位置
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置位置
     *
     * @param location 位置
     */
    public void setLocation(String location) {
        this.location = location;
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
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
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
     * 获取星级
     *
     * @return starLevel - 星级
     */
    public Integer getStarlevel() {
        return starlevel;
    }

    /**
     * 设置星级
     *
     * @param starlevel 星级
     */
    public void setStarlevel(Integer starlevel) {
        this.starlevel = starlevel;
    }

    /**
     * 获取是否推荐1是0否
     *
     * @return is_top - 是否推荐1是0否
     */
    public Boolean getIsTop() {
        return isTop;
    }

    /**
     * 设置是否推荐1是0否
     *
     * @param isTop 是否推荐1是0否
     */
    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    /**
     * 获取是否有停车场  0  无  1 有
     *
     * @return park - 是否有停车场  0  无  1 有
     */
    public Integer getPark() {
        return park;
    }

    /**
     * 设置是否有停车场  0  无  1 有
     *
     * @param park 是否有停车场  0  无  1 有
     */
    public void setPark(Integer park) {
        this.park = park;
    }

    /**
     * 获取是否有wifi    0 否  1 是
     *
     * @return wifi - 是否有wifi    0 否  1 是
     */
    public Integer getWifi() {
        return wifi;
    }

    /**
     * 设置是否有wifi    0 否  1 是
     *
     * @param wifi 是否有wifi    0 否  1 是
     */
    public void setWifi(Integer wifi) {
        this.wifi = wifi;
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

    /**
     * 获取酒店介绍
     *
     * @return description - 酒店介绍
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置酒店介绍
     *
     * @param description 酒店介绍
     */
    public void setDescription(String description) {
        this.description = description;
    }
}