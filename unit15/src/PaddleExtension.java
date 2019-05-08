import java.awt.Color;
import java.awt.Graphics;

public class PaddleExtension extends Paddle {

	public PaddleExtension() {
		super();
	}
	
	public PaddleExtension(int x, int y){
		  super(x,y);
		  super.setSpeed(5);
	   }
 
	public PaddleExtension(int x, int y, int wid, int ht){
		   super (x,y,wid,ht);
		   super.setSpeed(5);
	   }
 
	public PaddleExtension(int x, int y, int spd){
			super (x,y);
			super.setSpeed(spd);
		}
 
	public PaddleExtension(int x, int y, int wid, int ht,int spd){
			super (x,y, wid,ht);
			super.setSpeed(spd);
		}
 
	public PaddleExtension(int x, int y, int wid, int ht, Color col, int spd){
			super(x,y,wid,ht,col,spd);
		}
	
	public void moveRightAndDraw(Graphics window) {
		draw(window, Color.WHITE);
		setX(getX()+super.getSpeed());
		draw(window);
	}
	
	public void moveLeftAndDraw(Graphics window) {
		draw(window, Color.WHITE);
		setX(getX()-super.getSpeed());
		draw(window);
	}
}
