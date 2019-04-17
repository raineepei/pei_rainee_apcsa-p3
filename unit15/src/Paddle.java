//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10);
       speed =5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y){
		  super(x,y);
		  speed = 5;
	   }
   
   public Paddle (int x, int y, int wid, int ht){
		   super (x,y,wid,ht);
		   setSpeed(5);
	   }
   
   public Paddle(int x, int y, int spd){
			super (x,y);
			setSpeed(spd);
		}
   
   public Paddle(int x, int y, int wid, int ht,int spd){
			super (x,y, wid,ht);
			setSpeed(spd);
		}
   
   public Paddle(int x, int y, int wid, int ht, Color col, int spd){
			super(x,y,wid,ht,col);
			setSpeed(spd);
		}




   public void setSpeed(int spd) {
	   speed = spd;
   }
   
   public int getSpeed() {
	   return speed;
   }



   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY()-speed);
	   draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window,Color.WHITE);
	   setY(getY()+speed);
	   draw(window);
   }

   
   //add a toString() method
   public String toString() {
	   return "x: "+getX()+" y: "+getY()+" width: "+getWidth()+" height: "+getHeight()+" color: "+getColor()+" speed: "+getSpeed();
   }
}