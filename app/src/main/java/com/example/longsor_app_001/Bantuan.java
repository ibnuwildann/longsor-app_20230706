package com.example.longsor_app_001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Bantuan extends AppCompatActivity {

    private ImageView buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan);

        this.buttonback = (ImageView) findViewById(R.id.back);
        this.buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bantuan.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}