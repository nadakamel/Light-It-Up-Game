
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Cross extends Shapes{

	public Cross (String Name, int MinusNum, ImageIcon Img,int maxRange,String setDirections) {
		super(Name, MinusNum, Img,0);
		this.setDirections=setDirections;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Rotation(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int points() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void basicDirections() {
		// TODO Auto-generated method stub
		
	}

}
