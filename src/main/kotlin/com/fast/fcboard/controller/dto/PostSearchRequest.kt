package com.fast.fcboard.controller.dto

import com.fast.fcboard.service.dto.PostSearchRequestDto
import org.springframework.web.bind.annotation.RequestParam

data class PostSearchRequest(
    @RequestParam
    val title: String?,
    @RequestParam
    val createdBy: String?,
)

fun PostSearchRequest.toDto() = PostSearchRequestDto(
    title,
    createdBy
)
