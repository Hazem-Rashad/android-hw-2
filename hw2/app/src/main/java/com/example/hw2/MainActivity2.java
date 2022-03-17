package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textname = findViewById(R.id.bethename);
        TextView textage = findViewById(R.id.betheage);
        TextView textjob = findViewById(R.id.bethejob);
        TextView textnum = findViewById(R.id.bethenum);
        TextView textemail = findViewById(R.id.betheemail);
        Button submit = findViewById(R.id.button2);

        Bundle bundle = getIntent().getExtras();

        String finallname = bundle.getString("name");
        String finallage = bundle.getString("age");
        String finalljob = bundle.getString("job");
        String finallnum = bundle.getString("number");
        String finallemail = bundle.getString("e-mail");

        textname.setText(finallname);
        textage.setText(finallage);
        textjob.setText(finalljob);
        textnum.setText(finallnum);
        textemail.setText(finallemail);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this , MainActivity3.class);
                startActivity(intent);
            }
        });


    }
}