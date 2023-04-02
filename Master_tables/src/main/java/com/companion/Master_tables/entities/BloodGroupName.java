package com.companion.Master_tables.entities;

public enum BloodGroupName {
    A("A"),
    A_PLUS("A+"),
    B("B"),
    B_PLUS("B+");

    private final String label;

    BloodGroupName(String label) {
        this.label = label;
    }

    public static BloodGroupName fromLabel(String label) {
        for (BloodGroupName b : values()
        ) {
            if (b.getLabel().equalsIgnoreCase(label)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Invalid BloodGroup: " + label);
    }

    public String getLabel() {
        return label;
    }
}