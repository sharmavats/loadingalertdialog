package com.example.loadingdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login_btn = findViewById(R.id.button);  //
        final dialog loadingdialog = new dialog(MainActivity.this); // creating object of Loadingdialog class and passing MainActivity as argument

        login_btn.setOnClickListener(new View.OnClickListener() { // onclicklistener imlementation
            @Override
            public void onClick(View v) {
                loadingdialog.startLoadingdialog();//invoking startLoadingDialog method
                Handler handler = new Handler(); // using handler class to set time delay methods
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loadingdialog.dismissdialog(); // after 4 seconds
                        Intent i = new Intent(MainActivity.this,finished.class);
                        startActivity(i); // starting finished activity
                    }
                }, 4000); // 4 seconds
            } //invoking startLoadingDialog method
        });
    }
}
/*
view.setOnClickListener(new View.OnClickListener() { // on click listener for view
            @Override
            public void onClick(View view) {
                Progressbutton progressbutton = new Progressbutton(MainActivity.this,view);

                progressbutton.buttonActivated();
                Handler handler = new Handler(); // using handler class to set time delay methods
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressbutton.buttonFinished();
                    }
                }, 3000); // 3 seconds
            }
        });
 */