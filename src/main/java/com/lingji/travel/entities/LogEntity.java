package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_log")
public class LogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建日期
     */
    private Date createtime;

    /**
     * ip地址
     */
    private String ip;

    /**
     * 登录人
     */
    private Integer createuser;

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
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取创建日期
     *
     * @return createtime - 创建日期
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建日期
     *
     * @param createtime 创建日期
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取ip地址
     *
     * @return ip - ip地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置ip地址
     *
     * @param ip ip地址
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取登录人
     *
     * @return createuser - 登录人
     */
    public Integer getCreateuser() {
        return createuser;
    }

    /**
     * 设置登录人
     *
     * @param createuser 登录人
     */
    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }
}