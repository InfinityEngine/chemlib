package chem.Elements.interfaces;

/**
 * Created by TwilightSparkle on 09.07.2016.
 */
public interface IElement {

    double getRelativeMass();
    String getSymbol();

    /**
     * Number of element in the periodic Table
     * @return nuclear charge or number of electrons/protons
     */
    int getNumber();
    String getElectronicStructure();
    String getName();

}
