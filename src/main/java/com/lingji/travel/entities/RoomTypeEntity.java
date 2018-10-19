package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_roomtype")
public class RoomTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 酒店id
     */
    @Column(name = "hotel_id")
    private Integer hotelId;

    /**
     * 名称
     */
    private String name;

    /**
     * 封面图
     */
    @Column(name = "cover_url")
    private String coverUrl;

    /**
     * 可住人数
     */
    private Integer livecount;

    /**
     * 押金
     */
    private Long cash;

    /**
     * 价格
     */
    private Long price;

    /**
     * 排序号
     */
    private Integer orderno;

    /**
     * 建筑面积 
     */
    private Double area;

    /**
     * 床型
     */
    private String bedtype;

    /**
     * 无烟   0 否  1 是
     */
    private Integer nosmoke;

    /**
     * 有窗   0 否  1 是
     */
    private Integer window;

    /**
     * 是否有wifi    0 否  1 是
     */
    private Integer wifi;

    /**
     * 是否早点   0 否  1 是
     */
    private Integer breakfast;

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
     * 24小时热水   0  无  1 有
     */
    private Integer hotwater;

    /**
     * 宽带  0  无   1 有
     */
    private Integer network;

    /**
     * 图片
     */
    private String image;

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
     * 获取酒店id
     *
     * @return hotel_id - 酒店id
     */
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * 设置酒店id
     *
     * @param hotelId 酒店id
     */
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
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
     * 获取封面图
     *
     * @return cover_url - 封面图
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    /**
     * 设置封面图
     *
     * @param coverUrl 封面图
     */
    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    /**
     * 获取可住人数
     *
     * @return livecount - 可住人数
     */
    public Integer getLivecount() {
        return livecount;
    }

    /**
     * 设置可住人数
     *
     * @param livecount 可住人数
     */
    public void setLivecount(Integer livecount) {
        this.livecount = livecount;
    }

    /**
     * 获取押金
     *
     * @return cash - 押金
     */
    public Long getCash() {
        return cash;
    }

    /**
     * 设置押金
     *
     * @param cash 押金
     */
    public void setCash(Long cash) {
        this.cash = cash;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(Long price) {
        this.price = price;
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
     * 获取建筑面积 
     *
     * @return area - 建筑面积 
     */
    public Double getArea() {
        return area;
    }

    /**
     * 设置建筑面积 
     *
     * @param area 建筑面积 
     */
    public void setArea(Double area) {
        this.area = area;
    }

    /**
     * 获取床型
     *
     * @return bedtype - 床型
     */
    public String getBedtype() {
        return bedtype;
    }

    /**
     * 设置床型
     *
     * @param bedtype 床型
     */
    public void setBedtype(String bedtype) {
        this.bedtype = bedtype;
    }

    /**
     * 获取无烟   0 否  1 是
     *
     * @return nosmoke - 无烟   0 否  1 是
     */
    public Integer getNosmoke() {
        return nosmoke;
    }

    /**
     * 设置无烟   0 否  1 是
     *
     * @param nosmoke 无烟   0 否  1 是
     */
    public void setNosmoke(Integer nosmoke) {
        this.nosmoke = nosmoke;
    }

    /**
     * 获取有窗   0 否  1 是
     *
     * @return window - 有窗   0 否  1 是
     */
    public Integer getWindow() {
        return window;
    }

    /**
     * 设置有窗   0 否  1 是
     *
     * @param window 有窗   0 否  1 是
     */
    public void setWindow(Integer window) {
        this.window = window;
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
     * 获取是否早点   0 否  1 是
     *
     * @return breakfast - 是否早点   0 否  1 是
     */
    public Integer getBreakfast() {
        return breakfast;
    }

    /**
     * 设置是否早点   0 否  1 是
     *
     * @param breakfast 是否早点   0 否  1 是
     */
    public void setBreakfast(Integer breakfast) {
        this.breakfast = breakfast;
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

    /**
     * 获取24小时热水   0  无  1 有
     *
     * @return hotwater - 24小时热水   0  无  1 有
     */
    public Integer getHotwater() {
        return hotwater;
    }

    /**
     * 设置24小时热水   0  无  1 有
     *
     * @param hotwater 24小时热水   0  无  1 有
     */
    public void setHotwater(Integer hotwater) {
        this.hotwater = hotwater;
    }

    /**
     * 获取宽带  0  无   1 有
     *
     * @return network - 宽带  0  无   1 有
     */
    public Integer getNetwork() {
        return network;
    }

    /**
     * 设置宽带  0  无   1 有
     *
     * @param network 宽带  0  无   1 有
     */
    public void setNetwork(Integer network) {
        this.network = network;
    }

    /**
     * 获取图片
     *
     * @return image - 图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置图片
     *
     * @param image 图片
     */
    public void setImage(String image) {
        this.image = image;
    }
}