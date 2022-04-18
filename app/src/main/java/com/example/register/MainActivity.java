package com.example.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("  Account");
        actionBar.setLogo(R.drawable.ic_baseline_account_box_24);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        Button btn=findViewById(R.id.button);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            // 2
            NotificationChannel channelId = new
                    NotificationChannel("Notification",
                    "MyNotification",NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager
                    manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channelId);
        }


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message="This is notification you received";
                NotificationCompat.Builder builder=new

                        NotificationCompat.Builder(MainActivity.this,"Notification")

                        .setSmallIcon(R.drawable.ic_baseline_notifications_24)
                        .setContentTitle("Google Notification")
                        .setContentText("You have received a notification ....")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        .setAutoCancel(true);
                NotificationManager mgr= (NotificationManager)
                        getSystemService(Context.NOTIFICATION_SERVICE);
                mgr.notify(1,builder.build());
            }
        });
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()) {
            case R.id.registration:
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "Exit",
                        Toast.LENGTH_SHORT).show();
            case R.id.userdetails:
                Toast.makeText(getApplicationContext(), "Exit",
                        Toast.LENGTH_SHORT).show();
            case R.id.refresh:
                Toast.makeText(getApplicationContext(), "Exit",
                        Toast.LENGTH_SHORT).show();
            case R.id.search:
                Toast.makeText(getApplicationContext(), "Exit",
                        Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
