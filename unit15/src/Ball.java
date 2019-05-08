//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;


import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed=3;
		ySpeed=1;
	}

	//add the other Ball constructors
	public Ball(int x, int y){
		super (x,y);
		xSpeed=3;
		ySpeed=1;
	}
	public Ball(int x, int y, int wid, int ht){
		super (x,y,wid,ht);
		xSpeed=3;
		ySpeed=1;
	}
	public Ball(int x, int y, int wid, int ht, Color col){
		super (x,y,wid,ht,col);
		xSpeed=3;
		ySpeed=1;
	}
	public Ball(int x, int y, int wid, int ht, Color col, int xS, int yS){
		super(x,y,wid,ht,col);
		setXSpeed(xS);
		setYSpeed(yS);
	}
	
	   
   //add the set methods
	public void setXSpeed(int x) {
		xSpeed = x;
	}
	
	public void setYSpeed(int y) {
		ySpeed = y;
	}
   

	public void moveAndDraw(Graphics window)
	   {
	   	//draw a white ball at old ball location
		   draw(window,Color.WHITE);
	      setX(getX()+xSpeed);
			//setY
	      setY(getY()+ySpeed);
			//draw the ball at its new location
	      draw(window);
	      
	   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball) obj;
		return (this.getX()==other.getX() && this.getY()==other.getY() && this.getWidth()==other.getWidth() && this.getHeight()==other.getHeight()
				&& xSpeed==other.getXSpeed() && ySpeed==other.getYSpeed());
	}   

   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
   //add a toString() method
	public String toString() {
		return "x: "+getX()+" y: "+getY()+" width: "+getWidth()+" height: "+getHeight()+" color: "+getColor()+" xSpeed: "+getXSpeed()+" ySpeed:."
				+ " "+getYSpeed();
	}
	

	public boolean didCollideLeft(Object obj) {
		Block other = (Block)obj;
		return (getX() <= (other.getX() + other.getWidth() + Math.abs(getXSpeed()))
				&& getX() > (other.getX() - getWidth() - Math.abs(getXSpeed()))
				&& getX()>=(other.getX())
				&& getY()<=(other.getY()+other.getHeight())
				&& (getY()+getHeight())>=other.getY());
	}

	public boolean didCollideRight(Object obj) {
		Block other = (Block)obj;
		return (getX() < (other.getX() + other.getWidth() + Math.abs(getXSpeed()))
				&& getX() >= (other.getX() - getWidth() - Math.abs(getXSpeed()))
				&& getX()<=other.getX()+other.getWidth()
				&& getY()<=(other.getY()+other.getHeight())
				&& (getY()+getHeight())>=other.getY());
	}

	public boolean didCollideTop(Object obj) {
		Block other = (Block)obj;
		return (getY() >= (other.getY() - getHeight() - Math.abs(getYSpeed()))
				&& getY() < (other.getY() + other.getHeight() + Math.abs(getYSpeed())) 
				&& (getX()>=other.getX()
				&& getX()<=(other.getX()+other.getWidth())
				&& (getX()+getWidth())>=other.getX()
				&& (getX()+getWidth())<=other.getX()+other.getWidth()));
	}

	public boolean didCollideBottom(Object obj) {
		Block other = (Block)obj;
		return (getY() > (other.getY() - getHeight() - Math.abs(getYSpeed()))
				&& getY() <= (other.getY() + other.getHeight() + Math.abs(getYSpeed())) 
				&& (getX()>=other.getX()
				&& getX()<=(other.getX()+other.getWidth())
				&& (getX()+getWidth())>=other.getX()
				&& (getX()+getWidth())<=other.getX()+other.getWidth()));
	}
	
}