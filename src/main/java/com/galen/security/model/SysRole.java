package com.galen.security.model;

import java.io.Serializable;

/**
 * 角色表
 *
 * @author wcyong
 * @date 2019-03-21
 */
public class SysRole implements Serializable {
    private Long id;
    private String name;
    private String nameZh;

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}