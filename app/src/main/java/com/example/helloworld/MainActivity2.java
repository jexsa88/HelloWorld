package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
    ImageView lyrics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lyrics = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);

        imageView5.setOnClickListener(this);
    }
        public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView5:
                //Сделать
                Intent intent = new Intent(this,MainActivity2.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}

