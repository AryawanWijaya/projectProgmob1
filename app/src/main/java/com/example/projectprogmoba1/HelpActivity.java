package com.example.projectprogmoba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);// utk load layoutnya
//        TextView myTextView = new TextView(this);//dia buat object textview baru, tanpa load layout, jadi yang ada di layout gk keluar smua, maka harus
        // pakai yangg bawah poll 22-23
        Bundle b = getIntent().getExtras();
        String tempText = b.getString("Help String");

//        myTextView.setText(helpText);
//        setContentView(myTextView);// klo ini kan utk load object tdi tanpa load layout

        TextView textView = findViewById(R.id.textViewCoba);
        textView.setText(tempText);

    }
}
