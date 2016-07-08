package chem.Elements.implementations;

import chem.Elements.interfaces.IElement;

/**
 * Created by TwilightSparkle on 09.07.2016.
 */
public class Nitrogen implements IElement {
    @Override
    public double getRelativeMass() {
        return 14.007;
    }

    @Override
    public String getSymbol() {
        return "N";
    }

    @Override
    public int getNumber() {
        return 7;
    }

    @Override
    public String getElectronicStructure() {
        return "[He]2s22p3";
    }

    @Override
    public String getName() {
        return "Nitrogen";
    }
}
