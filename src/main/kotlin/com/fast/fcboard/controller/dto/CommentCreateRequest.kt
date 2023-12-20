package com.fast.fcboard.controller.dto

import com.fast.fcboard.service.dto.CommentCreateRequestDto

data class CommentCreateRequest(
    val content: String,
    val createdBy: String,
)

fun CommentCreateRequest.toDto() = CommentCreateRequestDto(
    content,
    createdBy
)
