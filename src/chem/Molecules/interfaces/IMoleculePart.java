package chem.Molecules.interfaces;

import chem.Elements.interfaces.IElement;

/**
 * Created by Дмитрий on 09.07.2016.
 */
public interface IMoleculePart
{
    IMoleculePart[] getCompositePart();
    IElement getSinglePart();
    boolean isComposite();
    boolean isSingle();
    double getMass();
}
