package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_ticket")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 票据分类id
     */
    @Column(name = "ticket_category_id")
    private Integer ticketCategoryId;

    /**
     * 景区ID
     */
    @Column(name = "scenie_spot_id")
    private Integer scenieSpotId;

    /**
     * 标题
     */
    private String title;

    /**
     * 副标题
     */
    private String subtitle;

    /**
     * 二维码背景图
     */
    @Column(name = "qrcode_bgimg")
    private String qrcodeBgimg;

    /**
     * 市场价
     */
    private Double marketprice;

    /**
     * 成人价
     */
    private Double price;

    /**
     * 儿童价
     */
    private Double childprice;

    /**
     * 图片
     */
    private String image;

    /**
     * 描述
     */
    private String description;

    /**
     * 排序号
     */
    private Integer orderno;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * type:1,开始日期
     */
    @Column(name = "begin_time")
    private Date beginTime;

    /**
     * type:2,结束日期
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 浏览次数
     */
    private Integer viewcount;

    /**
     * 标签
     */
    private String labels;

    /**
     * 上下架状态   0 下架  1 上架
     */
    private Integer status;

    /**
     * 允许使用人数
     */
    private Integer allowperoson;

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

    private String pictures;

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
     * 获取票据分类id
     *
     * @return ticket_category_id - 票据分类id
     */
    public Integer getTicketCategoryId() {
        return ticketCategoryId;
    }

    /**
     * 设置票据分类id
     *
     * @param ticketCategoryId 票据分类id
     */
    public void setTicketCategoryId(Integer ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    /**
     * 获取景区ID
     *
     * @return scenie_spot_id - 景区ID
     */
    public Integer getScenieSpotId() {
        return scenieSpotId;
    }

    /**
     * 设置景区ID
     *
     * @param scenieSpotId 景区ID
     */
    public void setScenieSpotId(Integer scenieSpotId) {
        this.scenieSpotId = scenieSpotId;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取副标题
     *
     * @return subtitle - 副标题
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * 设置副标题
     *
     * @param subtitle 副标题
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * 获取二维码背景图
     *
     * @return qrcode_bgimg - 二维码背景图
     */
    public String getQrcodeBgimg() {
        return qrcodeBgimg;
    }

    /**
     * 设置二维码背景图
     *
     * @param qrcodeBgimg 二维码背景图
     */
    public void setQrcodeBgimg(String qrcodeBgimg) {
        this.qrcodeBgimg = qrcodeBgimg;
    }

    /**
     * 获取市场价
     *
     * @return marketprice - 市场价
     */
    public Double getMarketprice() {
        return marketprice;
    }

    /**
     * 设置市场价
     *
     * @param marketprice 市场价
     */
    public void setMarketprice(Double marketprice) {
        this.marketprice = marketprice;
    }

    /**
     * 获取成人价
     *
     * @return price - 成人价
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置成人价
     *
     * @param price 成人价
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取儿童价
     *
     * @return childprice - 儿童价
     */
    public Double getChildprice() {
        return childprice;
    }

    /**
     * 设置儿童价
     *
     * @param childprice 儿童价
     */
    public void setChildprice(Double childprice) {
        this.childprice = childprice;
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

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
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
     * 获取库存
     *
     * @return stock - 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取type:1,开始日期
     *
     * @return begin_time - type:1,开始日期
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * 设置type:1,开始日期
     *
     * @param beginTime type:1,开始日期
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * 获取type:2,结束日期
     *
     * @return end_time - type:2,结束日期
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置type:2,结束日期
     *
     * @param endTime type:2,结束日期
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取浏览次数
     *
     * @return viewcount - 浏览次数
     */
    public Integer getViewcount() {
        return viewcount;
    }

    /**
     * 设置浏览次数
     *
     * @param viewcount 浏览次数
     */
    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    /**
     * 获取标签
     *
     * @return labels - 标签
     */
    public String getLabels() {
        return labels;
    }

    /**
     * 设置标签
     *
     * @param labels 标签
     */
    public void setLabels(String labels) {
        this.labels = labels;
    }

    /**
     * 获取上下架状态   0 下架  1 上架
     *
     * @return status - 上下架状态   0 下架  1 上架
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置上下架状态   0 下架  1 上架
     *
     * @param status 上下架状态   0 下架  1 上架
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取允许使用人数
     *
     * @return allowperoson - 允许使用人数
     */
    public Integer getAllowperoson() {
        return allowperoson;
    }

    /**
     * 设置允许使用人数
     *
     * @param allowperoson 允许使用人数
     */
    public void setAllowperoson(Integer allowperoson) {
        this.allowperoson = allowperoson;
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
     * @return pictures
     */
    public String getPictures() {
        return pictures;
    }

    /**
     * @param pictures
     */
    public void setPictures(String pictures) {
        this.pictures = pictures;
    }
}