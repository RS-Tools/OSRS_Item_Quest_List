
public class Launcher {

	public static void main(String[] args) {
		
		Window w = new Window(500,500,"Item Buying List Maker");
		

		Quests q = new Quests();
		CheckList cl = new CheckList(q.chosen,w.jf);
	
	}

}
