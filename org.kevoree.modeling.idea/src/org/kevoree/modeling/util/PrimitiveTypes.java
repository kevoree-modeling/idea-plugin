package org.kevoree.modeling.util;

public enum PrimitiveTypes {

    String, Long, Integer, Bool, Double, Continuous;

    public static boolean isPrimitive(String originalName) {
        for (PrimitiveTypes p : PrimitiveTypes.values()) {
            if (p.name().equals(originalName)) {
                return true;
            }
        }
        return false;
    }

}
