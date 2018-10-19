package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_scenie_spot_comment")
public class ScenicSpotCommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 景区id
     */
    @Column(name = "scenie_spot_id")
    private Integer scenieSpotId;

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
     * 图片
     */
    private String image;

    /**
     * 视频
     */
    private String video;

    /**
     * 审核状态  //1 启用  0 禁用
     */
    private Integer status;

    /**
     * 定单id
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 删除 1是0否
     */
    @Column(name = "is_delete")
    private Integer isDelete;

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
     * 获取审核状态  //1 启用  0 禁用
     *
     * @return status - 审核状态  //1 启用  0 禁用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置审核状态  //1 启用  0 禁用
     *
     * @param status 审核状态  //1 启用  0 禁用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取定单id
     *
     * @return order_id - 定单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置定单id
     *
     * @param orderId 定单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取删除 1是0否
     *
     * @return is_delete - 删除 1是0否
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置删除 1是0否
     *
     * @param isDelete 删除 1是0否
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}