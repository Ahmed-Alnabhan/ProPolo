package com.elearnna.operations;

/**
 * Created by Ahmed on 1/31/2016.
 */
public class Divider implements Operation {
    @Override
    public double performOperation(double[] array) {
        double div = array[0];
        if(array.length > 1){
            for (int i = 1; i < array.length; i++){
                if(array[i] != 0) {
                    div = div / array[i];
                } else {
                    throw new IllegalArgumentException("Dividing by 0");
                }
            }
        }
        return div;
    }
}
