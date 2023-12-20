package com.fast.fcboard.domain

import com.fast.fcboard.exception.CommentNotUpdatableException
import com.fast.fcboard.service.dto.CommentUpdateRequestDto
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne

@Entity
class Comment(
    content: String,
    post: Post,
    createdBy: String,
) : BaseEntity(createdBy = createdBy) {

    fun update(commentUpdateRequestDto: CommentUpdateRequestDto) {
        if (commentUpdateRequestDto.updatedBy != this.createdBy) {
            throw CommentNotUpdatableException()
        }
        this.content = commentUpdateRequestDto.content
        super.updatedBy(commentUpdateRequestDto.updatedBy)
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

    var content: String = content
        private set

    @ManyToOne(fetch = FetchType.LAZY)
    var post: Post = post
        private set
}
