class Addition 
{
    int x,y;
    Addition(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
public class ThisKeyword
{
    public static void main(String[] args)
    {
        Addition p = new Addition(10,30);
        System.out.println(p.x+p.y);
    }
}