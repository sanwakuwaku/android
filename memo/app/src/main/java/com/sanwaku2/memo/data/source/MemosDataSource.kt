package com.sanwaku2.memo.data.source

import com.sanwaku2.memo.data.Memo

interface MemosDataSource {
    interface LoadMemosCallback {
        fun onMemoLoaded(memos: List<Memo>)
        fun onDataNotAvailable();
    }

    interface GetMemoCallback {
        fun onMemoLoaded(memo: Memo)
        fun onDataNotAvailable()
    }

    fun getMemos(callback: LoadMemosCallback)

    fun getMemo(callback: GetMemoCallback)

    fun saveMemo(memo: Memo)

    fun deleteMemo(uid: String)
}