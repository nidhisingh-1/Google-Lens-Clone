package com.example.nidhi.google_lensclone


import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import com.example.nidhi.google_lensclone.barcode.BarcodeActivity
import com.example.nidhi.google_lensclone.faceDetection.FaceDetectActivity
import com.example.nidhi.google_lensclone.imageLabeling.ImageLabelingActivity
import com.example.nidhi.google_lensclone.textRecognition.textRecogActivity
import kotlinx.android.synthetic.main.activity_main.*

const val OPEN_CAMERA_REQUEST_CODE = 1234
const val PHOTO_EXTRAS = "data"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTakeExtPhoto.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, OPEN_CAMERA_REQUEST_CODE)
        }

        btnCameraActivity.setOnClickListener{
            startActivity(Intent(this,CameraActivity::class.java))
        }

        btnBarcodeActivity.setOnClickListener{
            startActivity(Intent(this, BarcodeActivity::class.java))
        }

        btnFaceDetectActivity.setOnClickListener{
            startActivity(Intent(this, FaceDetectActivity::class.java))
        }

        btnLabelerActivity.setOnClickListener{
            startActivity(Intent(this, ImageLabelingActivity::class.java))
        }

        btnTextRecogActivity.setOnClickListener{
            startActivity(Intent(this, textRecogActivity::class.java))
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(resultCode == RESULT_OK && requestCode== OPEN_CAMERA_REQUEST_CODE){
            val bitmap = data?.extras?.get(PHOTO_EXTRAS) as Bitmap
            imgThumb.setImageBitmap(bitmap)
            imgThumb.visibility = View.VISIBLE
            return
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}