package com.sevenam.sad.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
//----------------------------------------
//-- BaseTimeEntity.java
//-- Entity들의 createdDate, modifiedDate를 자동으로 관리
//----------------------------------------
public class BaseTimeEntity {

    @CreatedDate
    private LocalDateTime cretedDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
