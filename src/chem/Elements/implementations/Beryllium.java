package chem.Elements.implementations;

import chem.Elements.interfaces.IElement;

/**
 * Created by TwilightSparkle on 09.07.2016.
 */
public class Beryllium implements IElement {
    @Override
    public double getRelativeMass() {
        return 9.0121831;
    }

    @Override
    public String getSymbol() {
        return "Be";
    }

    @Override
    public int getNumber() {
        return 4;
    }

    @Override
    public String getElectronicStructure() {
        return "[He]2s2";
    }

    @Override
    public String getName() {
        return "Beryllium";
    }
}
