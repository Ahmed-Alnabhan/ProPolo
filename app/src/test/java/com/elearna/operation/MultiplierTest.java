package com.elearna.operation;

import com.elearnna.operations.Divider;
import com.elearnna.operations.Multiplier;
import com.elearnna.operations.Operation;
import com.elearnna.propolo.BuildConfig;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by Ahmed on 1/31/2016.
 */
@Config(sdk = 21, constants = BuildConfig.class)
@RunWith(RobolectricGradleTestRunner.class)
public class MultiplierTest {
    @Test
    public void performMultiplicationTest(){
        double[] arr = {12, 6 , 0};
        Operation op = new Multiplier();
        double result = op.performOperation(arr);
        Assert.assertEquals(0.0, result);
    }
}
