package com.yu.domain;

import javax.persistence.Entity;

/**
 * Created By Yu On 2018/9/14
 * Description：
 **/
@Entity
public class User extends DataObject{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
