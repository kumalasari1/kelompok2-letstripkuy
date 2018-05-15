package com.example.kel2.letstripkuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button buttonwisata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        buttonwisata = (Button) findViewById(R.id.btnwisata);
        buttonwisata.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent wisata = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(wisata);
            }
        });

    }
}
