import java.util.Scanner;
 public class MagicOddSquare 
 {
   public static void main(String[] args) 
   {
     Scanner input = new Scanner(System.in);
     int[][] magicSquare;
     boolean isAcceptableNumber = false;
     int size = -1;
     //only accept odd numbers
     while (isAcceptableNumber == false)
     {
       System.out.println("Enter in size of square: ");
       String sizeText = input.nextLine();
       size = Integer.parseInt(sizeText);
       if (size % 2 == 0)
       {
         System.out.println("The size must be an odd number");
         isAcceptableNumber = false;
       }
       else
       {
         isAcceptableNumber = true;
       }
     } 
     magicSquare = createOddSquare(size);
     displaySquare(magicSquare); 
   }
   private static int[][] createOddSquare(int size)
   {
     int[][] magicSq = new int[size][size];
     int row = 0;
     int column = size/2;
     int lastRow = row;
     int lastColumn = column;
     int matrixSize = size*size; 
     magicSq[row][column]= 1;
     for (int k=2;k < matrixSize+1;k++)
     {
       //check if we need to wrap to opposite row
       if (row - 1 < 0)
       {
         row = size-1;
       }
       else
       {
         row--;
       }
       //check if we need to wrap to opposite column
       if (column + 1 == size)
       {
         column = 0;
       }
       else
       {
         column++;
       }
       //if this position isn't empty then go back to where we
       //started and move one row down
       if (magicSq[row][column] == 0)
       {
         magicSq[row][column] = k;
       }
       else
       {
         row = lastRow;
         column = lastColumn;
         if (row + 1 == size)
         {
           row=0;
         }
          else
         {
           row++;
         }
         magicSq[row][column] = k;
       }
       lastRow = row;
       lastColumn= column; 
     }
     return magicSq;
   }
   private static void displaySquare(int[][] magicSq)

   {
     int magicConstant = 0;
     for (int j=0;j<(magicSq.length);j++)
     {
       for (int k=0;k<(magicSq[j].length);k++)
       {
         System.out.print(magicSq[j][k] + " ");
       }
       System.out.print(" ");
       magicConstant = magicConstant + magicSq[j][0];
     }
      System.out.print("The magic constant is " + magicConstant);
   }
 }   