import java.awt.*;
import javax.swing.*;

class MainDemoGUI
{
	public static void main(String[] arg)
	{
		JFrame frm= new JFrame();//Create Window with system menu 
			 //and borders
	        Container con=frm.getContentPane();//Return the reference of workable area from frame
FlowLayout flw=new FlowLayout();//Layout class used for 
				//arrangement of GUI 
				//components/Controls 
				//on Container
  con.setLayout(flw);//setlayout of workable area ie con
	//create GUI components-- Button
  JButton btn1 = new JButton("Click Me 1");
  JButton btn2 = new JButton("Click Me 2");					
	// add components in workable area/ container
 	con.add(btn1);//btn1 add at center of first row
	con.add(btn2);
	//set properties of JFrame 
	frm.setSize(300,600);//300 X 600
	frm.setVisible(true);//to display frame on screen
	frm.setDefaultCloseOperation(3);
			
		 
	}
}