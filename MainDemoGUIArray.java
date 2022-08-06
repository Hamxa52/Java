//Create Array of Button/JButton class
	//int[] arr= new int[20];
	//JButton[] btn = new JButton[20];
	//btn[0]=new JButton(1+ "");
import java.awt.*;
import javax.swing.*;

class MainDemoGUIArray
{
	public static void main(String[] arg)
	{
		JFrame frm= new JFrame();
			 //and borders
	        Container con=frm.getContentPane();
		FlowLayout flw=new FlowLayout();
		con.setLayout(flw);
		JButton[] btn = new JButton[20];
		for(int i=0;i<btn.length;i++)
		{
  			btn[i] = new JButton((i+1) + "");
			con.add(btn[i]);
		}
		frm.setSize(300,600);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(3	);
			
		 
	}
}