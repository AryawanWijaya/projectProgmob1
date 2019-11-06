package com.example.projectprogmoba1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProteinTracker_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proteintracker_layout);
        Button resetButton = findViewById(R.id.btnReset);
        Button btnSetting = findViewById(R.id.btnSetting);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //utk buat custom dialog isinya mau ada tulisan apa aja, trus pilihan apa aja
                AlertDialog.Builder builder = new AlertDialog.Builder(ProteinTracker_layout.this);

                builder.setMessage("Apakah anda yakin ingin mereset nilai protein ?")
                        .setNegativeButton("No", new DialogInterface.OnClickListener(){
                            public void onClick (DialogInterface dialog, int which ){
                                Toast.makeText(ProteinTracker_layout.this, "Tidak jadi reset",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(ProteinTracker_layout.this, "Melakukan reset",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                //setelah jadi dialogboxnya apa aja trus dia baru dibuatkan dialognya, ditempelkan yang tadi kita buat
                //dengan cara dibawah ini, klo langsung allert dialog dia cmn isa 1 button dan 1 text tanpa custom
                AlertDialog dialog=builder.create();
                dialog.show();
            }
        });

        SharedPreferences prefs = ProteinTracker_layout.this.getSharedPreferences("prefs_file",MODE_PRIVATE);
        String statusLogin = prefs.getString("isLogin",null);
        Button btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(myBtnLoginClick);
        if (statusLogin != null){
            btnLogin.setText("Logout");
        }else{
            btnLogin.setText("Login"); }

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProteinTracker_layout.this, SettingProteinTracker.class);
                startActivity(intent);
            }
        });


    }

    private View.OnClickListener myBtnLoginClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SharedPreferences prefs = ProteinTracker_layout.this.getSharedPreferences("prefs_file",MODE_PRIVATE);
            String statusLogin = prefs.getString("isLogin",null);
            SharedPreferences.Editor edit = prefs.edit();

            Button btnLogin = (Button)findViewById(R.id.btnLogin);
            if (statusLogin != null){
                edit.putString("isLogin",null);
                btnLogin.setText("Login");
            }else{
                edit.putString("isLogin","Admin");
                btnLogin.setText("Logout");
            }
            edit.commit();
        }
    };
}
