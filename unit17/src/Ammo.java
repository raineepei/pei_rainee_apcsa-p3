//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
		super(x, y);
		speed = 5;
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x, y);
		speed = s;
	}

	public void setSpeed(int s)
	{
	   //add code
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		window.setColor(Color.YELLOW);
		window.fillRect(getX(), getY(), 5, 5);
	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
		switch (direction)
		{
		case "LEFT":
			super.setX(super.getX() - getSpeed());
			break;
		
		case "RIGHT":
			super.setX(super.getX() + getSpeed());
			break;
		case "UP":
			super.setY(super.getY() + getSpeed());
			break;
		case "DOWN":
			super.setY(super.getY() - getSpeed());
			break;
		}
	}

	public String toString()
	{
		return "";
	}
}
