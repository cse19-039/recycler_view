package com.example.recycler_view_week5;

public class MegaPixelModel {
    String megapixelFullName;
    String megapixelNumberName;
    String megapixelAbbreviationName;
    int image;

    public MegaPixelModel(String megapixelFullName, String megapixelNumberName, String megapixelAbbreviationName, int image) {
        this.megapixelFullName = megapixelFullName;
        this.megapixelNumberName = megapixelNumberName;
        this.megapixelAbbreviationName = megapixelAbbreviationName;
        this.image = image;
    }

    public String getMegapixelFullName() {
        return megapixelFullName;
    }

    public String getMegapixelNumberName() {
        return megapixelNumberName;
    }

    public String getMegapixelAbbreviationName() {
        return megapixelAbbreviationName;
    }

    public int getImage() {
        return image;
    }
}
