package com.example.facedetection

import android.app.Application
import android.content.Context
import com.google.firebase.FirebaseApp

class FaceDetectionApp : Application() {
    lateinit var mContext: Context
    lateinit var mInstance: FaceDetectionApp
    private val TAG: String = FaceDetectionApp::class.java.getName()
    override fun onCreate() {
        super.onCreate()
        mContext = this
        mInstance = this
        FirebaseApp.initializeApp(mContext)

    }

    fun getAppContext(): Context? {
        return mContext
    }

    fun getInstance(): FaceDetectionApp? {
        return mInstance
    }
}