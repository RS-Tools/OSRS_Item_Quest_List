
public class Item{

	String Name;
	int Quantity;
	
	public Item(String name) {
		this.Name = name;
	}
	
	@Override
	public String toString() {
		if (this.Quantity > 0) {
		return this.Quantity + " " + this.Name;
	} else {
		return this.Name;
	}
	}
	
	public Item quantityToAdd(int q) {
		this.Quantity += q;
		return this;
	}
}
