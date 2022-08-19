package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view){
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(this);

        alertDialogBuilder.setMessage("누를꺼야?");

        alertDialogBuilder.setPositiveButton("응!",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Main_Activity.this, "눌렀당!", Toast.LENGTH_SHORT).show();
                    }
                });

        alertDialogBuilder.setNegativeButton("싫엉",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int j) {
                        Toast.makeText(Main_Activity.this, "취소했당!", Toast.LENGTH_SHORT).show();
                    }
                });

        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }
    }