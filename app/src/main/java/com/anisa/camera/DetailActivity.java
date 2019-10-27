package com.anisa.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_BAND_NAME = "extra_band_name";
    public static final String EXTRA_BAND_DETAIL = "extra_band_detail";
    public static final String EXTRA_BAND_GENRE = "extra_band_genre";
    public static final String EXTRA_BAND_IMAGE = "extra_band_image";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView ivBandImage;
        TextView tvBandName, tvBandDetail, tvBandGenre;

        ivBandImage = findViewById(R.id.img_band_photo);
        tvBandName = findViewById(R.id.tv_band_name);
        tvBandGenre = findViewById(R.id.tv_band_genre);
        tvBandDetail = findViewById(R.id.tv_band_detail);

        int image = getIntent().getIntExtra(EXTRA_BAND_IMAGE, 0);
        String name = getIntent().getStringExtra(EXTRA_BAND_NAME),
                genre = getIntent().getStringExtra(EXTRA_BAND_GENRE),
                detail = getIntent().getStringExtra(EXTRA_BAND_DETAIL);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), image);
        ivBandImage.setImageBitmap(bitmap);
        tvBandName.setText(name);
        tvBandGenre.setText(genre);
        tvBandDetail.setText(detail);
    }
}
