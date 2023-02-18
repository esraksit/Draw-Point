import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w= 300;
		int h = 300;
		JFrame f = new JFrame();
		Draw dc = new Draw();
		f.setSize(w,h);
		f.setTitle(	"MORE JAVA GRAPHICS");
		f.add(dc);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true); 
		
		

		
		
		
	}

}
