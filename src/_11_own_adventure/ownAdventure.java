package _11_own_adventure;
//int choice = JOptionPane.showOptionDialog(null, "What will you do?", "Stranded", 0, JOptionPane.INFORMATION_MESSAGE, null,
//new String[] { "", "", ""}, null);
import javax.swing.JOptionPane;

public class ownAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You were on a trip to the other side of the world, but suddenly your plane malfunctioned and "
				+ "crashed into a\n nearby island. Fortunately, you survived the crash, but severely injured."
				+ " Everyone else was killed during the crash.\n You also found your briefcase with items in there.");
		int choice = JOptionPane.showOptionDialog(null, "What will you do?", "Stranded", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Check the briefcase", "Move on to explore the island"}, null);
		if(choice == 0)
		{
			checkBriefcase();
			int choice1 = JOptionPane.showOptionDialog(null, "What will you do?", "Stranded", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Apply the first aid kit", "Change clothes", "Keep everything and take the briefcase with you"}, null);
					if(choice1 == 0)
					{
						JOptionPane.showMessageDialog(null, "You applied the first aid kit then moved on to explore the island. You started to feel a little better.");
						exploreIsland();
					}
					if(choice1 == 1)
					{
						JOptionPane.showMessageDialog(null, "You changed clothes and then moved on to explore the island.");
						exploreIsland();
					}
					if(choice1 == 2)
					{
						JOptionPane.showMessageDialog(null, "You wanted to explore the island, but the injuries and dirty clothes hold you back. You decided to apply first aid kit AND a change of clothes");
						exploreIsland();
					}
		}
		if(choice == 1)
		{
			exploreRiverOrForest();
		}
	}
	public static void checkBriefcase() {
		JOptionPane.showMessageDialog(null, "You checked the briefcase and found clothes and first aid kits!");	
	}
	public static void exploreIsland() {
		JOptionPane.showMessageDialog(null, "You realized that the island was nothing but forest. You move on into the woods and find bugs \n "
				+ "you've never seen. Further into a forest, you find a stream of water leading to somewhere.");
	}
	public static void exploreRiverOrForest() {
		int choice2 = JOptionPane.showOptionDialog(null, "What will you do?", "Stranded", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Folow the stream", "Continue farther into the forest"}, null);
	}
}
