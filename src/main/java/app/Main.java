package app;

import app.colourStrategies.impl.ColorfulColourStrategy;
import app.documents.Document;
import app.documents.impl.TextDocument;

public class Main {

    public static void main(String[] args) {
        PrinterSystem printerSystem = new PrinterSystem();
        Document document = new TextDocument("Text Data");

        printerSystem.print(document);
        printerSystem.addPaint(200);
        printerSystem.print(document);

        printerSystem.setColourStrategy(new ColorfulColourStrategy());
        printerSystem.print(document, 5);

    }

}
