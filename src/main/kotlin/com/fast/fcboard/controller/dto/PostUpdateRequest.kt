package com.fast.fcboard.controller.dto

import com.fast.fcboard.service.dto.PostUpdateRequestDto

data class PostUpdateRequest(
    val title: String,
    val content: String,
    val updatedBy: String,
)

fun PostUpdateRequest.toDto() = PostUpdateRequestDto(
    title,
    content,
    updatedBy
)
