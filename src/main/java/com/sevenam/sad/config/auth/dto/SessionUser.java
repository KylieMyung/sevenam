package com.sevenam.sad.config.auth.dto;

import com.sevenam.sad.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
//----------------------------------------
//-- SessionUser.java
//-- 소셜 로그인을 통해 인증된 유저 정보 Dto
//----------------------------------------
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
