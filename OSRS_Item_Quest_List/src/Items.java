import java.util.ArrayList;

public class Items{

	static ArrayList<Item> items = new ArrayList<Item>();
	
	public static Item addItem(int quant, String string ) {
		
		return new Item(string).quantityToAdd(quant);
		
	}
	
	
	
	public static void addToTotal(String name, int q) {
		if(items.size() == 0) {
			items.add(new Item(name).quantityToAdd(q));
			return;
		}
		
		for(int k = 0; k < items.size();k++) {
			if(name.equalsIgnoreCase(items.get(k).Name)) {
				items.get(k).quantityToAdd(q);
				k = 0;
				return;
			}
		}
		items.add(new Item(name).quantityToAdd(q));
		return;
		}
	
	
}
