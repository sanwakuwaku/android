package com.sanwaku2.memo.data.source.local

import com.sanwaku2.memo.data.Memo
import com.sanwaku2.memo.data.source.MemosDataSource

class MemosLocalDataSource : MemosDataSource {
    var memosDao :MemosDao
    var appExecutors: AppExecutors

    override fun getMemos(callback: MemosDataSource.LoadMemosCallback) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMemo(callback: MemosDataSource.GetMemoCallback) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun saveMemo(memo: Memo) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteMemo(uid: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}