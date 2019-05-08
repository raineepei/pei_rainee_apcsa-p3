import javax.swing.JFrame;
import java.awt.Component;

public class Extension extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Extension()
	{
		super("PONG EXTENSION");
		setSize(WIDTH,HEIGHT);

		PongExtension game = new PongExtension();

		((Component)game).setFocusable(true);
		getContentPane().add(game);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		Extension run = new Extension();
	}
}

