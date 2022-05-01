import java.applet.Applet;  
import java.awt.*;  
  
public class Shapes_applet extends Applet{  
	int height,width;
	public void init(){
		height =getSize().height;
		width =getSize().width;
		setName("Welcome to shapes");
	}
  
public void paint(Graphics g){  
g.setColor(Color.red);  
g.drawString("Welcome",50, 50);  
  g.drawArc(90,150,30,30,30,270); 
g.drawRect(160,160,30,30);  
g.drawOval(70,200,30,30);  
  
g.setColor(Color.red);  
g.drawRect(70,70,30,30);  
g.fillRect(70,70,30,30); 
g.drawOval(70,200,30,30); 
g.fillOval(170,200,30,30);  
g.drawArc(90,150,30,30,30,270);  
g.fillArc(270,150,30,30,0,180);  
  
}  
}  