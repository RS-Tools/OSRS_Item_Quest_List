import java.util.ArrayList;
import java.util.Arrays;

public class Quests{

	Item[] blackKnightsFortressItems = {Items.addItem(1,"Cabbage"), Items.addItem(1,"Iron Chainbody"), Items.addItem(1,"Bronze Med Helm")};
	Quest blackKnightsFortress = new Quest("Black Knights' Fortress", "Short", blackKnightsFortressItems);
	
	Item[] cooksAssistantItems = {Items.addItem(1,"Bucket of Milk"),Items.addItem(1,"Egg"), Items.addItem(1, "Pot of Flour")};
	Quest cooksAssistant = new Quest("Cooks Assistant", "Very Short", cooksAssistantItems);
	
	Item[] corsairCurseItems = {Items.addItem(0,"Spade"), Items.addItem(0,"Tinderbox")};
	Quest corsairCurse = new Quest("Corsair Curse", "Short", corsairCurseItems);
	
	Item[] demonSlayerItems = {Items.addItem(1,"Coins"), Items.addItem(1, "Bucket of Water"), Items.addItem(25, "Bones")};
	Quest demonSlayer = new Quest("Demon Slayer", "Medium", demonSlayerItems);

	Item[] doricsQuestItems = {Items.addItem(6,"Clay"), Items.addItem(4,"Copper Ore"), Items.addItem(2,"Iron Ore")};
	Quest doricsQuest = new Quest("Dorics Quest", "Very Short", doricsQuestItems);
	
	Item[] dragonSlayerItems = {Items.addItem(1,"Hammer"), Items.addItem(3,"Normal Planks"), Items.addItem(90, "Steel Nails"),Items.addItem(1, "Unfired Bowl"), Items.addItem(1, "Wizard Mind Bomb"), Items.addItem(1, "Lobster Pot"), Items.addItem(1, "Silk"), Items.addItem(1, "Anti-Dragon Shield"), Items.addItem(2000, "Coins")};
	Quest dragonSlayer = new Quest("Dragon Slayer", "Long", dragonSlayerItems);
	
	Item[] ernestItems = {Items.addItem(0,"Spade"), Items.addItem(1,"Fish Food"), Items.addItem(1, "Poison")};
	Quest ernest = new Quest("Ernest The Chicken", "Short", ernestItems);
	
	Item[] goblinDiplomacyItems = {Items.addItem(3,"Goblin Mail"), Items.addItem(1,"Blue Dye"), Items.addItem(1, "Orange Dye")};
	Quest goblinDiplomacy = new Quest("Goblin Diplomacy", "Very Short", goblinDiplomacyItems);
	
	Item[] impCatcherItems = {Items.addItem(1,"Black Bead"), Items.addItem(1,"Yellow Bead"), Items.addItem(1, "Red Bead"), Items.addItem(1, "White Bead")};
	Quest impCatcher = new Quest("Imp Catcher", "Very Short", impCatcherItems);
	
	Item[] knightsSwordItems = {Items.addItem(1,"Redberry Pie"), Items.addItem(2, "Iron Bar"), Items.addItem(1, "Blurite Ore(or pickaxe)")};
	Quest knightsSword = new Quest("Knights Sword", "Medium", knightsSwordItems);
	
	Item[] misthalinItems = {Items.addItem(0,"Bucket"), Items.addItem(0, "Tinderbox")};
	Quest misthalin = new Quest("Misthalin Mystery", "Medium", misthalinItems);
	
	Item[] piratesTreasureItems = {Items.addItem(0,"White Apron(obtainable during)"), Items.addItem(0, "Spade"), Items.addItem(10, "Bananas(obtainable during)"),Items.addItem(1, "Karamjan Rum(obtainable during)"), Items.addItem(60, "Coins")};
	Quest piratesTreasure = new Quest("Pirates Treasure", "Short", piratesTreasureItems);
	
	
	Quest[] chosen = {blackKnightsFortress,cooksAssistant, corsairCurse, demonSlayer, doricsQuest, dragonSlayer, ernest, goblinDiplomacy, impCatcher, knightsSword, misthalin, piratesTreasure};
	static ArrayList<Quest> checked = new ArrayList<Quest>();
	
	public static void printTotal() {
	for(int i = 0;i< checked.size();i++) {
		for(int j = 0; j < checked.get(i).Items.length;j++) {
			Items.addToTotal(checked.get(i).Items[j].Name, checked.get(i).Items[j].Quantity);
		}
	}
	System.out.println("Total:" + Arrays.asList(Items.items));
	}
}
