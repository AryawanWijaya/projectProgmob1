package com.example.projectprogmoba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//dipanggil pertama kali
        setContentView(R.layout.activity_main); //1 java hanya bisa pakai 1 xml, tapi 1 xml bisa pnya banyak.. ini dia panggil activity_main.xml

        TextView textView = findViewById(R.id.mainActivityTextView); //R adl kelas yang digenerate olh layout, jadi masuknya di R smua


        textView.setText(R.string.test_untuk_update_view); //sama seperti variabel global
        Button myBtn = findViewById(R.id.button1);
        myBtn.setOnClickListener(myBtnClickListener);

      /*  myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myEditText = (EditText)findViewById(R.id.editText1);
                Log.d("Proteintracker",myEditText.getText().toString());
            }
        });*/
        Button helpBtn =findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);

        Button btnLayout = findViewById(R.id.btnTest);
        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        if (savedInstanceState !=null){ //fungsinya dia itu ngecek kadang klo di rottae hp itu ngerefresh activity trus apa yng sdh ditulis ilang
            //makkannya di simpan di state trus di cek disini, jika sdh ada tulisane maa dia akan ngeluarke tulisane
            Log.d("ProteinTracker",savedInstanceState.getString("abc"));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) { //fungsingnya utk simpen nilainya
        super.onSaveInstanceState(outState); //jadi nilainya disimpan di state, trus dipanggil diatas

        outState.putString("abc","test");// parameternya yg pertama keynya, yg kedua apa yang mau disimpan
        super.onSaveInstanceState(outState);
    }




    private View.OnClickListener myBtnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            EditText myEditText = findViewById(R.id.editText1);
            Log.d("Proteintracker",myEditText.getText().toString());
        }
    };// sama kaya yang di comment diatas, bebas, tapi mending yang diatas lbh cepet

    private  View.OnClickListener helpButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,HelpActivity.class); //utk pindah activity, parameter adl kelas ini, kelas 7an
            Bundle b = new Bundle();
            EditText myEditText = (EditText)findViewById(R.id.editText1);
            b.putString("Help String",myEditText.getText().toString());
            intent.putExtras(b);

            startActivity(intent);
        }
    };
}
