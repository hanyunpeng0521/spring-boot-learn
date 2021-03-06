package com.hyp.learn.wf.dto;

/**
 * @author hyp
 * Project name is spring-boot-learn
 * Include in com.hyp.learn.w.dto
 * hyp create at 19-12-22
 **/
/**
 * 用户添加 DTO
 */
public class UserAddDTO {

    /**
     * 账号
     */
    private String username;
    /**
     * 密码
     */
    private String password;

    public String getUsername() {
        return username;
    }

    public UserAddDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserAddDTO setPassword(String password) {
        this.password = password;
        return this;
    }

}
