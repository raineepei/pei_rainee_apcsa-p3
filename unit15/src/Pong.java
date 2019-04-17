//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int right=0, left=0;


	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(350, 200);
		leftPaddle = new Paddle(50, 200, 20, 100, Color.GREEN, 5);
		rightPaddle = new Paddle(730,200, 20, 100, Color.RED, 5);


		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=0 && ball.getX()<=getWidth()))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			if (ball.getX() <= leftPaddle.getX()){
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Right Player:  " + right, 500, 500);
				right++;
				graphToBack.setColor(Color.BLUE);
				graphToBack.drawString("Right Player:  " + right, 500, 500);
			}
			
			else if (ball.getX() >= rightPaddle.getX()+rightPaddle.getWidth()){
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Left Player: "+left, 200, 500);
				left++;
				graphToBack.setColor(Color.BLUE);
				graphToBack.drawString("Left Player: "+left, 200, 500);
			}
			
			ball.draw(graphToBack, Color.WHITE);
			ball= new Ball(300 + (int) (Math.random() * 200),200 + (int) (Math.random() * 200),10,10,Color.BLACK, (int) (Math.pow(-1,  (int) (Math.random() * 2))) * 3, (int) (Math.random() * 3 + 1) * (int) (Math.pow(-1,  (int) (Math.random() * 2))));
			ball.moveAndDraw(graphToBack);
		}

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=0 && ball.getY() <= getHeight())) {
			ball.setYSpeed(-ball.getYSpeed());
		}



		//see if the ball hits the left paddle
		if (ball.didCollideLeft(leftPaddle)) 
		{
			ball.setXSpeed(Math.abs(ball.getXSpeed()));
		}
		else if (ball.didCollideRight(rightPaddle)) {
			ball.setXSpeed(-Math.abs(ball.getXSpeed()));
		}
		else if (ball.didCollideTop(leftPaddle) || ball.didCollideTop(rightPaddle)
				|| ball.didCollideBottom(leftPaddle) || ball.didCollideBottom(rightPaddle)) 
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		//see if the paddles need to be moved

		if(keys[0] == true && leftPaddle.getY() >= 0)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		
		if(keys[1] == true && leftPaddle.getY() <= getHeight() - leftPaddle.getHeight())
		{
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		
		if(keys[2] == true && rightPaddle.getY() >= 0)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		
		if(keys[3] == true && rightPaddle.getY() <= getHeight()-leftPaddle.getHeight())
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}