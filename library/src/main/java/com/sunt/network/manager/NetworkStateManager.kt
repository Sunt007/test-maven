package com.sunt.network.manager

import com.sunt.callback.EventLiveData

/**
 * 作者　: sun
 * 时间　: 2022/5/2
 * 描述　: 网络变化管理者
 */
class NetworkStateManager private constructor() {

    val mNetworkStateCallback = EventLiveData<NetState>()

    companion object {
        val instance: NetworkStateManager by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            NetworkStateManager()
        }
    }

}