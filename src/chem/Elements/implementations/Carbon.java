package chem.Elements.implementations;

import chem.Elements.interfaces.IElement;

/**
 * Created by TwilightSparkle on 09.07.2016.
 */
public class Carbon implements IElement {
    @Override
    public double getRelativeMass() {
        return 12.011;
    }

    @Override
    public String getSymbol() {
        return "C";
    }

    @Override
    public int getNumber() {
        return 6;
    }

    @Override
    public String getElectronicStructure() {
        return "[He]2s22p2";
    }

    @Override
    public String getName() {
        return "Carbon";
    }
}
