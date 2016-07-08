package chem.implementations;

import chem.interfaces.IElement;

/**
 * Created by TwilightSparkle on 09.07.2016.
 */
public class Lithium implements IElement {
    @Override
    public double getRelativeMass() {
        return 6.94;
    }

    @Override
    public String getSymbol() {
        return "Li";
    }

    @Override
    public int getNumber() {
        return 3;
    }

    @Override
    public String getElectronicStructure() {
        return "[He]2s1";
    }

    @Override
    public String getName() {
        return "Lithium";
    }
}
