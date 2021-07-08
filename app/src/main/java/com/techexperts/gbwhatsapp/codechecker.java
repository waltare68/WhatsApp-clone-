package com.techexperts.gbwhatsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class codechecker extends AppCompatActivity {
    private Button btn;
    private EditText txt1;
    private EditText txt2;
    private EditText txt3;
    private EditText txt4;
    private EditText txt5;
    private EditText txt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codechecker);
        txt1=findViewById(R.id.inputcode1);
        txt2=findViewById(R.id.inputcode2);
        txt3=findViewById(R.id.inputcode3);
        txt4=findViewById(R.id.inputcode4);
        txt5=findViewById(R.id.inputcode5);
        txt6=findViewById(R.id.inputcode6);

        txt1.setText("5");
        txt2.setText("5");
        txt3.setText("0");
        txt4.setText("3");
        txt5.setText("9");
        txt6.setText("8");

        btn=findViewById(R.id.verifyCode);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(codechecker.this,profileViewer.class);
                startActivity(intent);
            }
        });
    }
}