import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class PongExtension extends Canvas implements KeyListener, Runnable {
	
	private Ball ball;
	private PaddleExtension mainPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private ArrayList<Block> blocks = new ArrayList<Block>();
	private boolean played = false;
	
	public PongExtension()
	{
		//set up all variables related to the game
		ball = new Ball(350, 200);
		mainPaddle = new PaddleExtension(375, 275, 50, 50, Color.BLUE, 2);
		//blocks on the left
		for (int x = 5; x < 85; x += 40) {
			for (int y = 5; y < 600-55; y += 80) {
				blocks.add(new Block(x, y, 35, 75, Color.BLACK));
			}
		}
		//blocks on top
		for (int x = 85; x < 675; x += 80) {
			for (int y = 5; y < 85; y += 40) {
				blocks.add(new Block(x, y, 75, 35, Color.BLACK));
			}
		}
		
		//blocks on bottom
		for (int x = 85; x < 675; x += 80) {
			for (int y = 525; y > 445; y -= 40) {
				blocks.add(new Block(x, y, 75, 35, Color.BLACK));
			}
		}
		
		//blocks on left
		for (int x = 725; x < 800; x += 40) {
			for (int y = 5; y < 600-55; y += 80) {
				blocks.add(new Block(x, y, 35, 75, Color.BLACK));
			}
		}

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
		mainPaddle.draw(graphToBack);
		for (Block b: blocks) {
			b.draw(graphToBack);
		}


		//see if ball hits left wall or right wall
		if(ball.getX()<0)
		{
			ball.setXSpeed(Math.abs(ball.getXSpeed()));
		}
		else if (ball.getX() > getWidth()) {
			ball.setXSpeed(-1*Math.abs(ball.getXSpeed()));
			/* ball.setYSpeed(0);
			if (ball.getX() <= mainPaddle.getX()){
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
			*/
		}

		
		//see if the ball hits the top or bottom wall 
		if(ball.getY()<0) {
			ball.setYSpeed(Math.abs(ball.getYSpeed()));
		}
		else if (ball.getY() > getHeight()) {
			ball.setYSpeed(-1*Math.abs(ball.getYSpeed()));
		}



		//see if the ball hits the left paddle
		if (ball.didCollideLeft(mainPaddle)) 
		{
			ball.setXSpeed(Math.abs(ball.getXSpeed()));
		}
		else if (ball.didCollideRight(mainPaddle)) {
			ball.setXSpeed(-Math.abs(ball.getXSpeed()));
		}
		else if (ball.didCollideBottom(mainPaddle)) 
		{
			ball.setYSpeed(Math.abs(ball.getYSpeed()));
		}
		else if (ball.didCollideTop(mainPaddle)) {
			ball.setYSpeed(-Math.abs(ball.getYSpeed()));
		}
		
		for (Block b: blocks) {
			if (ball.didCollideLeft(b) || ball.didCollideRight(b) ) {
				b.setColor(Color.WHITE);
				b.draw(graphToBack);
				blocks.remove(b);
				ball.setXSpeed(-ball.getXSpeed());
			}
			else if (ball.didCollideTop(b) || ball.didCollideBottom(b)) {
				b.setColor(Color.WHITE);
				b.draw(graphToBack);
				blocks.remove(b);
				ball.setYSpeed(-ball.getYSpeed());
			}
		}
		//see if the paddles need to be moved
		if(keys[0] == true && mainPaddle.getY() >= 85)
		{
		mainPaddle.moveUpAndDraw(graphToBack);
		}
		
		if(keys[1] == true && mainPaddle.getY() <= 425)
		{
			mainPaddle.moveDownAndDraw(graphToBack);
		}
		
		if(keys[2] == true && mainPaddle.getX() >= 85)
		{
			mainPaddle.moveLeftAndDraw(graphToBack);
		}
		
		if(keys[3] == true && mainPaddle.getX() <= 665)
		{
			mainPaddle.moveRightAndDraw(graphToBack);
		}
			
		if (blocks.size() == 0) {
			if (!played) {
				//set up all variables related to the game
				ball = new Ball(350, 200);
				mainPaddle = new PaddleExtension(375, 275, 50, 50, Color.BLUE, 2);
				//blocks on the left
				for (int x = 5; x < 85; x += 40) {
					for (int y = 5; y < 600-55; y += 80) {
						blocks.add(new Block(x, y, 35, 75, Color.BLACK));
					}
				}
				//blocks on top
				for (int x = 85; x < 675; x += 80) {
					for (int y = 5; y < 85; y += 40) {
						blocks.add(new Block(x, y, 75, 35, Color.BLACK));
					}
				}
				
				//blocks on bottom
				for (int x = 85; x < 675; x += 80) {
					for (int y = 525; y > 445; y -= 40) {
						blocks.add(new Block(x, y, 75, 35, Color.BLACK));
					}
				}
				
				//blocks on left
				for (int x = 725; x < 800; x += 40) {
					for (int y = 5; y < 600-55; y += 80) {
						blocks.add(new Block(x, y, 35, 75, Color.BLACK));
					}
				}
				played = true;
				graphToBack.setColor(Color.BLUE);
				graphToBack.drawString("Level 2!", 400, 300);
			}
			else {
				ball.setXSpeed(0);
				ball.setYSpeed(0);
				graphToBack.setColor(Color.BLUE);
				graphToBack.drawString("You win!", 400, 300);
			}
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;
			case 'A' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'S' : keys[1]=false; break;
			case 'A' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
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

