package chem.implementations;

import chem.interfaces.IElement;

/**
 * Created by TwilightSparkle on 09.07.2016.
 */
public class Fluorine implements IElement {
    @Override
    public double getRelativeMass() {
        return 18.998403163;
    }

    @Override
    public String getSymbol() {
        return "F";
    }

    @Override
    public int getNumber() {
        return 9;
    }

    @Override
    public String getElectronicStructure() {
        return "[He]2s22p5";
    }

    @Override
    public String getName() {
        return "Fluorine";
    }
}
