/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 24scottjp
 */
public class TTMain {

    /**
     * @param args the command line arguments
     */
    
    private static final int ROW = 3;
        private static final int COL = 3;
        private static String board [][]= new String [ROW][COL];
        
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        // TODO code application logic here
           
         
           String flag = "";
           boolean done = false;
           boolean playing = true;
      do   {  
           ClearBoard();
    
           String player = "x";
       
             final int winct = 5;
           final int tiecnt = 7;
            int row = 0;
             int col = 0;
             int count = 0;
             
       do {  
           
           
        do
        {
            DisplayBoard();
          row = SimpleImput.getRangedInput(in, "Please enter the row where you would like to place your "+ player, 1, 3);
           row = row -1;
           col = SimpleImput.getRangedInput(in, "Please enter the column where you would like to place your " + player, 1, 3);
          col = col -1;
           
              
         
        }

        while(!isValidMove(row,col));
         
                count = count +1;
                  
        board[row][col] = player;
      
      
        if (count >= winct)
        {
       if (isWin(player))//wins
       {
          DisplayBoard();
           System.out.println("Player " + player + " wins");
           flag = SimpleImput.getYN(in, "Would you like to play again?");
           if (flag.equalsIgnoreCase("N"))
           {
             
              return;
           }
           else {
            break;   
           }
       }
        }
       if (count >=tiecnt){
           
       
      if(isTie())
      {
       
         
            System.out.println("Tie");
           flag = SimpleImput.getYN(in, "Would you like to play again?");
           if (flag.equalsIgnoreCase("N"))
           {
               
              return;
              
           }
           else {
               break;
           }
          
      
      }
        }
      if (!isWin(player)&&count>=9)//Tie in 9
      {
          DisplayBoard();
          System.out.println("Tie");
           flag = SimpleImput.getYN(in, "Would you like to play again?");
           if (flag.equalsIgnoreCase("N"))
           {
               
              return;
              
           }
           else {
               break;
           }
      }
      
       
        //check for moves 
        if(player.equals("x")){
          player = "o";
      } 
      else 
      {
          player = "x";
      }
      }while(playing = true);

    }while(1==1);

      }
    private static void ClearBoard() {
        for (int row = 0; row<ROW; row ++) {
             for (int col = 0; col<COL; col ++) {
            
                 board[row][col] = " ";
            } 
        }
    }
      private static void DisplayBoard() {
     for (int row = 0; row<ROW; row ++) {
         System.out.print("| ");
         for(int col = 0; col<COL;col++){
             System.out.print(board[row][col] + " | ");
             
         }
      System.out.println("");
     }
    }

    
    
    private static boolean isValidMove(int row, int col) 
    {
        boolean retVal = false;
        if(board[row][col].equals(" "))
        {
        retVal = true;
        }
            return retVal;
    }
    private static boolean isRowWin(String player)
{
for(int row=0; row < ROW; row++)
{
if(board[row][0].equals(player) && board[row][1].equals(player) && board[row]
[2].equals(player))
{
return true;
}
}
return false; // no row win
}
        private static boolean isColWin(String player)
{
for(int col=0; col < COL; col++)
{
if(board[0][col].equals(player) && board[1][col].equals(player) && board[2]
[col].equals(player))
{
return true;
}
}
return false; // no row win
}
            private static boolean isDiagonalWin(String player)
                   
{
     
for(int row=0; row < ROW; row++)
{
    
    for(int col=0; col < ROW; col++){


if(board[0][0].equals(player) && board[1][1].equals(player) && board[2]
[2].equals(player)||board[0][2].equals(player) && board[1][1].equals(player) && board[2]
[0].equals(player))
{
return true;
}
else {
return false;
}
}

       
        }
return false;
}
    private static boolean isWin(String player)
{
if(isColWin(player) || isRowWin(player) || isDiagonalWin(player))
{
return true;
}
else {
   return false; 
}

} 
  
    private static boolean isTie ()
    {
       boolean xflag = false;
       boolean oflag = false;
   for(int row = 0; row<ROW; row++)
   {
       if(board[row][0].equals("x")&&board[row][1].equals("x")&&board[row][2].equals("x"))
       {
           xflag = true;
       }
       if(board[row][0].equals("o")&&board[row][1].equals("o")||board[row][2].equals("o"))
       {
           oflag = true;
       }
       if(!(xflag&&oflag))
       {
           return false;
       }
       xflag = oflag = false;
   } 
  for(int col = 0;col<COL;col++)
       {
        if (board[0][col].equals("x")||board[1][col].equals("x")||board[2][col].equals("x")){
            xflag = true;
        } 
        else if (board[0][col].equals("o")||board[1][col].equals("o")||board[2][col].equals("o")){
            oflag = true;
        }
        if(!(xflag&&oflag)) {
            return false;
        }
        xflag = oflag = false;
        
       }
       if(board[0][0].equals("x")||board[1][1].equals("x")||board[2][2].equals("x"))
{
xflag = true;
}
     if(board[0][0].equals("o")||board[1][1].equals("o")||board[2][2].equals("o"))
{
oflag = true;
}
       
      if (!(xflag && oflag))
      {
          return false;
      }
      
      
      if(board[0][2].equals("x")||board[1][1].equals("x")||board[2][0].equals("x"))
{
xflag = true;
}
     if(board[0][2].equals("o")||board[1][1].equals("o")||board[2][0].equals("o"))
{
oflag = true;
}
       
      if (!(xflag && oflag))
      {
          return false;
      }
          
   
           
    
       
    return true;
   
      
    }
}
