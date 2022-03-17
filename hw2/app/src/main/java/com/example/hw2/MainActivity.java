package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText name = findViewById(R.id.thename);
        EditText age = findViewById(R.id.theage);
        EditText job = findViewById(R.id.thejob);
        EditText number = findViewById(R.id.thephone);
        EditText email = findViewById(R.id.theemail);
        Button next = findViewById(R.id.button1);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().isEmpty() || age.getText().toString().isEmpty() || job.getText().toString().isEmpty() || number.getText().toString().isEmpty() || email.getText().toString().isEmpty() ){

                    // toast...
                    Toast.makeText(MainActivity.this, "please don't leave any field's empty",Toast.LENGTH_LONG).show();

                }else {
                    String dataname = name.getText().toString();
                    String dataage = age.getText().toString();
                    String datajob = job.getText().toString();
                    String datanumber = number.getText().toString();
                    String dataemail = email.getText().toString();

                    Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                    intent.putExtra("name", dataname);
                    intent.putExtra("age", dataage);
                    intent.putExtra("job", datajob);
                    intent.putExtra("number", datanumber);
                    intent.putExtra("e-mail", dataemail);


                    startActivity(intent);
                }


            }


        });
    }
}