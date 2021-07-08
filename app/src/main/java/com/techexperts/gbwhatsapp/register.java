package com.techexperts.gbwhatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hbb20.CountryCodePicker;

import org.w3c.dom.Text;

public class register extends AppCompatActivity {
    private Button btn;
    //private EditText edit_text;
    // private CountryCodePicker ccp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn=findViewById(R.id.phonenumber);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel channel =new NotificationChannel("Notification","GBWhatsApp", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager =getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(register.this,codechecker.class);
                startActivity(intent);


                //grab grabber will ensure that code gets incomplete whe done

                NotificationCompat.Builder builder=new NotificationCompat.Builder(register.this,"Notification");
                builder.setContentTitle("GBWhatsApp");
                builder.setContentText("Your Verification Code is 550398");
                builder.setSmallIcon(R.drawable.icons);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat=NotificationManagerCompat.from(register.this);
                managerCompat.notify(1,builder.build());

            }
        });


    }


}