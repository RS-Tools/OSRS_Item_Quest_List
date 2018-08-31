import javax.swing.JFrame;

public class Window extends JFrame {

	int HEIGHT;
	int WIDTH;
	String TITLE;
	JFrame jf;
	
	public Window(int h, int w, String t) {
		this.TITLE = t;
		this.HEIGHT = h;
		this.WIDTH = w;
		jf = new JFrame(t);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
}


