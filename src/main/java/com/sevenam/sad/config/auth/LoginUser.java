package com.sevenam.sad.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
//----------------------------------------
//-- LoginUser.java
//-- @LoginUser 어노테이션 생성 클래스
//----------------------------------------
public @interface LoginUser {
}

