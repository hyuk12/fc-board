package com.fast.fcboard.controller;

@org.springframework.web.bind.annotation.RestController
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0017J\u001c\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u001c\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017\u00a8\u0006\u000f"}, d2 = {"Lcom/fast/fcboard/controller/CommentController;", "", "()V", "createComment", "", "postId", "commentCreateRequest", "Lcom/fast/fcboard/controller/dto/CommentCreateRequest;", "deleteComment", "commentId", "deletedBy", "", "updateComment", "commentUpdateRequest", "Lcom/fast/fcboard/controller/dto/CommentUpdateRequest;", "fc-board"})
public class CommentController {
    
    public CommentController() {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/posts/{postId}/comments"})
    public long createComment(@org.springframework.web.bind.annotation.PathVariable
    long postId, @org.springframework.web.bind.annotation.RequestBody
    @org.jetbrains.annotations.NotNull
    com.fast.fcboard.controller.dto.CommentCreateRequest commentCreateRequest) {
        return 0L;
    }
    
    @org.springframework.web.bind.annotation.PutMapping(value = {"/comments/{commentId}"})
    public long updateComment(@org.springframework.web.bind.annotation.PathVariable
    long commentId, @org.springframework.web.bind.annotation.RequestBody
    @org.jetbrains.annotations.NotNull
    com.fast.fcboard.controller.dto.CommentUpdateRequest commentUpdateRequest) {
        return 0L;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/comments/{commentId}"})
    public long deleteComment(@org.springframework.web.bind.annotation.PathVariable
    long commentId, @org.springframework.web.bind.annotation.RequestParam
    @org.jetbrains.annotations.NotNull
    java.lang.String deletedBy) {
        return 0L;
    }
}