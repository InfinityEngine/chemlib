package chem.Elements.implementations;

import chem.Elements.interfaces.IElement;

/**
 * Created by TwilightSparkle on 09.07.2016.
 */
public class Neon implements IElement {
    @Override
    public double getRelativeMass() {
        return 20.1797;
    }

    @Override
    public String getSymbol() {
        return "Ne";
    }

    @Override
    public int getNumber() {
        return 10;
    }

    @Override
    public String getElectronicStructure() {
        return "[He]2s22p6";
    }

    @Override
    public String getName() {
        return "Neon";
    }
}
