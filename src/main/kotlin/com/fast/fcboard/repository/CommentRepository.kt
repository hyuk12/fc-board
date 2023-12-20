package com.fast.fcboard.repository

import com.fast.fcboard.domain.Comment
import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository : JpaRepository<Comment, Long>
