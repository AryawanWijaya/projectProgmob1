package com.example.projectprogmoba1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//dipanggil pertama kali
        setContentView(R.layout.activity_main); //1 java hanya bisa pakai 1 xml, tapi 1 xml bisa pnya banyak.. ini dia panggil activity_main.xml

        TextView textView = findViewById(R.id.mainActivityTextView); //R adl kelas yang digenerate olh layout, jadi masuknya di R smua
        Button myBtn = findViewById(R.id.button1);
        Button helpBtn = findViewById(R.id.helpButton);
        Button btnLayout = findViewById(R.id.btnTest);
        Button btnTableLayout = findViewById(R.id.btnTableLayout);
        Button btnProteinTrackerLayout = findViewById(R.id.btnProteinTrackerLayout);
        Button btnFragment = findViewById(R.id.btnFragment);
        Button btnMahasiswa = findViewById(R.id.btnMahasiswa);
        Button btnList = findViewById(R.id.btnList);
        Button btnListMhs = findViewById(R.id.btnListMhs);
        Button btnCardView = findViewById(R.id.btnCardView);
        Button btnCardViewInclass = findViewById(R.id.btnCardViewInclass);
        Button btnCardViewMhs = findViewById(R.id.btnCardViewMhs);


        textView.setText(R.string.test_untuk_update_view); //sama seperti variabel global dia tersimpat di res->value ->string
        myBtn.setOnClickListener(myBtnClickListener);

      /*  myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myEditText = (EditText)findViewById(R.id.editText1);
                Log.d("Proteintracker",myEditText.getText().toString());
            }
        });*/


        helpBtn.setOnClickListener(helpButtonListener);
        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        btnTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TableLayoutActivity.class);
                startActivity(intent);
            }
        });
        btnProteinTrackerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProteinTracker_layout.class);
                startActivity(intent);
            }
        });
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main3FragmentActivity.class);
                startActivity(intent);
            }
        });

        btnMahasiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainMahasiswaActivity.class);
                startActivity(intent);
            }
        });

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        btnListMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListMhsActivity.class);
                startActivity(intent);
            }
        });
        btnCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        btnCardViewInclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InClassRecyclerViewActvity.class);
                startActivity(intent);
            }
        });
        btnCardViewMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TugasRecycleViewActivity.class);
                startActivity(intent);
            }
        });


        if (savedInstanceState != null) { //fungsinya dia itu ngecek kadang klo di rottae hp itu ngerefresh activity trus apa yng sdh ditulis ilang
            //makkannya di simpan di state trus di cek disini, jika sdh ada tulisane maa dia akan ngeluarke tulisane
            Log.d("ProteinTracker", savedInstanceState.getString("abc"));
        }
    }

    //utk menyimpan di state,
    @Override
    protected void onSaveInstanceState(Bundle outState) { //fungsingnya utk simpen nilainya
        super.onSaveInstanceState(outState); //jadi nilainya disimpan di state, trus dipanggil diatas

        outState.putString("abc", "test");// parameternya yg pertama keynya, yg kedua apa yang mau disimpan
        super.onSaveInstanceState(outState);
    }

//nampilin di logcat aja
    private View.OnClickListener myBtnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            EditText myEditText = findViewById(R.id.editText1);
            Log.d("Proteintracker", myEditText.getText().toString());
        }
    };// sama kaya yang di comment diatas, bebas, tapi mending yang diatas lbh cepet


    /*inti metodenya nyimpan nilai di state apa yang tertulis di edittext, dengan kata kunci "Help String" kemudian
    dipanggil pada activity help nilai dari edit text itu utk ditmapilkan*/
    private View.OnClickListener helpButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, HelpActivity.class); //utk pindah activity, parameter adl kelas ini, kelas 7an
            Bundle b = new Bundle();
            EditText myEditText = (EditText) findViewById(R.id.editText1);
            b.putString("Help String", myEditText.getText().toString());
            intent.putExtras(b);

            startActivity(intent);
        }
    };

    //nmpilin icon titik tiga diatas
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    //item selected option menu --> layout diatur di menu1.xml pada bagian folder res->menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item1) {
//            Toast.makeText(getApplicationContext(),"Ini Menu pertama diklik",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, ProteinTracker_layout.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.item2) {
            Intent intent = new Intent(MainActivity.this, MainMahasiswaActivity.class);
            startActivity(intent);
        }else if(item.getItemId()==R.id.item3){
            Intent intent = new Intent(MainActivity.this,ListMhsActivity.class);
            startActivity(intent);
//            Toast.makeText(getApplicationContext(),"Ini Menu ketiga diklik",Toast.LENGTH_SHORT).show();
//        }else if(item.getItemId()==R.id.item4){
//            Toast.makeText(getApplicationContext(),"Ini Menu keempat diklik",Toast.LENGTH_SHORT).show();
//        }
        }
            return true;
        }
}

