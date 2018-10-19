package com.lingji.travel.entities;

import javax.persistence.*;

@Table(name = "tb_role_module")
public class RoleModuleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "module_id")
    private Integer moduleId;

    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 操作项
     */
    private String actiontype;

    /**
     * 是否半选择 0：是；1：否
     */
    @Column(name = "isHalf")
    private Integer ishalf;

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
     * @return module_id
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * @param moduleId
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取操作项
     *
     * @return actiontype - 操作项
     */
    public String getActiontype() {
        return actiontype;
    }

    /**
     * 设置操作项
     *
     * @param actiontype 操作项
     */
    public void setActiontype(String actiontype) {
        this.actiontype = actiontype;
    }

    /**
     * 获取是否半选择 0：是；1：否
     *
     * @return isHalf - 是否半选择 0：是；1：否
     */
    public Integer getIshalf() {
        return ishalf;
    }

    /**
     * 设置是否半选择 0：是；1：否
     *
     * @param ishalf 是否半选择 0：是；1：否
     */
    public void setIshalf(Integer ishalf) {
        this.ishalf = ishalf;
    }
}