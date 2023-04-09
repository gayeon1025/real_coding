package com.cnu.real_coding_server.model.request;


import com.cnu.real_coding_server.entity.Post;
import com.cnu.real_coding_server.model.type.Tag;

public record PostRequest(
        String title,
        String contents,
        Tag tag
) {
    public Post toEntity() {
        return Post.builder()
                .title(title)
                .contents(contents)
                .tag(tag)
                .build();
    }
}
