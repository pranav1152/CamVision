package com.example.camvision.barcode

import androidx.core.content.ContextCompat
import com.example.camvision.BaseLensActivity

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