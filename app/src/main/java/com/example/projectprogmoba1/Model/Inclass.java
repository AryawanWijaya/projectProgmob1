package com.example.projectprogmoba1.Model;

public class Inclass {
    private int AndroidImage;
    private String namaInclass;
    private String nimInclass;
    private String noHpInclass;

    public Inclass(int androidImage, String namaInclass, String nimInclass, String noHpInclass) {
        AndroidImage = androidImage;
        this.namaInclass = namaInclass;
        this.nimInclass = nimInclass;
        this.noHpInclass = noHpInclass;
    }

    public int getAndroidImage() {
        return AndroidImage;
    }

    public void setAndroidImage(int androidImage) {
        AndroidImage = androidImage;
    }

    public String getNamaInclass() {
        return namaInclass;
    }

    public void setNamaInclass(String namaInclass) {
        this.namaInclass = namaInclass;
    }

    public String getNimInclass() {
        return nimInclass;
    }

    public void setNimInclass(String nimInclass) {
        this.nimInclass = nimInclass;
    }

    public String getNoHpInclass() {
        return noHpInclass;
    }

    public void setNoHpInclass(String noHpInclass) {
        this.noHpInclass = noHpInclass;
    }
}
