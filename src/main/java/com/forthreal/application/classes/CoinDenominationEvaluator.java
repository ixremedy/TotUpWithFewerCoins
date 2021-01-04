package com.forthreal.application.classes;

import com.forthreal.application.exceptions.ApplicationException;

import javax.xml.ws.Holder;
import java.util.*;
import java.util.stream.Collectors;

public class CoinDenominationEvaluator
{
    private static List<Integer> intList = Arrays.asList( 1, 5, 10, 25);

    public static int evaluateDenominations(int amount) throws ApplicationException
    {
        if( amount <= 0 )
        {
            throw new ApplicationException("Value cannot be less than 1");
        }

        Holder<Integer> currentSum = new Holder<Integer>();
        currentSum.value = amount;

        Holder<Integer> coinCount = new Holder<>();
        coinCount.value = 0;

        intList
           .stream()
           .sorted( Collections.reverseOrder() )
           .forEach( element -> {

               int value = currentSum.value / element;

               if( value > 0 )
               {
                   coinCount.value += value;

                   currentSum.value -= value * element;

                   System.out.println("num " + element + " coins: " + value);
               }

           });

        System.out.println("Number of coins: " + coinCount.value );

        return coinCount.value;
    }
}
