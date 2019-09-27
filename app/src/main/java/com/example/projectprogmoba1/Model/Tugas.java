package com.example.projectprogmoba1.Model;

public class Tugas {
    private int fotoTemen;
    private String namaTemen;
    private String nimTemen;
    private String genderTemen;
    private String hobiTemen;
    private String citaCitaTemen;
    private String motoTemen;

    public Tugas(int fotoTemen, String namaTemen, String nimTemen, String genderTemen, String hobiTemen, String citaCitaTemen, String motoTemen) {
        this.fotoTemen = fotoTemen;
        this.namaTemen = namaTemen;
        this.nimTemen = nimTemen;
        this.genderTemen = genderTemen;
        this.hobiTemen = hobiTemen;
        this.citaCitaTemen = citaCitaTemen;
        this.motoTemen = motoTemen;
    }

    public int getFotoTemen() {
        return fotoTemen;
    }

    public void setFotoTemen(int fotoTemen) {
        this.fotoTemen = fotoTemen;
    }

    public String getNamaTemen() {
        return namaTemen;
    }

    public void setNamaTemen(String namaTemen) {
        this.namaTemen = namaTemen;
    }

    public String getNimTemen() {
        return nimTemen;
    }

    public void setNimTemen(String nimTemen) {
        this.nimTemen = nimTemen;
    }

    public String getGenderTemen() {
        return genderTemen;
    }

    public void setGenderTemen(String genderTemen) {
        this.genderTemen = genderTemen;
    }

    public String getHobiTemen() {
        return hobiTemen;
    }

    public void setHobiTemen(String hobiTemen) {
        this.hobiTemen = hobiTemen;
    }

    public String getCitaCitaTemen() {
        return citaCitaTemen;
    }

    public void setCitaCitaTemen(String citaCitaTemen) {
        this.citaCitaTemen = citaCitaTemen;
    }

    public String getMotoTemen() {
        return motoTemen;
    }

    public void setMotoTemen(String motoTemen) {
        this.motoTemen = motoTemen;
    }
}
