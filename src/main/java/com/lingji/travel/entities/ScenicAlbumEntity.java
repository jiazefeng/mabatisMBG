package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_scenie_album")
public class ScenicAlbumEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 景区ID
     */
    @Column(name = "scenie_id")
    private Integer scenieId;

    /**
     * 图片URL
     */
    @Column(name = "image_url")
    private String imageUrl;

    /**
     * 是否删除    0 未删除   1 已删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 创建时间
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
     * 获取景区ID
     *
     * @return scenie_id - 景区ID
     */
    public Integer getScenieId() {
        return scenieId;
    }

    /**
     * 设置景区ID
     *
     * @param scenieId 景区ID
     */
    public void setScenieId(Integer scenieId) {
        this.scenieId = scenieId;
    }

    /**
     * 获取图片URL
     *
     * @return image_url - 图片URL
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置图片URL
     *
     * @param imageUrl 图片URL
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
     * 获取创建时间
     *
     * @return createdate - 创建时间
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * 设置创建时间
     *
     * @param createdate 创建时间
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
}