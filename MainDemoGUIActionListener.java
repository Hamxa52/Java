import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MainDemoGUIActionListener implements ActionListener
{
	Label lbl;
	JButton btn;
	int count=0;
	Font fnt;
	public void actionPerformed(ActionEvent e)
	{
		String strCaption=e.getActionCommand();	
		fnt = new Font("Times New Roman", Font.BOLD+Font.ITALIC,20);
		lbl.setFont(fnt);
		count++;
		lbl.setText(strCaption+" "+ count);
	}
	public static void main(String[] arg)
	{
		MainDemoGUIActionListener o = new MainDemoGUIActionListener();
		o.myGUI();			 
	}
	void myGUI()
	{
		JFrame frm= new JFrame();
			 //and borders
	        Container con=frm.getContentPane();
		FlowLayout flw=new FlowLayout();
		con.setLayout(new GridLayout(2,1));
		lbl= new Label("NFC IET");
  		btn = new JButton("Click Me");
		btn.addActionListener(this);
 		con.add(lbl);
		con.add(btn);

	frm.setSize(300,600);//300 X 600
	frm.setVisible(true);//to display frame on screen
	frm.setDefaultCloseOperation(3);

	}
}