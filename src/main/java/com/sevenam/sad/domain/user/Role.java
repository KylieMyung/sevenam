package com.sevenam.sad.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
//----------------------------------------
//-- Role.java
//-- 각 유저의 권한을 관리할 Enum 클래스
//----------------------------------------
public enum Role {
    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 유저");

    private final String key;
    private final String title;
}
