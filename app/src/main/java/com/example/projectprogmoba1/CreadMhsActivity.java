package com.example.projectprogmoba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreadMhsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cread_mhs);
        Button btnSimpanMhs = findViewById(R.id.btnSimpanMhs);

        btnSimpanMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreadMhsActivity.this,ListMhsActivity.class);
                startActivity(intent);
            }
        });
    }
}
