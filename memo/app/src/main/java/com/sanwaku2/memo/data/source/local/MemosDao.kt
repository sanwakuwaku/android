package com.sanwaku2.memo.data.source.local

import androidx.room.*
import com.sanwaku2.memo.data.Memo

@Dao
interface MemosDao {
    @Query("SELECT * FROM memos")
    fun getAll(): List<Memo>

    @Query("SELECT * FROM memos WHERE uid IN (:uids)")
    fun loadByIds(uids: Array<String>): List<Memo>

    @Insert
    fun insertAll(vararg memos: Memo)

    @Update
    fun update(memo: Memo)

    @Query("DELETE FROM memos WHERE uid = :uid")
    fun deleteById(uid: String)
}