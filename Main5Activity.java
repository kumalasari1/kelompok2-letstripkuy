package com.example.kel2.letstripkuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
    private Button btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        btnback = (Button) findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent back = new Intent(Main5Activity.this,Main3Activity.class);
                startActivity(back);
            }
        });
    }
}
