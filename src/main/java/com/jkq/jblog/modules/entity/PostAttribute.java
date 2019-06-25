package com.jkq.jblog.modules.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mto_post_attribute")
public class PostAttribute implements Serializable {
    private static final long serialVersionUID = 7770861917123813135L;

    @Id
    private long id;

    @Column(length = 16, columnDefinition = "varchar(16) default 'tinymce'")
    private String editor;

    /**
     * 内容
     */
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Type(type="text")
    private String content; // 内容

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
