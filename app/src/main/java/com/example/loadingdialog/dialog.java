package com.example.loadingdialog;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.LayoutInflater;
import android.widget.ProgressBar;


public class dialog {
    private Activity activity;  // 2 objects activity and dialog
    private AlertDialog dialog;


    dialog(Activity myActivity){   //constructor of dialog class with parameter activity
        activity=myActivity; // connecting activities

    }
    @SuppressLint("InflateParams")
    void startLoadingdialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);  // adding ALERT Dialog builder object and pasing activity as parameter
        LayoutInflater inflater = activity.getLayoutInflater(); // layoutinflater object and use activity to get layout inflater
        builder.setView(inflater.inflate(R.layout.loading,null));
        builder.setCancelable(true);

        dialog = builder.create();
        dialog.show();
    }

    void dismissdialog(){    // dismiss method

        dialog.dismiss();
    }




}
