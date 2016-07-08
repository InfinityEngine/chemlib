package chem.Molecules.implementations;

import chem.interfaces.IElement;
import chem.Molecules.interfaces.IMoleculePart;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Дмитрий on 09.07.2016.
 */
public class MoleculeCompositePart implements IMoleculePart
{
    private ArrayList<IMoleculePart> elements;

    public MoleculeCompositePart(Collection<IMoleculePart> elements)
    {
        this.elements = new ArrayList<>(elements);
    }

    @Override
    public IMoleculePart[] getCompositePart()
    {
        return (IMoleculePart[])elements.toArray();
    }

    @Override
    public IElement getSinglePart()
    {
        return null;
    }

    @Override
    public boolean isComposite()
    {
        return true;
    }

    @Override
    public boolean isSingle()
    {
        return false;
    }

    @Override
    public double getMass()
    {
        double mass = 0;
        for (IMoleculePart element : elements)
        {
            mass += element.getMass();
        }
        return mass;
    }
}
