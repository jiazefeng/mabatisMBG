package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_hotel_comment")
public class HotelCommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 酒店id
     */
    @Column(name = "hotel_id")
    private Integer hotelId;

    /**
     * 房间id
     */
    @Column(name = "room_id")
    private Integer roomId;

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
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 审核状态 0 未审核  1 已审核
     */
    private Integer status;

    /**
     * 是否删除    0 未删除   1 已删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 视频
     */
    private String video;

    /**
     * 位置评分
     */
    @Column(name = "location_score")
    private Integer locationScore;

    /**
     * 清洁度 评分
     */
    @Column(name = "clean_score")
    private Integer cleanScore;

    /**
     * 设施评分
     */
    @Column(name = "facility_score")
    private Integer facilityScore;

    /**
     * 服务评分
     */
    @Column(name = "service_score")
    private Integer serviceScore;

    /**
     * 舒适度评分
     */
    @Column(name = "comfort_score")
    private Integer comfortScore;

    @Column(name = "order_id")
    private String orderId;

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
     * 获取房间id
     *
     * @return room_id - 房间id
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * 设置房间id
     *
     * @param roomId 房间id
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
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
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取审核状态 0 未审核  1 已审核
     *
     * @return status - 审核状态 0 未审核  1 已审核
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置审核状态 0 未审核  1 已审核
     *
     * @param status 审核状态 0 未审核  1 已审核
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取位置评分
     *
     * @return location_score - 位置评分
     */
    public Integer getLocationScore() {
        return locationScore;
    }

    /**
     * 设置位置评分
     *
     * @param locationScore 位置评分
     */
    public void setLocationScore(Integer locationScore) {
        this.locationScore = locationScore;
    }

    /**
     * 获取清洁度 评分
     *
     * @return clean_score - 清洁度 评分
     */
    public Integer getCleanScore() {
        return cleanScore;
    }

    /**
     * 设置清洁度 评分
     *
     * @param cleanScore 清洁度 评分
     */
    public void setCleanScore(Integer cleanScore) {
        this.cleanScore = cleanScore;
    }

    /**
     * 获取设施评分
     *
     * @return facility_score - 设施评分
     */
    public Integer getFacilityScore() {
        return facilityScore;
    }

    /**
     * 设置设施评分
     *
     * @param facilityScore 设施评分
     */
    public void setFacilityScore(Integer facilityScore) {
        this.facilityScore = facilityScore;
    }

    /**
     * 获取服务评分
     *
     * @return service_score - 服务评分
     */
    public Integer getServiceScore() {
        return serviceScore;
    }

    /**
     * 设置服务评分
     *
     * @param serviceScore 服务评分
     */
    public void setServiceScore(Integer serviceScore) {
        this.serviceScore = serviceScore;
    }

    /**
     * 获取舒适度评分
     *
     * @return comfort_score - 舒适度评分
     */
    public Integer getComfortScore() {
        return comfortScore;
    }

    /**
     * 设置舒适度评分
     *
     * @param comfortScore 舒适度评分
     */
    public void setComfortScore(Integer comfortScore) {
        this.comfortScore = comfortScore;
    }

    /**
     * @return order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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