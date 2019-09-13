package com.example.projectprogmoba1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainMahasiswaActivity extends AppCompatActivity
            implements MahasiswaFragment.KirimPesan, Fragment_mahasiswa2.dariMhs2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mahasiswa);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        MahasiswaFragment mahasiswaFragment = MahasiswaFragment.newInstance("","");// klo cmn mau panggil fagment gmn carane ?
        ft.replace(R.id.frameMhs,mahasiswaFragment);
        ft.commit();
    }

    @Override
    public void kirimData(String a) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment_mahasiswa2 mahasiswaFragment = Fragment_mahasiswa2.newInstance("","");
        ft.replace(R.id.frameMhs,mahasiswaFragment);
        ft.commit();
    }

    @Override
    public void kirimData2(String a) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        MahasiswaFragment mahasiswaFragment = MahasiswaFragment.newInstance("","");// klo cmn mau panggil fagment gmn carane ?
        ft.replace(R.id.frameMhs,mahasiswaFragment);
        ft.commit();
    }
}
