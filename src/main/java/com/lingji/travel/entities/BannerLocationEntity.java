package com.lingji.travel.entities;

import javax.persistence.*;

@Table(name = "tb_banner_location")
public class BannerLocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 序号 1-1
     */
    private String num;

    /**
     * 名称
     */
    private String name;

    /**
     * 位置图片
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
     * 获取序号 1-1
     *
     * @return num - 序号 1-1
     */
    public String getNum() {
        return num;
    }

    /**
     * 设置序号 1-1
     *
     * @param num 序号 1-1
     */
    public void setNum(String num) {
        this.num = num;
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
     * 获取位置图片
     *
     * @return image - 位置图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置位置图片
     *
     * @param image 位置图片
     */
    public void setImage(String image) {
        this.image = image;
    }
}