package com.fast.fcboard.domain;

@jakarta.persistence.Entity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058\u0006@BX\u0087\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/fast/fcboard/domain/Comment;", "Lcom/fast/fcboard/domain/BaseEntity;", "content", "", "post", "Lcom/fast/fcboard/domain/Post;", "createdBy", "(Ljava/lang/String;Lcom/fast/fcboard/domain/Post;Ljava/lang/String;)V", "<set-?>", "getContent", "()Ljava/lang/String;", "id", "", "getId", "()J", "getPost", "()Lcom/fast/fcboard/domain/Post;", "update", "", "commentUpdateRequestDto", "Lcom/fast/fcboard/service/dto/CommentUpdateRequestDto;", "fc-board"})
public final class Comment extends com.fast.fcboard.domain.BaseEntity {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private java.lang.String content;
    @jakarta.persistence.ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @org.jetbrains.annotations.NotNull
    private com.fast.fcboard.domain.Post post;
    
    public Comment(@org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.NotNull
    com.fast.fcboard.domain.Post post, @org.jetbrains.annotations.NotNull
    java.lang.String createdBy) {
        super(null);
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    com.fast.fcboard.service.dto.CommentUpdateRequestDto commentUpdateRequestDto) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.fast.fcboard.domain.Post getPost() {
        return null;
    }
}