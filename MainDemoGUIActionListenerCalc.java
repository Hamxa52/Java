import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MainDemoGUIActionListenerCalc implements ActionListener
{
	TextField txtValue1;
	TextField txtValue2;
	Label lblOperationResult;
	Label lblResult;
	Label lblValue1;
	Label lblValue2;
	Label lblOperation;
	JButton btnAddition;
	JButton btnSubtraction;
	JButton btnMultiply;
	JButton btnDivision;
	int count=0;
	Font fnt;
	public void actionPerformed(ActionEvent e)
	{
		String strCaption=e.getActionCommand();
		double op1=Double.parseDouble(txtValue1.getText());	
		double op2=Double.parseDouble(txtValue2.getText());		
		double ans=0;
		fnt = new Font("Times New Roman", Font.BOLD+Font.ITALIC,20);
		lblOperationResult.setFont(fnt);
		

		if (strCaption=="+")
		{
			ans=op1 + op2;			
		}
		else if (strCaption=="-")
		{
			ans=op1 - op2;			
		}
		else if (strCaption=="*")
		{
			ans=op1 * op2;			
		}
		else if (strCaption=="/")
		{
			ans=op1 / op2;			
		}
		lblOperationResult.setText(ans+"");		
	}
	public static void main(String[] arg)
	{
		MainDemoGUIActionListenerCalc o = new MainDemoGUIActionListenerCalc();
		o.myGUI();			 
	}
	void myGUI()
	{
		JFrame frm= new JFrame();
			 //and borders
	        Container con=frm.getContentPane();
	
		con.setLayout(new GridLayout(0,2,4,8));
		lblOperationResult= new Label();
		lblValue1= new Label("Value 1:");
		lblValue2= new Label("Value 2:");
		lblResult= new Label("Result");

		lblOperation= new Label("Operation");
  		btnAddition = new JButton("+");
  		btnSubtraction = new JButton("-");
  		btnMultiply = new JButton("*");
  		btnDivision = new JButton("/");

		txtValue1= new TextField();	
		txtValue2= new TextField();
		Panel pnl=new Panel();
		pnl.setLayout(new FlowLayout());
		pnl.add(btnAddition);
		pnl.add(btnSubtraction);
		pnl.add(btnMultiply);
		pnl.add(btnDivision);
 		con.add(lblValue1);
 		con.add(txtValue1);
 		con.add(lblValue2);
 		con.add(txtValue2);
 		con.add(lblOperation);
 		con.add(pnl);
		con.add(lblResult);
		con.add(lblOperationResult);
		
		btnAddition.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnSubtraction.addActionListener(this);
		btnDivision.addActionListener(this);

	frm.setSize(600,600);//600 X 600
	frm.setVisible(true);//to display frame on screen
	frm.setDefaultCloseOperation(3);

	}
}