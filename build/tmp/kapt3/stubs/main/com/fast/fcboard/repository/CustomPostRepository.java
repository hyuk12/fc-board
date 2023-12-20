package com.fast.fcboard.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/fast/fcboard/repository/CustomPostRepository;", "", "findPageBy", "Lorg/springframework/data/domain/Page;", "Lcom/fast/fcboard/domain/Post;", "pageRequest", "Lorg/springframework/data/domain/Pageable;", "postSearchRequestDto", "Lcom/fast/fcboard/service/dto/PostSearchRequestDto;", "fc-board"})
public abstract interface CustomPostRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract org.springframework.data.domain.Page<com.fast.fcboard.domain.Post> findPageBy(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageRequest, @org.jetbrains.annotations.NotNull
    com.fast.fcboard.service.dto.PostSearchRequestDto postSearchRequestDto);
}