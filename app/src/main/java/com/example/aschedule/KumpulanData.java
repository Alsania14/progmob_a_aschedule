package com.example.aschedule;

public class KumpulanData {
    String nama, isi;

    public KumpulanData() {
    }

    public KumpulanData(String nama, String isi) {
        this.nama = nama;
        this.isi = isi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
