package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 修改时间
     */
    private Date modifytime;

    /**
     * 创建人
     */
    private Integer createuser;

    /**
     * 修改人
     */
    private Integer modifyuser;

    /**
     * 0：正常；1：删除
     */
    private Integer state;

    /**
     * 1  是超级管理 0 其他类型
     */
    private Integer issuper;

    /**
     * 等级
     */
    private Integer degree;

    /**
     * 1景区 2酒店 3饭店
     */
    private Integer type;

    /**
     * 对应关联id
     */
    private Integer fid;

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
     * 获取角色名称
     *
     * @return name - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取修改时间
     *
     * @return modifytime - 修改时间
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * 设置修改时间
     *
     * @param modifytime 修改时间
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    /**
     * 获取创建人
     *
     * @return createuser - 创建人
     */
    public Integer getCreateuser() {
        return createuser;
    }

    /**
     * 设置创建人
     *
     * @param createuser 创建人
     */
    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    /**
     * 获取修改人
     *
     * @return modifyuser - 修改人
     */
    public Integer getModifyuser() {
        return modifyuser;
    }

    /**
     * 设置修改人
     *
     * @param modifyuser 修改人
     */
    public void setModifyuser(Integer modifyuser) {
        this.modifyuser = modifyuser;
    }

    /**
     * 获取0：正常；1：删除
     *
     * @return state - 0：正常；1：删除
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0：正常；1：删除
     *
     * @param state 0：正常；1：删除
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取1  是超级管理 0 其他类型
     *
     * @return issuper - 1  是超级管理 0 其他类型
     */
    public Integer getIssuper() {
        return issuper;
    }

    /**
     * 设置1  是超级管理 0 其他类型
     *
     * @param issuper 1  是超级管理 0 其他类型
     */
    public void setIssuper(Integer issuper) {
        this.issuper = issuper;
    }

    /**
     * 获取等级
     *
     * @return degree - 等级
     */
    public Integer getDegree() {
        return degree;
    }

    /**
     * 设置等级
     *
     * @param degree 等级
     */
    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    /**
     * 获取1景区 2酒店 3饭店
     *
     * @return type - 1景区 2酒店 3饭店
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1景区 2酒店 3饭店
     *
     * @param type 1景区 2酒店 3饭店
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取对应关联id
     *
     * @return fid - 对应关联id
     */
    public Integer getFid() {
        return fid;
    }

    /**
     * 设置对应关联id
     *
     * @param fid 对应关联id
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }
}