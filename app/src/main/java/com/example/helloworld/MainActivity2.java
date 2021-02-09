package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
    ImageView lyrics;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lyrics = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setOnClickListener(this);
        back = (Button) findViewById(R.id.buttonback);
        Button button1 = (Button) findViewById(R.id.buttonback);
        button1.setOnClickListener(this);
    }

        public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView5:
                //Сделать
                Intent intent = new Intent(this,MainActivity3.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (v.getId()) {
            case R.id.buttonback:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }


    }
}

