import java.awt.*;
import javax.swing.*;

public class Circle extends JPanel{
	private int diameter;
	private int defaultDiameter=90;
	public Circle(){
		diameter=defaultDiameter;
	}
	public Circle(int s){
		if(s<0){
			diameter=defaultDiameter;
		}else{
			diameter=s;
		}
	}
	public void increment(){
		diameter+=10;
	}
	
	public void decrement(){
		if(diameter>0){
			diameter-=10;
		}
	}
	public void resize(){
			diameter=100;
	}
	@Override    //   ???
	public void paintComponent(Graphics g){
		int y=(getHeight()-diameter)/2;
		int x=(getWidth()-diameter)/2;
		g.setColor(Color.blue);
		g.fillOval(x, y, diameter, diameter);
		g.setColor(Color.red);
		g.fillOval(x-10, y-10, diameter, diameter);
		g.setColor(Color.pink);
		g.fillOval(x-20, y-20, diameter, diameter);
		g.setColor(Color.green);
		g.fillOval(x-30, y-30, diameter, diameter);
		g.setColor(Color.orange);
		g.fillOval(x-40, y-40, diameter, diameter);
		g.setColor(Color.black);
		g.fillOval(x-50, y-50, diameter, diameter);
	}
}
	