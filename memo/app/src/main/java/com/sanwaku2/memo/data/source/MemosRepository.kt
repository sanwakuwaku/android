package com.sanwaku2.memo.data.source

import com.sanwaku2.memo.data.Memo

class MemosRepository: MemosDataSource{
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