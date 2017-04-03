package com.apps.my.arture.model;

/**
 * Created by iwan koswara on 13/03/2017.
 */

public class Provinsi {

    private int gambarProv;
    private String namaProv;

    public Provinsi(int gambarProv, String namaProv) {
        this.gambarProv = gambarProv;
        this.namaProv = namaProv;
    }

    public Provinsi(String namaProv) {
        this.namaProv = namaProv;
    }

    public Provinsi() {
    }

    public int getGambarProv() {
        return gambarProv;
    }

    public void setGambarProv(int gambarProv) {
        this.gambarProv = gambarProv;
    }

    public String getNamaProv() {
        return namaProv;
    }

    public void setNamaProv(String namaProv) {
        this.namaProv = namaProv;
    }
}
