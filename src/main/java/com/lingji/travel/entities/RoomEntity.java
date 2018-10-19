package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_room")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 酒店id
     */
    @Column(name = "hotel_id")
    private Integer hotelId;

    /**
     * 房间类型id
     */
    @Column(name = "roomtype_id")
    private Integer roomtypeId;

    /**
     * 楼层id
     */
    @Column(name = "floor_id")
    private Integer floorId;

    /**
     * 房间号
     */
    private String roomnumber;

    /**
     * 电话分机
     */
    private String tel;

    /**
     * 是否发布   0 未发布  1已发布
     */
    private Integer status;

    /**
     * 房间状态   0：正常  1：已住  2：待清理  3：禁用
     */
    private Integer roomstatus;

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

    /**
     * 描述
     */
    private String description;

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
     * 获取房间类型id
     *
     * @return roomtype_id - 房间类型id
     */
    public Integer getRoomtypeId() {
        return roomtypeId;
    }

    /**
     * 设置房间类型id
     *
     * @param roomtypeId 房间类型id
     */
    public void setRoomtypeId(Integer roomtypeId) {
        this.roomtypeId = roomtypeId;
    }

    /**
     * 获取楼层id
     *
     * @return floor_id - 楼层id
     */
    public Integer getFloorId() {
        return floorId;
    }

    /**
     * 设置楼层id
     *
     * @param floorId 楼层id
     */
    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    /**
     * 获取房间号
     *
     * @return roomnumber - 房间号
     */
    public String getRoomnumber() {
        return roomnumber;
    }

    /**
     * 设置房间号
     *
     * @param roomnumber 房间号
     */
    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber;
    }

    /**
     * 获取电话分机
     *
     * @return tel - 电话分机
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话分机
     *
     * @param tel 电话分机
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取是否发布   0 未发布  1已发布
     *
     * @return status - 是否发布   0 未发布  1已发布
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置是否发布   0 未发布  1已发布
     *
     * @param status 是否发布   0 未发布  1已发布
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取房间状态   0：正常  1：已住  2：待清理  3：禁用
     *
     * @return roomstatus - 房间状态   0：正常  1：已住  2：待清理  3：禁用
     */
    public Integer getRoomstatus() {
        return roomstatus;
    }

    /**
     * 设置房间状态   0：正常  1：已住  2：待清理  3：禁用
     *
     * @param roomstatus 房间状态   0：正常  1：已住  2：待清理  3：禁用
     */
    public void setRoomstatus(Integer roomstatus) {
        this.roomstatus = roomstatus;
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
}