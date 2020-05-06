@file:JvmName("ActivityUtils")

package com.sanwaku2.memo.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun addFragmentToActivity(fragmentManager: FragmentManager, fragment: Fragment,frameId: Int){
    val transaction = fragmentManager.beginTransaction()
    transaction.add(frameId, fragment)
    transaction.commit()
}

fun addFragmentToActivity(fragmentManager: FragmentManager, fragment: Fragment, tag: String) {
    val transaction = fragmentManager.beginTransaction()
    transaction.add(fragment, tag)
    transaction.commit()
}