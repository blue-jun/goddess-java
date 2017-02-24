package com.bjike.goddess.user.session.authcode;

import java.time.LocalDateTime;


/**
 * 验证码定时失效辅助工具实体
 *
 * @Author: [liguiqin]
 * @Date: [2016-11-23 15:47]
 * @Description: ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class AuthCode {
    /**
     * 创建时间
     */
    private LocalDateTime createTime = LocalDateTime.now();
    /**
     * 设置独立的失效时间(分钟)
     */
    private Integer invalidTime;
    /**
     * 验证码
     */
    private String code;

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(Integer invalidTime) {
        this.invalidTime = invalidTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
