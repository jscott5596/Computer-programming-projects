/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 24scottjp
 */
public class SafeInput {
     public static String getNonZeroLenString(Scanner pipe, String prompt)
   {
  
       String retString = "";  // Set this to zero length. Loop runs until it isn’t
       do
       {
           System.out.print("\n" +prompt + ": "); // show prompt add space
           retString = pipe.nextLine();
       }while(retString.length() == 0);
       
       return retString;
       
   }
  
}
