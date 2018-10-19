package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_restaurant_comment")
public class RestaurantCommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 饭店id
     */
    @Column(name = "restaurant_id")
    private Integer restaurantId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 评价等级
     */
    private Integer score;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 创建日期
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 审核状态   0 未审核   1 已审核
     */
    private Integer status;

    /**
     * 视频
     */
    private String video;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 口味评分
     */
    @Column(name = "taste_score")
    private Integer tasteScore;

    /**
     * 卫生 评分
     */
    @Column(name = "sanitation_score")
    private Integer sanitationScore;

    /**
     * 是否删除    0 未删除   1 已删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

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
     * 获取饭店id
     *
     * @return restaurant_id - 饭店id
     */
    public Integer getRestaurantId() {
        return restaurantId;
    }

    /**
     * 设置饭店id
     *
     * @param restaurantId 饭店id
     */
    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取评价等级
     *
     * @return score - 评价等级
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置评价等级
     *
     * @param score 评价等级
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content;
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
     * 获取审核状态   0 未审核   1 已审核
     *
     * @return status - 审核状态   0 未审核   1 已审核
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置审核状态   0 未审核   1 已审核
     *
     * @param status 审核状态   0 未审核   1 已审核
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取口味评分
     *
     * @return taste_score - 口味评分
     */
    public Integer getTasteScore() {
        return tasteScore;
    }

    /**
     * 设置口味评分
     *
     * @param tasteScore 口味评分
     */
    public void setTasteScore(Integer tasteScore) {
        this.tasteScore = tasteScore;
    }

    /**
     * 获取卫生 评分
     *
     * @return sanitation_score - 卫生 评分
     */
    public Integer getSanitationScore() {
        return sanitationScore;
    }

    /**
     * 设置卫生 评分
     *
     * @param sanitationScore 卫生 评分
     */
    public void setSanitationScore(Integer sanitationScore) {
        this.sanitationScore = sanitationScore;
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