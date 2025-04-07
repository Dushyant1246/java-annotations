package com.bridgelabz;

public class DeprecatedAnnotation {
    public static void main(String[] args) {
        LegacyAPI.oldFeature();
        LegacyAPI.newFeature();
    }
}
class LegacyAPI{
    @Deprecated
    public static void oldFeature(){
        System.out.println("This is an old method which is deprecated");
    }

    public static void newFeature(){
        System.out.println("This is a new method which isn't deprecated");
    }
}