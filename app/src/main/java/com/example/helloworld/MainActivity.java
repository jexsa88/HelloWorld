package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;

import java.net.SocketAddress;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnActTwo;
    private EditText mname;

    private DatabaseReference mDataBase;
    private String MUSIC_KEY = "Music";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
//        init();


    }

//    public void init() {
//        mname = findViewById(R.id.mname);
//    }

    public void onClickBtn2(View view) {

    }

    public void onClickBtn3(View view) {

    }

    public void onClickBtn4(View view) {

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                //Сделать
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}