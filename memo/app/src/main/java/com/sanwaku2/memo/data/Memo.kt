package com.sanwaku2.memo.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memos")
data class Memo(
    @PrimaryKey val uid:String,
    val title:String?,
    val body:String?
)