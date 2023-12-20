package com.fast.fcboard.service

import com.fast.fcboard.exception.PostNotDeletableException
import com.fast.fcboard.exception.PostNotFoundException
import com.fast.fcboard.repository.PostRepository
import com.fast.fcboard.service.dto.PostCreateRequestDto
import com.fast.fcboard.service.dto.PostDetailResponseDto
import com.fast.fcboard.service.dto.PostSearchRequestDto
import com.fast.fcboard.service.dto.PostSummaryResponseDto
import com.fast.fcboard.service.dto.PostUpdateRequestDto
import com.fast.fcboard.service.dto.toDetailResponseDto
import com.fast.fcboard.service.dto.toEntity
import com.fast.fcboard.service.dto.toSummaryResponseDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class PostService(
    private val postRepository: PostRepository,
) {

    @Transactional
    fun createPost(postCreateRequestDto: PostCreateRequestDto): Long {
        return postRepository.save(postCreateRequestDto.toEntity()).id
    }

    @Transactional
    fun updatePost(id: Long, requestDto: PostUpdateRequestDto): Long {
        val post = postRepository.findByIdOrNull(id) ?: throw PostNotFoundException()
        post.update(requestDto)
        return id
    }

    @Transactional
    fun deletePost(id: Long, deletedBy: String): Long {
        val post = postRepository.findByIdOrNull(id) ?: throw PostNotFoundException()
        if (post.createdBy != deletedBy) throw PostNotDeletableException()
        postRepository.delete(post)
        return id
    }

    fun getPost(id: Long): PostDetailResponseDto {
        return postRepository.findByIdOrNull(id)?.toDetailResponseDto() ?: throw PostNotFoundException()
    }

    fun findPageBy(pageRequest: Pageable, postSearchRequestDto: PostSearchRequestDto): Page<PostSummaryResponseDto> {
        return postRepository.findPageBy(pageRequest, postSearchRequestDto).toSummaryResponseDto()
    }
}
