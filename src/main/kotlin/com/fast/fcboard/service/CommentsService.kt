package com.fast.fcboard.service

import com.fast.fcboard.exception.CommentNotDeletableException
import com.fast.fcboard.exception.CommentNotFoundException
import com.fast.fcboard.exception.PostNotFoundException
import com.fast.fcboard.repository.CommentRepository
import com.fast.fcboard.repository.PostRepository
import com.fast.fcboard.service.dto.CommentCreateRequestDto
import com.fast.fcboard.service.dto.CommentUpdateRequestDto
import com.fast.fcboard.service.dto.toEntity
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class CommentsService(
    private val commentRepository: CommentRepository,
    private val postRepository: PostRepository,
) {

    @Transactional
    fun createComment(postId: Long, createRequestDto: CommentCreateRequestDto): Long {
        val post = postRepository.findByIdOrNull(postId) ?: throw PostNotFoundException()
        return commentRepository.save(createRequestDto.toEntity(post)).id
    }

    @Transactional
    fun updateComment(id: Long, commentUpdateRequestDto: CommentUpdateRequestDto): Long {
        val comment = commentRepository.findByIdOrNull(id) ?: throw CommentNotFoundException()
        comment.update(commentUpdateRequestDto)
        return comment.id
    }

    @Transactional
    fun deleteComment(id: Long, deletedBy: String): Long {
        val comment = commentRepository.findByIdOrNull(id) ?: throw CommentNotFoundException()
        if (comment.createdBy != deletedBy) {
            throw CommentNotDeletableException()
        }
        commentRepository.delete(comment)
        return id
    }
}
