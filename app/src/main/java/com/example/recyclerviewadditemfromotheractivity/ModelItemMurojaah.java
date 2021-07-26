package com.example.recyclerviewadditemfromotheractivity;

public class ModelItemMurojaah {

    private String noMurojaah;
    private String namaSurat;
    private String halamanSurat;

    public ModelItemMurojaah(String noMurojaah, String namaSurat, String halamanSurat) {
        this.noMurojaah = noMurojaah;
        this.namaSurat = namaSurat;
        this.halamanSurat = halamanSurat;
    }

    public String getNoMurojaah() {
        return noMurojaah;
    }

    public void setNoMurojaah(String noMurojaah) {
        this.noMurojaah = noMurojaah;
    }

    public String getNamaSurat() {
        return namaSurat;
    }

    public void setNamaSurat(String namaSurat) {
        this.namaSurat = namaSurat;
    }

    public String getHalamanSurat() {
        return halamanSurat;
    }

    public void setHalamanSurat(String halamanSurat) {
        this.halamanSurat = halamanSurat;
    }
}
