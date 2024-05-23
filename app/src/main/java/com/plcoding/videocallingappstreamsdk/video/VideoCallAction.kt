package com.plcoding.videocallingappstreamsdk.video

sealed interface VideoCallAction {
    data object OnDisconnectClick: VideoCallAction
    data object JoinCall: VideoCallAction
}