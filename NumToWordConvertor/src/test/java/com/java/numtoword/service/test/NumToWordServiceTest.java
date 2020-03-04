package com.java.numtoword.service.test;



/*public class NumToWordServiceTest {

    @Test
    public void numberToWord() {
    	NumToWordService tester = new NumToWordService(); // MyClass is tested

        // assert statements
        Assert.assertEquals(0, tester.numberToWord(4, "FOUR");
        assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
        assertEquals(0, tester.multiply(0, 0), "0 x 0 must be 0");
    }
}*/


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.java.numtoword.main.NumberToWord;

@RunWith(value = Parameterized.class)
public class NumToWordServiceTest extends NumberToWord {

    private final String expected;
    private final int input;

    public NumToWordServiceTest(final String expected, final int input) {
        this.expected = expected;
        this.input = input;
    }

    @Parameters
    public static Collection<Object[]> data() {
        final Object[][] data = new Object[][] {
            { "One Hundred Thousand", 100000 },
            { "Nine HundredNinetyNine Thousand Nine HundredNinetyNine", 999999 },
            { "Six HundredSeventyEight Thousand Nine Hundred", 678900 },
            { "Zero", 0 },
            { "One Hundred Thousand Five HundredSixtySeven", 100567 },
            { "FourThousandFive HundredEightyNine", 4589 },
            { "ThreeThousandThree HundredThirtyThree", 3333 },
            { "SixtySeven Thousand Five Hundred", 67500 },
            { "SeventyTwo", 72 },
            { "One HundredSeventyTwo Thousand Three HundredFortySix", 172346 },
            { "Eight HundredNinety Thousand", 890000 },
            { "Six Hundred Thousand Seven Hundred", 600700 },
            { "SixtySeven", 67 },
            { "Nine HundredNinetyNine Million Nine HundredNinetyNine Thousand Nine HundredNinetyNine", 999999999 } };
        return Arrays.asList(data);
    }

   /* @Test
    public void test() {
        assertEquals(expected, NumberToWord.class.getClass().numberToWord(input));
    }*/

}

