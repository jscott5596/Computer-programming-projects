/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 24scottjp
 */
public class SimpleImput {
    
    public static double getDouble (Scanner pipe, String prompt){
        double inpdouble = 0;
        boolean terminator;
        String trash = "";
       do
       {
           System.out.print("\n" +prompt + ": "); // show prompt add space
           if (pipe.hasNextDouble()){
               
           
           inpdouble = pipe.nextDouble();
           pipe.nextLine();
           terminator = true; 
           }
           else {
               System.out.println("You entered trash please try again");
               trash = pipe.nextLine();
               
               terminator = false;
           }
       }while(terminator == false); 
       return inpdouble;
    }
    

    public static int getInt (Scanner pipe, String prompt) {
      int inpint = 0;
        boolean terminator;
        String trash = "";
       do
       {
           System.out.print("\n" +prompt + ": "); // show prompt add space
           if (pipe.hasNextInt()){
               
           
           inpint = pipe.nextInt();
           pipe.nextLine();
           terminator = true; 
           }
           else {
               System.out.println("You entered trash please try again");
               trash = pipe.nextLine();
               
               terminator = false;
           }
       }while(terminator == false); 
       return inpint;
    }
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
       public static int getMonth (Scanner pipe, String prompt, int low, int high) {
          int result = 0;
          boolean terminator = false;
          String trash ="0";
          do {
              System.out.print(prompt + "[" + low + "-" + high + "]");   
              if(pipe.hasNextInt()){
                  result = pipe.nextInt();
                  pipe.nextLine();
                 if (result >= low && result <= high) 
                 {
                  terminator = true;
                  
                  
                  
              }
                 else {
                     System.out.println("You must enter a value in range [" + low + " - " + "]");
                 }
              
                  
          }
              else 
              {
                  trash = pipe.nextLine();
                  System.out.println("You must enter a value in range [" + low + " - " + "]");
              }
          
       }
          while(!terminator == true);
          return result; 
}
   public static int getDay (Scanner pipe, String prompt, int low, int high) {
       
          int result = 0;
          boolean terminator = false;
          String trash ="0";
          do {
              System.out.print(prompt + "[" + low + "-" + high + "]");   
              if(pipe.hasNextInt()){
                  result = pipe.nextInt();
                  pipe.nextLine();
                 if (result >= low && result <= high) 
                 {
                  terminator = true;
                  
                  
                  
              }
                 else {
                     System.out.println("You must enter a value in range [" + low + " - " + "]");
                 }
          }
              else 
              {
                  trash = pipe.nextLine();
                  System.out.println("You must enter a value in range [" + low + " - " + "]");
             }
       }
          while(!terminator == true);
          return result; 
}  
      public static int getHour (Scanner pipe, String prompt, int low, int high) {
       
          int result = 0;
          boolean terminator = false;
          String trash ="0";
          do {
              System.out.print(prompt + "[" + low + "-" + high + "]");   
              if(pipe.hasNextInt()){
                  result = pipe.nextInt();
                  pipe.nextLine();
                 if (result >= low && result <= high) 
                 {
                  terminator = true;
                  
                  
                  
              }
                 else {
                     System.out.println("You must enter a value in range [" + low + " - " + "]");
                 }
          }
              else 
              {
                  trash = pipe.nextLine();
                  System.out.println("You must enter a value in range [" + low + " - " + "]");
             }
       }
          while(!terminator == true);
          return result; 
}   
            public static int getMinute (Scanner pipe, String prompt, int low, int high) {
       
          int result = 0;
          boolean terminator = false;
          String trash ="0";
          do {
              System.out.print(prompt + "[" + low + "-" + high + "]");   
              if(pipe.hasNextInt()){
                  result = pipe.nextInt();
                  pipe.nextLine();
                 if (result >= low && result <= high) 
                 {
                  terminator = true;
                  
                  
                  
              }
                 else {
                     System.out.println("You must enter a value in range [" + low + " - " + "]");
                 }
          }
              else 
              {
                  trash = pipe.nextLine();
                  System.out.println("You must enter a value in range [" + low + " - " + "]");
             }
       }
          while(!terminator == true);
          return result; 
}
              public static int getYear (Scanner pipe, String prompt, int low, int high) {
          int result = 0;
          boolean terminator = false;
          String trash ="0";
          do {
              System.out.print(prompt + "[" + low + "-" + high + "]");   
              if(pipe.hasNextInt()){
                  result = pipe.nextInt();
                  pipe.nextLine();
                 if (result >= low && result <= high) 
                 {
                  terminator = true;
                  
                  
                  
              }
                 else {
                     System.out.println("You must enter a value in range [" + low + " - " + "]");
                 }
              
                  
          }
              else 
              {
                  trash = pipe.nextLine();
                  System.out.println("You must enter a value in range [" + low + " - " + "]");
              }
          
       }
          while(!terminator == true);
          return result; 
}
             public static double getRangedDouble (Scanner pipe, String prompt, double low, double high) {
          double result = 0;
          boolean terminator = false;
          String trash ="0";
          do {
              System.out.print(prompt + "[" + low + "-" + high + "]");   
              if(pipe.hasNextDouble()){
                  result = pipe.nextDouble();
                  pipe.nextLine();
                 if (result >= low && result <= high) 
                 {
                  terminator = true;
                  
                  
                  
              }
                 else {
                     System.out.println("You must enter a value in range [" + low + " - " + "]");
                 }
              
                  
          }
              else 
              {
                  trash = pipe.nextLine();
                  System.out.println("You must enter a value in range [" + low + " - " + "]");
              }
          
       }
          while(!terminator == true);
          return result; 
}   
    public static String getYN(Scanner pipe, String prompt)
   {
  
       String retString = "";  // Set this to zero length. Loop runs until it isn’t
     
           System.out.print("\n" +prompt + ":"); // show prompt add space
          
           
       
       do 
       {
            retString = pipe.nextLine();
         
           if (!retString.equalsIgnoreCase("Y")&&!retString.equalsIgnoreCase("N"))
                   {
                      System.out.println("Invalid input, please enter Y/N");
                      retString = pipe.nextLine();
                   }
           else {
           }
       }while(!retString.equalsIgnoreCase("Y")&&!retString.equalsIgnoreCase("N"));
       return retString;
       
   }  
    public static String getRegex (Scanner pipe, String prompt, String regex){
       boolean valid; 
        String value = "";
        
    do {
        //show the prompt
        System.out.print(prompt + ": ");
        value = pipe.nextLine();
        if(value.matches(regex)) {
            valid = true;
        }
        else {
            System.out.println("/nInvalid input, please try again " + value);
            valid = false;
        }
    }
    while(!valid);
    return value;
}
    public static void getPrettyHeader (String msg) {
      final int charcount= 60;      
       int leftsp;
     int totspaces = charcount - 6 - msg.length();
     int rightsp;
     int remcheck = totspaces%2;
     
     if (remcheck == 0) {
        rightsp = totspaces/2;
        leftsp =totspaces/2;
     }
     else {
         rightsp = totspaces/2;
         leftsp = rightsp + 1;
         
     }
     
     
     
     
            for (int col = 0; col < 60; col ++)
            {
                System.out.print("*");
        }
            System.out.print("\n");
        
    
       System.out.print("***");
       
       for (int ch = 0;ch<leftsp;ch ++ ) {
           System.out.print(" ");
       }
        System.out.print(msg);
        for (int ch = 0;ch<rightsp;ch ++ ) {
           System.out.print(" ");
       }
        System.out.print("***");
        System.out.print("\n");
         for (int col =0; col < 60; col ++) {
             System.out.print("*");
         }
        
       
} public static int getRangedInput (Scanner pipe, String prompt, int low, int high) {
           Scanner in = new Scanner(System.in);
          int result = 0;
          boolean terminator = false;
          String trash ="0";
          do {
              System.out.print(prompt + "[" + low + "-" + high + "]");   
              if(pipe.hasNextInt()){
                  result = pipe.nextInt();
                  pipe.nextLine();
                 if (result >= low && result <= high) 
                 {
                  terminator = true;
                  
                  
                  
              }
                 else {
                     System.out.println("You must enter a value in range [" + low + " - " + high + "]" );
                 }
              
                  
          }
              else 
              {
                  trash = pipe.nextLine();
                  System.out.println("You must enter a value in range [" + low + " - " + high + "]");
              }
          
       }
          while(!terminator == true);
          return result; 
}
    
}
      
    