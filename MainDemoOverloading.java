 class Overloaded
 {
    int mypower()
    {
        return 2*2;
    }
    double mypower(double n)
    {
        return n*n;
    }
    double mypower(double n,int p)
    {
        double pow=1;
        for(int i=1;i<=p;i++)
        {
            pow = pow*n;
        }
        return pow;
    }
 }
 public class MainDemoOverloading
 {
     public static void main (String[]args)
     {
         Overloaded obj = new Overloaded(); 
        int ans1 = obj.mypower();
        double ans2 = obj.mypower(5);
        double ans3 = obj.mypower(2,4);
         System.out.println("ans1=obj.mypower():"+ans1);
         System.out.println("ans2=obj.mypower():"+ans2);
         System.out.println("ans3=obj.mypower():"+ans3);
     }
 }