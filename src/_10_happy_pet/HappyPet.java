package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		for(int i = 0; i < 10; i++) {
			int task = JOptionPane.showOptionDialog(null, "Choose an action", "Happiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle/Pet", "Give Food", "Give Water", "Take a Walk", "Groom", "Clean Up Poop", "Play", "Train" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(task == 0)
			{
				cuddle();
			}
			if(task == 1)
			{
				giveFood();
			}
			if(task == 2)
			{
				giveWater();
			}
			if(task == 3)
			{
				takeAWalk();
			}
			if(task == 4)
			{
				groom();
			}
			if(task == 5)
			{
				cleanUpPoop();
			}
			if(task == 6)
			{
				play();
			}
			if(task == 7)
			{
				train();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel >= 100)
			{
				JOptionPane.showMessageDialog(null, "Your pet loves you now! There is absolutely no way that you can seperate now!");
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void cuddle() {
		JOptionPane.showMessageDialog(null, "Your pet shows a bit of aggression at first, but then realizes that you don't want to him/her. You gained 10 happiness!");
		happinessLevel += 10;
		System.out.println(happinessLevel);
	}
	public static void giveFood() {
		JOptionPane.showMessageDialog(null, "Your pet really liked your food! Your pet looked like it begged for more. You gained 20 happiness!");
		happinessLevel += 20;
		System.out.println(happinessLevel);
	}
	public static void giveWater() {
		JOptionPane.showMessageDialog(null, "Your pet didn't really need water, but drank it anyway. You gained 5 happiness!");
		happinessLevel += 5;
		System.out.println(happinessLevel);
	}
	public static void takeAWalk() {
		JOptionPane.showMessageDialog(null, "Your pet was spinning around in circles waiting for you to go outside! You gained 25 happiness!");
		happinessLevel += 25;
		System.out.println(happinessLevel);
	}
	public static void groom() {
		JOptionPane.showMessageDialog(null, "Your pet certainly did not like the experience, however, you were satisfied at how he/she looked! You lost 10 happiness!");
		happinessLevel -= 10;
		System.out.println(happinessLevel);
	}
	public static void cleanUpPoop() {
		JOptionPane.showMessageDialog(null, "Your pet didn't care about you picking up the poop, but it felt somewhat thankful! You gained 5 happiness!");
		happinessLevel += 5;
		System.out.println(happinessLevel);
	}
	public static void play() {
		JOptionPane.showMessageDialog(null, "Your pet had a fun time with you! You gained 15 happiness!");
		happinessLevel += 15;
		System.out.println(happinessLevel);
	}
	public static void train() {
		JOptionPane.showMessageDialog(null, "Your pet seems like it's learning fast! You already taught him/her how to sit, lay down, and stay! You gained 10 happiness!");
		happinessLevel += 10;
		System.out.println(happinessLevel);
	}
}