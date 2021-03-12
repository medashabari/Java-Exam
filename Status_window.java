import java.awt.*;
import java.applet.*;

public class Status_window extends Applet{
	public void init() {
		setBackground(Color.cyan);
	}
	public void paint(Graphics g){
		g.drawString("This is applet.",10,20);
		showStatus("This is shown in thr status window.");
	}
}