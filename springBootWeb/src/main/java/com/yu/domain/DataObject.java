package com.yu.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created By Yu On 2018/9/14
 * Description：
 **/
@MappedSuperclass
public class DataObject {
    @Id
    @GeneratedValue
    @Column(updatable = false)
    private Integer id;
    @Column(updatable = false)
    private Date createTime;
    private Date editTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        if (editTime == null)
            return createTime;
        return editTime;
    }

    @PrePersist
    public void prePersist() {
        createTime = new Date();
    }

    @PreUpdate
    public void preUpdate() {
        editTime = new Date();
    }
}
