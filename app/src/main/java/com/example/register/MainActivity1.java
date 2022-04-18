package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {
    EditText user,course,branch,year;
    EditText email;
    EditText number;
    String num;
    Button login,dial,call,camera,mail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        user=findViewById(R.id.user);
        email=findViewById(R.id.email);
        number=findViewById(R.id.num);
        course=findViewById(R.id.course);
        branch=findViewById(R.id.branch);
        year=findViewById(R.id.year);

        login=findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity1.this,MainActivity2.class);
                String user1=user.getText().toString();
                String pass1=email.getText().toString();
                String c1=course.getText().toString();
                String b1=branch.getText().toString();
                String y1=year.getText().toString();
                String ph=number.getText().toString();
                intent.putExtra("user",user1);
                intent.putExtra("email",pass1);
                intent.putExtra("number",ph);
                intent.putExtra("course",c1);
                intent.putExtra("branch",b1);
                intent.putExtra("year",y1);
                startActivity(intent);

            }
        });













    }
}
