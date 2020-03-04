package com.java.numtoword.main;
 
import java.util.Scanner;

import com.java.numtoword.constant.NumToWordConstants;
import com.java.numtoword.service.NumToWordService;

 public class NumberToWord {

         public static void main(String[] args) {
             int number = 0;
             Scanner scanner = new Scanner(System.in);
             System.out.print("Please type a number between 0 and 999 OR type -1 to exit:  ");
             
             try {
	             number = scanner.nextInt();
	             while(number!=NumToWordConstants.NOT_FOUND){
	                 if(number>=0 && number<=999){
	                     if(number==0){
	                         System.out.print("NUMBER AFTER CONVERSION:\tZERO");
	                     } else {
	                         System.out.print("NUMBER AFTER CONVERSION:\t");
	                         NumToWordService.numberToWord(((number / 100) % 10), " HUNDRED");
	                         NumToWordService.numberToWord((number % 100), " ");
	                     }
	
	                 } else{
	                     System.out.print("NUMBER OUT OF RANGE");
	                 }
	                 System.out.print("\nPlease type a number between 0 and 999 OR type -1 to exit:  ");
	                 number = scanner.nextInt();
	             }
             }catch (Exception e) {
         		System.out.println("Please enter a valid number");
         		
        	 }
         }

         
     }