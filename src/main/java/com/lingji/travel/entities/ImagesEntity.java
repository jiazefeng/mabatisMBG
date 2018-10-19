package com.lingji.travel.entities;

import javax.persistence.*;

@Table(name = "tb_images")
public class ImagesEntity {
    /**
     * 图片ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 原图路径
     */
    @Column(name = "originalImagePath")
    private String originalimagepath;

    /**
     * 压缩图片路径
     */
    @Column(name = "compressImagePath")
    private String compressimagepath;

    /**
     * 剪切图片路径
     */
    @Column(name = "cutImagePath")
    private String cutimagepath;

    /**
     * 0：已删除；1：正常
     */
    private Integer state;

    /**
     * 图片类型
     */
    @Column(name = "imageType")
    private String imagetype;

    /**
     * 获取图片ID
     *
     * @return id - 图片ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置图片ID
     *
     * @param id 图片ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取原图路径
     *
     * @return originalImagePath - 原图路径
     */
    public String getOriginalimagepath() {
        return originalimagepath;
    }

    /**
     * 设置原图路径
     *
     * @param originalimagepath 原图路径
     */
    public void setOriginalimagepath(String originalimagepath) {
        this.originalimagepath = originalimagepath;
    }

    /**
     * 获取压缩图片路径
     *
     * @return compressImagePath - 压缩图片路径
     */
    public String getCompressimagepath() {
        return compressimagepath;
    }

    /**
     * 设置压缩图片路径
     *
     * @param compressimagepath 压缩图片路径
     */
    public void setCompressimagepath(String compressimagepath) {
        this.compressimagepath = compressimagepath;
    }

    /**
     * 获取剪切图片路径
     *
     * @return cutImagePath - 剪切图片路径
     */
    public String getCutimagepath() {
        return cutimagepath;
    }

    /**
     * 设置剪切图片路径
     *
     * @param cutimagepath 剪切图片路径
     */
    public void setCutimagepath(String cutimagepath) {
        this.cutimagepath = cutimagepath;
    }

    /**
     * 获取0：已删除；1：正常
     *
     * @return state - 0：已删除；1：正常
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0：已删除；1：正常
     *
     * @param state 0：已删除；1：正常
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取图片类型
     *
     * @return imageType - 图片类型
     */
    public String getImagetype() {
        return imagetype;
    }

    /**
     * 设置图片类型
     *
     * @param imagetype 图片类型
     */
    public void setImagetype(String imagetype) {
        this.imagetype = imagetype;
    }
}