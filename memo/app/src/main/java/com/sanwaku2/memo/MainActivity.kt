package com.sanwaku2.memo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sanwaku2.memo.dummy.DummyContent
import com.sanwaku2.memo.util.addFragmentToActivity

class MainActivity : AppCompatActivity() , MemoListFragment.OnListFragmentInteractionListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val memoListFragment = MemoListFragment.newInstance(1)
        addFragmentToActivity(supportFragmentManager, memoListFragment, R.id.fragment_container)
    }

    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
    }
}
