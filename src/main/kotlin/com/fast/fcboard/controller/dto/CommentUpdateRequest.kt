package com.fast.fcboard.controller.dto

import com.fast.fcboard.service.dto.CommentUpdateRequestDto

data class CommentUpdateRequest(
    val content: String,
    val updatedBy: String,
)

fun CommentUpdateRequest.toDto() = CommentUpdateRequestDto(
    content,
    updatedBy
)
