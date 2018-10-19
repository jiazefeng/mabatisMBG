package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_banner")
public class BannerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标题
     */
    private String name;

    /**
     * 图片
     */
    private String image;

    /**
     * 位置 
     */
    private Integer type;

    /**
     * 创建日期
     */
    private Date createdate;

    /**
     * 排序号
     */
    private Integer orderno;

    /**
     * 0:启用；1：不可用
     */
    private Integer state;

    /**
     * 图片链接
     */
    private String url;

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
     * 获取标题
     *
     * @return name - 标题
     */
    public String getName() {
        return name;
    }

    /**
     * 设置标题
     *
     * @param name 标题
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取位置 
     *
     * @return type - 位置 
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置位置 
     *
     * @param type 位置 
     */
    public void setType(Integer type) {
        this.type = type;
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
     * 获取0:启用；1：不可用
     *
     * @return state - 0:启用；1：不可用
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0:启用；1：不可用
     *
     * @param state 0:启用；1：不可用
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取图片链接
     *
     * @return url - 图片链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片链接
     *
     * @param url 图片链接
     */
    public void setUrl(String url) {
        this.url = url;
    }
}