package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_scenie_spot")
public class ScenicSpotEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 地区编号
     */
    @Column(name = "area_id")
    private Integer areaId;

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
     * 微信支付子商户号
     */
    private String mchid;

    /**
     * 景区名称
     */
    private String name;

    /**
     * 二级标题
     */
    @Column(name = "second_name")
    private String secondName;

    /**
     * 电话
     */
    private String tel;

    /**
     * 封面图URL
     */
    @Column(name = "cover_url")
    private String coverUrl;

    /**
     * 视频
     */
    private String video;

    private String audio;

    /**
     * 推荐语
     */
    private String memo;

    /**
     * 营业开始时间
     */
    @Column(name = "business_time")
    private String businessTime;

    /**
     * 标签
     */
    private String tag;

    /**
     * 星级
     */
    @Column(name = "star_level")
    private Integer starLevel;

    /**
     * 排序号
     */
    private Integer orderno;

    /**
     * 网址
     */
    private String website;

    /**
     * 位置
     */
    private String location;

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
     * 游玩时间
     */
    private String playtime;

    /**
     * 门票攻略
     */
    @Column(name = "ticket_des")
    private String ticketDes;

    /**
     * 交通攻略
     */
    private String traffic;

    /**
     * 是否删除    0 未删除   1 已删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 创建时间
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
     * 图片
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 景点介绍
     */
    private String content;

    /**
     * 景点攻略
     */
    private String strategy;

    /**
     * 最佳看点
     */
    private String bestwatch;

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
     * 获取地区编号
     *
     * @return area_id - 地区编号
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * 设置地区编号
     *
     * @param areaId 地区编号
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
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
     * 获取微信支付子商户号
     *
     * @return mchid - 微信支付子商户号
     */
    public String getMchid() {
        return mchid;
    }

    /**
     * 设置微信支付子商户号
     *
     * @param mchid 微信支付子商户号
     */
    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    /**
     * 获取景区名称
     *
     * @return name - 景区名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置景区名称
     *
     * @param name 景区名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取二级标题
     *
     * @return second_name - 二级标题
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * 设置二级标题
     *
     * @param secondName 二级标题
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
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
     * 获取封面图URL
     *
     * @return cover_url - 封面图URL
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    /**
     * 设置封面图URL
     *
     * @param coverUrl 封面图URL
     */
    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    /**
     * 获取视频
     *
     * @return video - 视频
     */
    public String getVideo() {
        return video;
    }

    /**
     * 设置视频
     *
     * @param video 视频
     */
    public void setVideo(String video) {
        this.video = video;
    }

    /**
     * @return audio
     */
    public String getAudio() {
        return audio;
    }

    /**
     * @param audio
     */
    public void setAudio(String audio) {
        this.audio = audio;
    }

    /**
     * 获取推荐语
     *
     * @return memo - 推荐语
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置推荐语
     *
     * @param memo 推荐语
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取营业开始时间
     *
     * @return business_time - 营业开始时间
     */
    public String getBusinessTime() {
        return businessTime;
    }

    /**
     * 设置营业开始时间
     *
     * @param businessTime 营业开始时间
     */
    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime;
    }

    /**
     * 获取标签
     *
     * @return tag - 标签
     */
    public String getTag() {
        return tag;
    }

    /**
     * 设置标签
     *
     * @param tag 标签
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * 获取星级
     *
     * @return star_level - 星级
     */
    public Integer getStarLevel() {
        return starLevel;
    }

    /**
     * 设置星级
     *
     * @param starLevel 星级
     */
    public void setStarLevel(Integer starLevel) {
        this.starLevel = starLevel;
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
     * 获取网址
     *
     * @return website - 网址
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 设置网址
     *
     * @param website 网址
     */
    public void setWebsite(String website) {
        this.website = website;
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
     * 获取游玩时间
     *
     * @return playtime - 游玩时间
     */
    public String getPlaytime() {
        return playtime;
    }

    /**
     * 设置游玩时间
     *
     * @param playtime 游玩时间
     */
    public void setPlaytime(String playtime) {
        this.playtime = playtime;
    }

    /**
     * 获取门票攻略
     *
     * @return ticket_des - 门票攻略
     */
    public String getTicketDes() {
        return ticketDes;
    }

    /**
     * 设置门票攻略
     *
     * @param ticketDes 门票攻略
     */
    public void setTicketDes(String ticketDes) {
        this.ticketDes = ticketDes;
    }

    /**
     * 获取交通攻略
     *
     * @return traffic - 交通攻略
     */
    public String getTraffic() {
        return traffic;
    }

    /**
     * 设置交通攻略
     *
     * @param traffic 交通攻略
     */
    public void setTraffic(String traffic) {
        this.traffic = traffic;
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
     * 获取景点介绍
     *
     * @return content - 景点介绍
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置景点介绍
     *
     * @param content 景点介绍
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取景点攻略
     *
     * @return strategy - 景点攻略
     */
    public String getStrategy() {
        return strategy;
    }

    /**
     * 设置景点攻略
     *
     * @param strategy 景点攻略
     */
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * 获取最佳看点
     *
     * @return bestwatch - 最佳看点
     */
    public String getBestwatch() {
        return bestwatch;
    }

    /**
     * 设置最佳看点
     *
     * @param bestwatch 最佳看点
     */
    public void setBestwatch(String bestwatch) {
        this.bestwatch = bestwatch;
    }
}