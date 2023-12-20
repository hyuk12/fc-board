package com.fast.fcboard.service.dto

import com.fast.fcboard.domain.Comment
import com.fast.fcboard.domain.Post

data class CommentCreateRequestDto(
    val content: String,
    val createdBy: String,

)

fun CommentCreateRequestDto.toEntity(post: Post) = Comment(
    content,
    post,
    createdBy
)
