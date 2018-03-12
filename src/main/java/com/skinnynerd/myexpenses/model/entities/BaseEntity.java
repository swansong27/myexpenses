package com.skinnynerd.myexpenses.model.entities;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass // мэппинг применяется к потомкам, не создается таблица
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue
    private UUID id;

    @CreatedDate
    private Date createdDate;

    @CreatedBy
    private User createdBy;

    @LastModifiedDate
    private Date modifiedDate;

    @LastModifiedBy
    private User modifiedBy;
}
