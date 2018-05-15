package com.example.kel2.letstripkuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    private Button btnhome;
    private Button btnske;
    private Button btnjog;
    private Button btntaman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnhome = (Button) findViewById(R.id.btnhome);
        btnhome.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent home = new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(home);
            }
        });
        btnske = (Button) findViewById(R.id.btnske);
        btnske.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent ske = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(ske);
            }
        });
        btnjog = (Button) findViewById(R.id.btnjog);
        btnjog.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent jogja = new Intent(Main3Activity.this,Main5Activity.class);
                startActivity(jogja);
            }
        });
        btntaman = (Button) findViewById(R.id.btntaman);
        btntaman.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent taman = new Intent(Main3Activity.this,Main6Activity.class);
                startActivity(taman);
            }
        });
    }
}
