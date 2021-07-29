package com.example.nidhi.google_lensclone.faceDetection


import androidx.camera.core.CameraSelector
import androidx.core.content.ContextCompat
import com.example.nidhi.google_lensclone.BaseLensActivity

class FaceDetectActivity : BaseLensActivity() {
    override val imageAnalyzer = FaceDetectAnalyzer()

    override fun startScanner() {
        detectFace()
    }

    private fun detectFace() {
        imageAnalysis.setAnalyzer(ContextCompat.getMainExecutor(this),imageAnalyzer)
    }

    override fun startCamera(){
        cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA
        super.startCamera()
    }
}
