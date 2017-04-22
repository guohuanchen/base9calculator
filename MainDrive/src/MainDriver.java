import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainDriver implements ActionListener {
	JFrame frame;
	JButton smallerb, biggerb, restart;
	Circle circle;
	public static void main(String[] arg){
	MainDriver gui=new MainDriver();
	gui.go();
	}	
public void go(){
	frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	smallerb=new JButton("smaller");
	biggerb=new JButton("bigger");
	restart=new JButton("restart");
	circle=new Circle();
	
	smallerb.addActionListener(this);      //???
	biggerb.addActionListener(this);
	restart.addActionListener(this);
	
	frame.add(BorderLayout.NORTH,smallerb);
	frame.add(BorderLayout.SOUTH,biggerb);
	frame.add(BorderLayout.EAST,restart);
	frame.add(BorderLayout.CENTER,circle);
	frame.setSize(500, 500);
	frame.setVisible(true);
}

public void actionPerformed(ActionEvent objevent){   //?
	if(objevent.getSource()==biggerb){
		circle.increment();
		}else if(objevent.getSource()==smallerb){
		circle.decrement();
		}else if(objevent.getSource()==restart){
		circle.resize();
		}
	frame.repaint();			
}
}
	
