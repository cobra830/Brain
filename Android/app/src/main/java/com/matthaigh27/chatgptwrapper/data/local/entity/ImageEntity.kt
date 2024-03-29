package com.matthaigh27.chatgptwrapper.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "images")
data class ImageEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val path: String,
    val name: String,
    val dataModified: Long
)