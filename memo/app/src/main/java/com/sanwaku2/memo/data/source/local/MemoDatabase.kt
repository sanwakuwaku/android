package com.sanwaku2.memo.data.source.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sanwaku2.memo.data.Memo

@Database(entities = arrayOf(Memo::class), version = 1)
abstract class MemoDatabase : RoomDatabase() {
    abstract fun memoDao(): MemosDao

    companion object {
        private var instance: MemoDatabase? = null

        fun getInstance(context: Context) = instance ?: synchronized(this) {
            instance ?: Room.databaseBuilder(
                context.applicationContext,
                MemoDatabase::class.java, "Memos.db").build()
                .also { instance = it }
        }
    }
}