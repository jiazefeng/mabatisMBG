package com.lingji.travel.entities;

import javax.persistence.*;

@Table(name = "tb_banner_location_relation")
public class BannerLocationRelationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 广告位ID
     */
    @Column(name = "banner_id")
    private Integer bannerId;

    /**
     * 广告位位置ID
     */
    @Column(name = "banner_location_id")
    private Integer bannerLocationId;

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
     * 获取广告位ID
     *
     * @return banner_id - 广告位ID
     */
    public Integer getBannerId() {
        return bannerId;
    }

    /**
     * 设置广告位ID
     *
     * @param bannerId 广告位ID
     */
    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    /**
     * 获取广告位位置ID
     *
     * @return banner_location_id - 广告位位置ID
     */
    public Integer getBannerLocationId() {
        return bannerLocationId;
    }

    /**
     * 设置广告位位置ID
     *
     * @param bannerLocationId 广告位位置ID
     */
    public void setBannerLocationId(Integer bannerLocationId) {
        this.bannerLocationId = bannerLocationId;
    }
}