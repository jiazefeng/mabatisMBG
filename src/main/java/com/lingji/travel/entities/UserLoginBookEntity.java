package com.lingji.travel.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user_login_book")
public class UserLoginBookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 登录验证码
     */
    @Column(name = "tokenId")
    private String tokenid;

    /**
     * 用户ID
     */
    @Column(name = "userId")
    private Integer userid;

    @Column(name = "createDate")
    private Date createdate;

    /**
     * 0:有效；1：失效
     */
    private Integer state;

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
     * 获取登录验证码
     *
     * @return tokenId - 登录验证码
     */
    public String getTokenid() {
        return tokenid;
    }

    /**
     * 设置登录验证码
     *
     * @param tokenid 登录验证码
     */
    public void setTokenid(String tokenid) {
        this.tokenid = tokenid;
    }

    /**
     * 获取用户ID
     *
     * @return userId - 用户ID
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置用户ID
     *
     * @param userid 用户ID
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return createDate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * 获取0:有效；1：失效
     *
     * @return state - 0:有效；1：失效
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0:有效；1：失效
     *
     * @param state 0:有效；1：失效
     */
    public void setState(Integer state) {
        this.state = state;
    }
}