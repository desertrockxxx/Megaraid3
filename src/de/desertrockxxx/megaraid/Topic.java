package de.desertrockxxx.megaraid;
import java.util.Date;

public class Topic extends Subcategorie{
    private Subcategorie subcat;
    private String content;

    public Topic(int id, String name, String date, Categorie cat, Subcategorie subcat, String content) {
        super(id, name, date, cat);
        this.subcat = subcat;
        this.content = content;
    }

    public Topic(int id, String name, String content) {
        super(id, name);
        this.content = content;

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Subcategorie getSubcat() {
        return subcat;
    }

    public void setSubcat(Subcategorie subcat) {
        this.subcat = subcat;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + " Name: " +getName()+ " Content: " + getContent();
    }
}
