package app;

import app.colourStrategies.ColourStrategy;
import app.colourStrategies.impl.BlackWhiteColourStrategy;
import app.documents.Document;

public class PrinterSystem {

    private final PaintContainer paintContainer;
    private ColourStrategy colourStrategy;

    public PrinterSystem() {
        this.paintContainer = new PaintContainer();
        colourStrategy = new BlackWhiteColourStrategy();
    }

    public void print(Document document) {
        print(document, 1);
    }

    public void print(Document document, int numberOfCopies){
        if (document.neededAmountOfPaint() * numberOfCopies > paintContainer.getAmount()){
            System.out.println("There are not enough paint to print the document!");
            return;
        }
        for (int i = 0; i < numberOfCopies; i++) {
            System.out.println("Copies " + (i + 1) + " of document has begun printing");

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

            paintContainer.usePaint(document.neededAmountOfPaint());
            System.out.printf(
                    "Copies %d of the document (with data: %s) has been printed out in %s colour scheme%n",
                    i + 1, document.getData(), colourStrategy.getColourScheme()
            );
        }
    }

    public void addPaint(int amount){
        if (amount > 0)
            paintContainer.addPaint(amount);
    }

    public void setColourStrategy(ColourStrategy colourStrategy) {
        this.colourStrategy = colourStrategy;
    }
}
