package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button rest = findViewById(R.id.therest);
        Button send = findViewById(R.id.contact);
        Button call = findViewById(R.id.callme);

        // علشان نرجع لاول صفحة
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this , MainActivity.class);
                startActivity(intent);
            }
        });



         // لفتح برنامج gmail  وارسال ايميل
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                String[] recipients = {"hazemhazemrashad@gmail.com"};//نضيف الايميل الي هنبعتله الرساله
                intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                intent.setType("text/html");
                intent.setPackage("com.google.android.gm");//لفتح البرنامج مباشرةن (اعتبروا النون تنوين لاني مش لاقيه)
                startActivity(Intent.createChooser(intent, "Send mail"));
            }

        });
         // لفتح الهاتف
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
               intent.setData(Uri.parse("tel:12354567")); //تكتب الرقم الي هنرن عليه
               startActivity(intent);
            }
        });







    }

}