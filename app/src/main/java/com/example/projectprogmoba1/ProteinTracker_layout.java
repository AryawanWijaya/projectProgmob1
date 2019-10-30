package com.example.projectprogmoba1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
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
    }
}
