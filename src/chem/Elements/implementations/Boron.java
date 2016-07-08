package chem.Elements.implementations;

import chem.Elements.interfaces.IElement;

/**
 * Created by TwilightSparkle on 09.07.2016.
 */
public class Boron implements IElement {
    @Override
    public double getRelativeMass() {
        return 10.81;
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public int getNumber() {
        return 5;
    }

    @Override
    public String getElectronicStructure() {
        return "[He]2s22p1";
    }

    @Override
    public String getName() {
        return "Boron";
    }
}
