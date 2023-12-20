package com.fast.fcboard.domain;

@jakarta.persistence.Entity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/fast/fcboard/domain/Post;", "Lcom/fast/fcboard/domain/BaseEntity;", "createdBy", "", "title", "content", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "comments", "", "Lcom/fast/fcboard/domain/Comment;", "getComments", "()Ljava/util/List;", "setComments", "(Ljava/util/List;)V", "<set-?>", "getContent", "()Ljava/lang/String;", "id", "", "getId", "()J", "getTitle", "update", "", "postUpdateRequestDto", "Lcom/fast/fcboard/service/dto/PostUpdateRequestDto;", "fc-board"})
public final class Post extends com.fast.fcboard.domain.BaseEntity {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull
    private java.lang.String content;
    @jakarta.persistence.OneToMany(mappedBy = "post", orphanRemoval = true, cascade = {jakarta.persistence.CascadeType.ALL})
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.fast.fcboard.domain.Comment> comments;
    
    public Post(@org.jetbrains.annotations.NotNull
    java.lang.String createdBy, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String content) {
        super(null);
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.fast.fcboard.domain.Comment> getComments() {
        return null;
    }
    
    public final void setComments(@org.jetbrains.annotations.NotNull
    java.util.List<com.fast.fcboard.domain.Comment> p0) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    com.fast.fcboard.service.dto.PostUpdateRequestDto postUpdateRequestDto) {
    }
}