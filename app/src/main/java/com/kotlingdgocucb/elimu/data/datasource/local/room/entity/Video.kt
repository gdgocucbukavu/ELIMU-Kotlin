package com.kotlingdgocucb.elimu.data.datasource.local.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = "video")
data class Video(
    @PrimaryKey
    val id: Int,
    val youtube_url: String,
    val title: String,
    val order: String,
    val description: String,
    val category: String,
    val mentor_email: String,
    val stars: Float = 0.0f  // Valeur par défaut si le champ est manquant
)
