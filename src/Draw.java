import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Draw extends JComponent{
	


@Override
	protected void paintComponent(Graphics g) {
	Graphics2D	g2d = (Graphics2D) g ;
	
	RenderingHints rh = new RenderingHints(
		RenderingHints.KEY_ANTIALIASING	,RenderingHints.VALUE_ANTIALIAS_ON);
	g2d.setRenderingHints(rh);
	
	
	int[][] array ={{5,6},{2,9},{5,10},{87,1},{50,60},{45,60},{28,26},{1,2},{17,7},{56,54}};
	
	for(int i=0; i<array.length; i++) 
	{
		
			 
			 Ellipse2D.Double p = new Ellipse2D.Double(array[i][0],array[i][1],2,2);			 
			  g2d.fill(p);
		
	}  
	
			
			

	
    

	
}

}