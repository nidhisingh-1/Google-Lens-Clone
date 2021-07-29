package com.example.nidhi.google_lensclone.imageLabeling

import androidx.core.content.ContextCompat
import com.example.nidhi.google_lensclone.BaseLensActivity

class ImageLabelingActivity : BaseLensActivity() {
    override val imageAnalyzer = ImageAnalyzer(this)

    override fun startScanner() {
        labelImage()
    }

    private fun labelImage(){
        imageAnalysis.setAnalyzer(ContextCompat.getMainExecutor(this),imageAnalyzer)
    }
}