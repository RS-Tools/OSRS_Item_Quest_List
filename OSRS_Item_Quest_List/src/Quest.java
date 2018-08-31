import java.util.Arrays;

public class Quest {

	String Name;
	String Length;
	Item[] Items;
	
	public Quest(String name, String length, Item[] items ) {
		this.Name = name;
		this.Length = length;
		this.Items = items;
	}
	
	@Override
	public String toString() {
		return "Name:" + this.Name + "\t Length:" + this.Length + " \t" + Arrays.asList(this.Items);
	}
	
}
