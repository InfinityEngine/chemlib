package chem.Molecules.implementations;

import chem.interfaces.IElement;
import chem.Molecules.interfaces.IMoleculePart;

/**
 * Created by Дмитрий on 09.07.2016.
 */
public class MoleculeSinglePart implements IMoleculePart
{
    private IElement element;

    public MoleculeSinglePart(IElement element)
    {
        this.element = element;
    }

    @Override
    public IMoleculePart[] getCompositePart()
    {
        return null;
    }

    @Override
    public IElement getSinglePart()
    {
        return element;
    }

    @Override
    public boolean isComposite()
    {
        return false;
    }

    @Override
    public boolean isSingle()
    {
        return true;
    }

    @Override
    public double getMass()
    {
        return element.getRelativeMass();
    }
}
