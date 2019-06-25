package com.jkq.jblog.modules.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Channel implements Serializable {
    private static final long serialVersionUID = -4427867720002002681L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * 名称
     */
    @Column(length = 32)
    private String name;

    /**
     * 唯一关键字
     */
    @Column(name = "key_", unique = true, length = 32)
    private String key;

    /**
     * 预览图
     */
    @Column(length = 128)
    private String thumbnail;

    @Column(length = 5)
    private int status;

    /**
     * 排序值
     */
    private int weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
