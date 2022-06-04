 class Human
 {
     double weight;
     double height;
     void running()
     { 
         System.out.println("h is running slow"+"m is running fast");
     }
     void eating()
     {
         System.out.println("h is eating more"+"m is eating less");
     }
 }
 public class MainDemoHuman
 {
     public static void main (String[]args)
     {
         Human m = new Human(); 
         Human h = new Human();
         h.weight=120;
         h.height=5.5;
         m.weight=70;
         m.height=6.5;
         h.running();
         m.running();
         h.eating();
         m.eating();
     }
 }