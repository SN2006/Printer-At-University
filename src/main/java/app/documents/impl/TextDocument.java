package app.documents.impl;

import app.documents.Document;

public class TextDocument implements Document {

    private final String text;

    public TextDocument(String text) {
        this.text = text;
    }

    @Override
    public String getData() {
        return text;
    }

    @Override
    public int neededAmountOfPaint() {
        return text.length() * 2;
    }
}
