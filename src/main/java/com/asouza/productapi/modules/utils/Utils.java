package com.asouza.productapi.modules.utils;

public class Utils {
    public static boolean isEmptyOrNull(Object obj) {
        if (obj == null) {
            return true;
        }

        if (obj instanceof String) {
            return ((String) obj).isEmpty();
        }

        if (obj instanceof Iterable) {
            return !((Iterable<?>) obj).iterator().hasNext();
        }

        return false;
    }}
