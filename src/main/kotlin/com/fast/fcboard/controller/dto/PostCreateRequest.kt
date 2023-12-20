package com.fast.fcboard.controller.dto

import com.fast.fcboard.service.dto.PostCreateRequestDto

data class PostCreateRequest(
    val title: String,
    val content: String,
    val createdBy: String,
)

fun PostCreateRequest.toDto() = PostCreateRequestDto(
    title,
    content,
    createdBy
)
