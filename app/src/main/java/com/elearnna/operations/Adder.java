package com.elearnna.operations;

/**
 * Created by Ahmed on 1/31/2016.
 */
public class Adder implements Operation{
    double sum = 0;
    @Override
    public double performOperation(double[] array) {
        if(array.length > 1){
            for (int i = 0; i < array.length; i++){
                sum = sum + array[i];
            }
        }
        return sum;
    }
}
