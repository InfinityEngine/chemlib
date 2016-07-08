package chem.implementations;

import chem.interfaces.IElement;

/**
 * Created by TwilightSparkle on 09.07.2016.
 */
public class Oxygen implements IElement {
    @Override
    public double getRelativeMass() {
        return 15.999;
    }

    @Override
    public String getSymbol() {
        return "O";
    }

    @Override
    public int getNumber() {
        return 8;
    }

    @Override
    public String getElectronicStructure() {
        return "[He]2s22p4";
    }

    @Override
    public String getName() {
        return "Oxygen";
    }
}
