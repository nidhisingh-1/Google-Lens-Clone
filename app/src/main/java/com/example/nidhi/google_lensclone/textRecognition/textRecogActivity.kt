package com.example.nidhi.google_lensclone.textRecognition


import androidx.core.content.ContextCompat

import com.example.nidhi.google_lensclone.BaseLensActivity

class textRecogActivity : BaseLensActivity() {
    override val imageAnalyzer = textAnalyzer(this)

    override fun startScanner() {
        recognizeText()
    }

    private fun recognizeText() {
        imageAnalysis.setAnalyzer(ContextCompat.getMainExecutor(this),imageAnalyzer)
    }
}