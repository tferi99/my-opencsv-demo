package org.ftoth.opencsvdemo.model;

import org.apache.commons.lang3.ArrayUtils;

public abstract class OutputHeaderNameComparatorBase implements java.util.Comparator<String>
{

    @Override
    public int compare(String fld1, String fld2)
    {
        String[] columns = getColumns();
        int idx1 = ArrayUtils.indexOf(columns, fld1);
        int idx2 = ArrayUtils.indexOf(columns, fld2);
        int decision = idx1 > idx2 ? 1 : -1;

        System.out.println("COMPARATION: " + fld1 + " [" + idx1 + "] ? " + fld2 + " [" + idx2 + "] --> " + decision);


        return decision;
    }

    protected abstract String[] getColumns();
}
