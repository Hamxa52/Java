 class Box
 {
     double weidth;
     double height;
     double depth;
     Box(double w,double h,double d)
     {
         weidth = w;
         height = h;
         depth = d;
     }
 }
 public class MainDemoPeremeterizeConstructor
 {
     public static void main (String[]args)
     {
         Box obj1 = new Box(1,2,3); 
         Box obj2 = new Box(1.5,2.5,7.8);
         Box obj3 = new Box(10,20,30); 
         System.out.println(obj1.weidth+"\t"+obj1.height+"\t"+obj1.depth);
         System.out.println(obj2.weidth+"\t"+obj2.height+"\t"+obj2.depth);
         System.out.println(obj3.weidth+"\t"+obj3.height+"\t"+obj3.depth);
     }
 }