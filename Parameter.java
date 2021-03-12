import java.awt.*;
import java.applet.*;

public class Parameter extends Applet{
	String name1,name2,name3;
	public void init(){
		name1= getParameter("name1");
		name2= getParameter("name2");
		name3= getParameter("name3");
	}
	public void paint(Graphics g){
			g.drawString(name1,0,100);
			g.drawString(name2,150,200);
			g.drawString(name3,250,300);
	}

}