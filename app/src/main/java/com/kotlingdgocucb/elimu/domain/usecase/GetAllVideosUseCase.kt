package com.kotlingdgocucb.elimu.domain.usecase

import com.kotlingdgocucb.elimu.data.repository.VideoRepository
import com.kotlingdgocucb.elimu.data.datasource.local.room.entity.Video

class GetAllVideosUseCase(private val repository: VideoRepository) {
    suspend operator fun invoke(): List<Video> = repository.getAllVideos()
}

class GetVideoByIdUseCase(private val repository: VideoRepository) {
    suspend operator fun invoke(id: Int): Video? = repository.getVideoById(id)
}
