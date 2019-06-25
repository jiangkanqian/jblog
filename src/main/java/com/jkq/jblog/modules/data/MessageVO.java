package com.jkq.jblog.modules.data;

import com.jkq.jblog.modules.entity.Message;

public class MessageVO extends Message {
    private UserVO from;
    private PostVO post;

    public UserVO getFrom() {
        return from;
    }

    public void setFrom(UserVO from) {
        this.from = from;
    }

    public PostVO getPost() {
        return post;
    }

    public void setPost(PostVO post) {
        this.post = post;
    }
}
