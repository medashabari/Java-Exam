import java.awt.*;
import java.lang.String;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import javax.swing.JFrame;


public class LoginForm {
	public static void main(String[] args) {
		Login log = new Login();
	}
}
class Login extends JFrame{
   TextField t1,t2;
 	Button b1,b2;
 	  public Login(){
 	  	   t1 = new TextField(10);
 	  	   t2 = new TextField(10);
 	  	   b1= new Button("Login");
 	  	   b2 = new Button("Cancel");

 	  	   add(t1);
 	  	   add(t2);
 	  	   add(b1);
 	  	   add(b2);

 	  	   setLayout(new FlowLayout());
 	  	   setVisible(true);
 	  	   setSize(400,400);
 	  	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	  }
}