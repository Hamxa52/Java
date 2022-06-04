 class Box
 {
     double weidth;
     double height;
     double depth;
     Box()
     {
         weidth = 10;
         height = 20;
         depth = 15;
     }
 }
 public class MainDemoConstructor
 {
     public static void main (String[]args)
     {
         Box obj = new Box(); 
         System.out.println(obj.weidth+"\n"+obj.height+"\n"+obj.depth);
     }
 }