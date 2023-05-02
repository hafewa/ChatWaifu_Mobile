package com.chatwaifu.lipsync

class LipSyncJNI {

    /**
     * A native method that is implemented by the 'lipsync' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    external fun ovrLipSync_Initialize(sampleSize: Int, bufferSize: Int)

    external fun ovrLipSync_CreateContextEx(sampleSize: Int, enableAcceleration: Boolean): Int

    external fun ovrLipSync_ProcessFrame(sampleSize: Int, data: FloatArray, dataSize: Int): Array<String>

    companion object {
        // Used to load the 'lipsync' library on application startup.
        init {
            System.loadLibrary("lipsync")
        }
    }
}