package com.forthreal.tests;

import com.forthreal.application.classes.CoinDenominationEvaluator;
import com.forthreal.application.exceptions.ApplicationException;
import org.junit.Assert;
import org.junit.Test;

public class CoinDenominationEvaluatorTests
{
    @Test
    public void test1() throws ApplicationException
    {
        Assert.assertEquals( 5, CoinDenominationEvaluator.evaluateDenominations(47) );
    }

    @Test
    public void test2() throws ApplicationException
    {
        Assert.assertEquals( 8, CoinDenominationEvaluator.evaluateDenominations(93) );
    }

}
