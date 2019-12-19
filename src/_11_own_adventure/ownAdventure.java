package _11_own_adventure;

//int choice = JOptionPane.showOptionDialog(null, "What will you do?", "Stranded", 0, JOptionPane.INFORMATION_MESSAGE, null,
//new String[] { "", "", ""}, null);
import javax.swing.JOptionPane;

public class ownAdventure {
	public static void main(String[] args) {
		int health = 0;
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
						health += 2;
						
					}
					else if(choice1 == 1)
					{
						JOptionPane.showMessageDialog(null, "You changed clothes and then moved on to explore the island.");
						health += 2;
						
					}
					else if(choice1 == 2)
					{
						JOptionPane.showMessageDialog(null, "You wanted to explore the island, but the injuries and dirty clothes hold you back. You decided to apply first aid kit AND a change of clothes");
						health += 3;
						
					}
		}
		{
			
			health--;
			System.out.println(health);
			JOptionPane.showMessageDialog(null, "Despite your injuries, you decide to move on.");
			exploreIsland();
			int choice2 = JOptionPane.showOptionDialog(null, "What will you do?", "Stranded", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Folow the stream", "Continue farther into the forest"}, null);
				if(choice2 == 0)
				{
					followStream();
				}
				if(choice2 == 1)
				{
					JOptionPane.showMessageDialog(null, "You continue farther into the forest and find some berries to eat, but you don't know if they are poisonous or not.");
					int choice3 = JOptionPane.showOptionDialog(null, "What will you do?", "Stranded", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Eat the berries", "Ignore and go back to stream", "Explore farther"}, null);
					if (choice3 == 0)
					{
						JOptionPane.showMessageDialog(null, "You eat the berries and noticed they tasted good. You don't feel like the"
								+ "\nberries are poisonous.");
						choice3 = JOptionPane.showOptionDialog(null, "What will you do?", "Stranded", 0, JOptionPane.INFORMATION_MESSAGE, null,
								new String[] { "Go back to stream", "Explore farther"}, null);
						if(choice3 == 0)
						{
							followStream();
						}
						if(choice3 == 1)
						{
							if(health == 2)
							{
								exploreForestSurviveAttack();
								followStream();
							}
							else
							{
							exploreForestNotSurviveAttack();
							}
						}
					}
					if(choice3 == 1)
					{
						followStream();
					}
					if(choice3 == 2)
					{
						if(health == 2)
						{
							exploreForestSurviveAttack();
							followStream();
						}
						else
						{
						exploreForestNotSurviveAttack();
						
						}
					}
				}
				int choice4 = JOptionPane.showOptionDialog(null, "What will you do?", "Stranded", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Check the building", "Continue down the shore"},null);
				if(choice4 == 0)
				{
					checkBuilding();
				}
				if (choice4 == 1)
				{
					boat();
				}
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
	public static void followStream() {
		JOptionPane.showMessageDialog(null, "You follow the stream and took a drink of water. After a few minutes of walking, you walk into a beach. But, the stream still goes somewhere else. "
				+ "\nSurprisingly, there is a building near the beach you found! It seems as if this island has been discovered before and maybe some people live in it.");
	}
	public static void exploreForestSurviveAttack() {
	JOptionPane.showMessageDialog(null, "You explore farther into the forest but find a several bears eating berries. You have no choice but to go back to the stream, but the bears saw you"
			+ "\n and attacked you. You were healthy enough to escape and go to back to the stream to wash your wounds.");
	}
	public static void exploreForestNotSurviveAttack() {
		JOptionPane.showMessageDialog(null, "You explore farther into the forest but find a several bears eating berries. You have no choice but to go back to the stream, but the bears saw you"
			+ "\n and attacked you. You weren't healthy enough to survive the attack and lay there with bears surrounding you.");
	}
	public static void checkBuilding() {
		JOptionPane.showMessageDialog(null, "You check the building and find furniture with people! You ask them where you are. They don't know either and they said they survived on the island"
				+ "\n and never knew where they were. You asked them where you can go out and they say there is a boat somewhere along the shore!");
	}
	public static void boat() {
		JOptionPane.showMessageDialog(null, "You saw that there was a boat and using the boat you were able to navigate around the sea! It looks like your adventure on the island is coming to an end!");
	}
}
