package com.fast.fcboard.service;

@org.springframework.stereotype.Service
@org.springframework.transaction.annotation.Transactional(readOnly = true)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/fast/fcboard/service/CommentsService;", "", "commentRepository", "Lcom/fast/fcboard/repository/CommentRepository;", "postRepository", "Lcom/fast/fcboard/repository/PostRepository;", "(Lcom/fast/fcboard/repository/CommentRepository;Lcom/fast/fcboard/repository/PostRepository;)V", "createComment", "", "postId", "createRequestDto", "Lcom/fast/fcboard/service/dto/CommentCreateRequestDto;", "deleteComment", "id", "deletedBy", "", "updateComment", "commentUpdateRequestDto", "Lcom/fast/fcboard/service/dto/CommentUpdateRequestDto;", "fc-board"})
public class CommentsService {
    @org.jetbrains.annotations.NotNull
    private final com.fast.fcboard.repository.CommentRepository commentRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.fast.fcboard.repository.PostRepository postRepository = null;
    
    public CommentsService(@org.jetbrains.annotations.NotNull
    com.fast.fcboard.repository.CommentRepository commentRepository, @org.jetbrains.annotations.NotNull
    com.fast.fcboard.repository.PostRepository postRepository) {
        super();
    }
    
    @org.springframework.transaction.annotation.Transactional
    public long createComment(long postId, @org.jetbrains.annotations.NotNull
    com.fast.fcboard.service.dto.CommentCreateRequestDto createRequestDto) {
        return 0L;
    }
    
    @org.springframework.transaction.annotation.Transactional
    public long updateComment(long id, @org.jetbrains.annotations.NotNull
    com.fast.fcboard.service.dto.CommentUpdateRequestDto commentUpdateRequestDto) {
        return 0L;
    }
    
    @org.springframework.transaction.annotation.Transactional
    public long deleteComment(long id, @org.jetbrains.annotations.NotNull
    java.lang.String deletedBy) {
        return 0L;
    }
}