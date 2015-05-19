package com.company;

/**
 * Created by VAIO on 5/19/2015.
 */
public class Mahasiswa {
    private String Nama;
    private int Umur;

    public Mahasiswa(String nama, int umur){
        Nama = nama ;
        Umur = umur;
    }

    public void setNama(String nama) {
        Nama = nama;
    }
    public String getNama(){
        return Nama;
    }

    public void setUmur(int umur) {
        Umur = umur;
    }
    public int getUmur(){
        return Umur;

    }
    public void tampilkanBiodata(){
        System.out.println("::: BIODATA :::");
        System.out.println("Nama = " + Nama);
        System.out.println("Umur = " + Umur);

    }
}

