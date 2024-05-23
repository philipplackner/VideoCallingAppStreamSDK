package com.plcoding.videocallingappstreamsdk.di

import com.plcoding.videocallingappstreamsdk.VideoCallingApp
import com.plcoding.videocallingappstreamsdk.connect.ConnectViewModel
import com.plcoding.videocallingappstreamsdk.video.VideoCallViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    factory {
        val app = androidContext().applicationContext as VideoCallingApp
        app.client
    }

    viewModelOf(::ConnectViewModel)
    viewModelOf(::VideoCallViewModel)
}