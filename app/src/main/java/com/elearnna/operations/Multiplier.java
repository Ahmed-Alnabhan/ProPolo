package com.elearnna.operations;

/**
 * Created by Ahmed on 1/31/2016.
 */
public class Multiplier implements Operation{
    double multiplier = 1;
    @Override
    public double performOperation(double[] array) {
        if(array.length > 1){
            for (int i = 0; i < array.length; i++){
                multiplier = multiplier * array[i];
            }
        }
        return multiplier;
    }
}
