package app.colourStrategies.impl;

import app.colourStrategies.ColourStrategy;

public class BlackWhiteColourStrategy implements ColourStrategy {
    @Override
    public String getColourScheme() {
        return "black-white";
    }
}
