package chem.Elements.implementations;

import chem.Elements.interfaces.IElement;

/**
 * Created by TwilightSparkle on 09.07.2016.
 */
public class Hydrogen implements IElement {


    @Override
    public double getRelativeMass() {
        return 1.008;
    }

    @Override
    public String getSymbol() {
        return "H";
    }

    @Override
    public int getNumber() {
        return 1;
    }

    @Override
    public String getElectronicStructure() {
        return "1s1";
    }

    @Override
    public String getName() {
        return "Hydrogen";
    }
}
