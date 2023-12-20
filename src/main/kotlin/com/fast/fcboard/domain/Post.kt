package com.fast.fcboard.domain

import com.fast.fcboard.exception.PostNotUpdatableException
import com.fast.fcboard.service.dto.PostUpdateRequestDto
import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class Post(
    createdBy: String,
    title: String,
    content: String,
) : BaseEntity(createdBy) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

    var title: String = title
        private set
    var content: String = content
        private set

    @OneToMany(mappedBy = "post", orphanRemoval = true, cascade = [CascadeType.ALL])
    var comments: MutableList<Comment> = mutableListOf()

    fun update(postUpdateRequestDto: PostUpdateRequestDto) {
        if (postUpdateRequestDto.updatedBy != this.createdBy) {
            throw PostNotUpdatableException()
        }

        this.title = postUpdateRequestDto.title
        this.content = postUpdateRequestDto.content
        super.updatedBy(postUpdateRequestDto.updatedBy)
    }
}
