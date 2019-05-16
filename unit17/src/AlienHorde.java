//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
		int x = 0;
		int y = 5;
		for (int i=0; i<size; i++)
		{
			aliens.add(new Alien(x, y, 42, 30, 2));
			x -= 40;
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a: aliens)
		{
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien a: aliens) 
		{
			if (a.goingRight()) 
			{
				if (a.getX() > 770) 
				{
					a.setRight(false);
					for (int down = 0; down < 25; down++)
					a.move("DOWN");
				}
				else {
					a.move("RIGHT");
				}
			}
			else {
				if (a.getX() < 30) {
					a.setRight(true);
					for (int down = 0; down < 25; down++)
					a.move("DOWN");
				}
				else {
					a.move("LEFT");
				}
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		ArrayList<Alien> remove = new ArrayList<Alien>();
		ArrayList<Ammo> removeShots = new ArrayList<Ammo>();
		for (Alien al: aliens) {
	        Rectangle alienBox = new Rectangle(al.getX(), al.getY(), al.getWidth(), al.getHeight());
            for (Ammo shot: shots) {
                Rectangle shotBox = new Rectangle(shot.getX(), shot.getY(), shot.getWidth(), shot.getHeight());
                if (alienBox.intersects(shotBox)) {
                    remove.add(al);
                    removeShots.add(shot);
                    break;
                }
            }
		}
		for (Alien rem: remove)
		{
			aliens.remove(rem);
		}
		for (Ammo am: removeShots)
		{
			shots.remove(am);
		}
	}
	
	public boolean gameIsWon()
	{
		return (aliens.size() == 0);
	}
	
	public boolean touchingShip(Graphics window, Ship ship)
	{
		boolean touching = false;
		for (Alien al : aliens)
		{
			if ( ((ship.getX() >= al.getX() && ship.getX() <= al.getX()+30)
					|| (ship.getX()+50 >= al.getX() && ship.getX()+50 <= al.getX()+30))
					&& ((ship.getY()+25 >= al.getY() && ship.getY()+25 <= al.getY()+30)
					|| (al.getY() <= ship.getY() && ship.getY() <= al.getY()+30)) )
			{
				touching = true;
			}
		}
		return touching;
	}

	public String toString()
	{
		return "";
	}
}
