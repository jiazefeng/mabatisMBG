package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_module")
public class ModuleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 模块名称
     */
    private String name;

    /**
     * 操作项
     */
    private String actiontype;

    /**
     * 1景区 2酒店 3饭店
     */
    private Integer type;

    /**
     * 上级id
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 排序
     */
    private Integer orderno;

    /**
     * 级别
     */
    private Integer level;

    /**
     * 状态：1启用；0禁用
     */
    private Integer state;

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
     * 执行路径
     */
    private String url;

    /**
     * 图标
     */
    private String icon;

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
     * 获取模块名称
     *
     * @return name - 模块名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置模块名称
     *
     * @param name 模块名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取上级id
     *
     * @return parent_id - 上级id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置上级id
     *
     * @param parentId 上级id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取排序
     *
     * @return orderno - 排序
     */
    public Integer getOrderno() {
        return orderno;
    }

    /**
     * 设置排序
     *
     * @param orderno 排序
     */
    public void setOrderno(Integer orderno) {
        this.orderno = orderno;
    }

    /**
     * 获取级别
     *
     * @return level - 级别
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置级别
     *
     * @param level 级别
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取状态：1启用；0禁用
     *
     * @return state - 状态：1启用；0禁用
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态：1启用；0禁用
     *
     * @param state 状态：1启用；0禁用
     */
    public void setState(Integer state) {
        this.state = state;
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
     * 获取执行路径
     *
     * @return url - 执行路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置执行路径
     *
     * @param url 执行路径
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }
}