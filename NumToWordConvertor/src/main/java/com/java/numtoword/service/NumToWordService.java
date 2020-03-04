package com.java.numtoword.service;

import com.java.numtoword.exception.InvalidNumberException;

public class NumToWordService {
	public static void numberToWord(int num, String val) throws InvalidNumberException{
        String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
        };
        String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
        if (num > 19) {
            System.out.print(tens[num / 10] + " " + ones[num % 10]);
        } else {
            System.out.print(ones[num]);
        }
        if (num > 0) {
            System.out.print(val);
        }
    }
}
