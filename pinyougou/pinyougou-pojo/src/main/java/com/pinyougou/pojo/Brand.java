package com.pinyougou.pojo;

import java.io.Serializable;

/**
 * 品牌实体         对象序列化可以实现分布式对象
 */
public class Brand implements Serializable{
    // 品牌id
    private long id;
    // 品牌名称
    private String name;
    // 品牌首字母
    private String firstChar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstChar='" + firstChar + '\'' +
                '}';
    }
}
