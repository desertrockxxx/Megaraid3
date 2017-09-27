package de.desertrockxxx.megaraid;

import java.util.Date;

public class Subcategorie extends Categorie {
    private Categorie cat;

    public Subcategorie(int id, String name, String date, Categorie cat) {
        super(id, name, date);
        this.cat = cat;
    }

    public Subcategorie(int id, String name){

    }

    public Categorie getCat() {
        return cat;
    }

    public void setCat(Categorie cat) {
        this.cat = cat;
    }
}
