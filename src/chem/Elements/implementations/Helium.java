package chem.Elements.implementations;

import chem.Elements.interfaces.IElement;

/**
 * Created by TwilightSparkle on 09.07.2016.
 */
public class Helium implements IElement {
    @Override
    public double getRelativeMass() {
        return 4.0022602;
    }

    @Override
    public String getSymbol() {
        return "He";
    }

    @Override
    public int getNumber() {
        return 2;
    }

    @Override
    public String getElectronicStructure() {
        return "1s2";
    }

    @Override
    public String getName() {
        return "Helium";
    }
}
