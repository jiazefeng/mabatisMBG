package com.lingji.travel.entities;

import javax.persistence.*;

@Table(name = "tb_restaurant_category_relation")
public class RestaurantCategoryRelationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "restaurant_id")
    private Integer restaurantId;

    @Column(name = "category_id")
    private Integer categoryId;

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
     * @return restaurant_id
     */
    public Integer getRestaurantId() {
        return restaurantId;
    }

    /**
     * @param restaurantId
     */
    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    /**
     * @return category_id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}