public class MyClass 
{
    public static void main(String args[]) {
      int[] x = {10,20,10,30,20,10,5};
      
       // find and repalce duplicate values with zero
      for(int i=0; i<x.length; i++)
      {
          int key = x[i];
          for(int j=i+1; j<x.length; j++)
          {
              if(key == x[j])
              {
                  x[j] = 0;
              }
          }
      }
     
        // dispalying array values
       for(int i=0; i<x.length; i++)
      {
         System.out.print(x[i] + " ");
      }
    }
}