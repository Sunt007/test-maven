package com.sunt.ext.lifecycle

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.OnLifecycleEvent

/**
 * 作者　: sun
 * 时间　: 20120/1/7
 * 描述　:
 */
object KtxAppLifeObserver : LifecycleObserver {

    var isForeground = MutableLiveData<Boolean>()

    //在前台
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private  fun onForeground() {
        isForeground.value = true
    }

    //在后台
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private fun onBackground() {
        isForeground.value = false
    }

}