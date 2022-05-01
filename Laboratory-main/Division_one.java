import java.lang.String;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Division_one{
	public static void main(String[] args) {
		Division div = new Division();
	}
}
 class Division extends JFrame implements ActionListener{
 	TextField  t1,t2;
 	Button b;
 	Label l;
 	public Division(){
 		t1 = new TextField(10);
 	  	   t2 = new TextField(10);
 	  	   b= new Button("division");
 	  	  l = new Label("Result");

 	  	   add(t1);
 	  	   add(t2);
 	  	   add(b);
 	  	   add(l);
 	  	   b.addActionListener(this);
 	  	   setLayout(new FlowLayout());
 	  	   setVisible(true);
 	  	   setSize(400,400);
 	  	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	}
public void actionPerformed(ActionEvent e){
	String msg="";
	int num1 = Integer.parseInt(t1.getText());
	int num2 = Integer.parseInt(t2.getText());	
	if(num2==0){
		msg ="ArithmeticException";
		l.setText(msg);
	}
    if(num1<0||num2<0){
		msg = "NumberFormatException";
		l.setText(msg);
	}
	else{
	int result = num1/num2;
	l.setText(result+ " ");
}

}

 }