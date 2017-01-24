package com.sample.rojesharunkumar.photocaptureactivity;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button mBtnCapture;
    private ImageView mImagPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnCapture = (Button) findViewById(R.id.btn_caputre);
        mImagPreview = (ImageView) findViewById(R.id.img_camera);


        mBtnCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                captureImage();


            }
        });
    }

    private void captureImage() {
        // Check for permission
        // int permissionCheck = ContextCompat.
        //       checkSelfPermission(this, Manifest.permission.CAMERA);

        // Opening camera
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {

            startActivityForResult(takePictureIntent, 100);
        }


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //Set image
        if (resultCode == Activity.RESULT_OK && requestCode == 100) {

            Bitmap bitmpa = (Bitmap) data.getExtras().get("data");
            mImagPreview.setImageBitmap(bitmpa);


        }

        //
    }
}
