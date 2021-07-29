package com.example.nidhi.google_lensclone.barcode


import androidx.core.content.ContextCompat
import com.example.nidhi.google_lensclone.BaseLensActivity


class BarcodeActivity : BaseLensActivity() {

    override val imageAnalyzer = BarcodeAnalyzer()
    override fun startScanner() {
        scanBarcode()
    }

    private fun scanBarcode() {

        imageAnalysis.setAnalyzer(
            ContextCompat.getMainExecutor(this),
            imageAnalyzer
        )

    }

}