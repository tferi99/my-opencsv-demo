package org.ftoth.opencsvdemo.model;

public class EmployeeHeaderNameComparator extends OutputHeaderNameComparatorBase implements java.util.Comparator<String>
{
    private static final String[] columnNames = {
        "ID",
        "Full Name",
        "Age",
        "Country/Location",
        "Salary",
        "Birth Date",
        "Is Active"
    };

    static {
        for (int n=0; n<columnNames.length; n++) {
            columnNames[n] = columnNames[n].toUpperCase();
        }
    }

    @Override
    protected String[] getColumns() {
        return columnNames;
    }
}
