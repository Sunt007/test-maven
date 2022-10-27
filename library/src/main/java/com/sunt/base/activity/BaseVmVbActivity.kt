package com.sunt.base.activity

import android.view.View
import androidx.viewbinding.ViewBinding
import com.sunt.base.viewmodel.BaseViewModel
import com.sunt.ext.inflateBindingWithGeneric

/**
 * 作者　: sun
 * 时间　: 2021/12/12
 * 描述　: 包含 ViewModel 和 ViewBinding ViewModelActivity基类，把ViewModel 和 ViewBinding 注入进来了
 * 需要使用 ViewBinding 的清继承它
 */
abstract class BaseVmVbActivity<VM : BaseViewModel, VB : ViewBinding> : BaseVmActivity<VM>() {

    override fun layoutId(): Int = 0

    lateinit var mViewBind: VB

    /**
     * 创建DataBinding
     */
    override fun initDataBind(): View? {
        mViewBind = inflateBindingWithGeneric(layoutInflater)
        return mViewBind.root

    }
}