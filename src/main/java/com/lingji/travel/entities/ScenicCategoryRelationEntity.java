package com.lingji.travel.entities;

import javax.persistence.*;

@Table(name = "tb_scenie_category_relation")
public class ScenicCategoryRelationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 分类id
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 景区id
     */
    @Column(name = "scenie_spot_id")
    private Integer scenieSpotId;

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
     * 获取分类id
     *
     * @return category_id - 分类id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置分类id
     *
     * @param categoryId 分类id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取景区id
     *
     * @return scenie_spot_id - 景区id
     */
    public Integer getScenieSpotId() {
        return scenieSpotId;
    }

    /**
     * 设置景区id
     *
     * @param scenieSpotId 景区id
     */
    public void setScenieSpotId(Integer scenieSpotId) {
        this.scenieSpotId = scenieSpotId;
    }
}