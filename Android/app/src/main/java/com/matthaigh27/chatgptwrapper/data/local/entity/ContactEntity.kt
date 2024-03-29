package com.matthaigh27.chatgptwrapper.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts")
data class ContactEntity(
    @PrimaryKey(autoGenerate = false) val id: String,
    val name: String,
    val phoneNumber: String,
)