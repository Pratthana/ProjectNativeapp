package com.pratthana.foodforv100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void btn2Click(View view) {
        Button btn7 = (Button)findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent Mbtn7 = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(Mbtn7);

            }
        });

    }
}