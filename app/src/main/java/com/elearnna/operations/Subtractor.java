package com.elearnna.operations;

/**
 * Created by Ahmed on 1/31/2016.
 */
public class Subtractor implements Operation{
    @Override
    public double performOperation(double[] array) {
        double sub = array[0];
        if(array.length > 1){
            for (int i = 1; i < array.length; i++){
                sub = sub - array[i];
            }
        }
        return sub;
    }
}
