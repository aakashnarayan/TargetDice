package package1;

import java.util.Scanner;

public class DiceStuff 
{
	public static void main(String[] args)
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();

		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int numRolls = 1;
		System.out.println(roll1 + " " + roll2);
		while (roll1 != roll2)
		{
			numRolls++;
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			System.out.println(roll1 + " " + roll2);
		}
		
		if (numRolls == 0)
		{	
		

		}

		if(numRolls == 1)
		{
			System.out.println("You have rolled two " + roll1 +"s! \nIt took " + " roll to roll doubles.");
		}
		
		else
		{
			System.out.println("You have rolled two " + roll1 +"s! \nIt took " + numRolls + " rolls to roll doubles.");
		}
		
		//Target Dice
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Predict a target value: ");
		int value = in.nextInt();
		while (value < 2)
		{
			System.out.println("Predict a target value: ");
			value = in.nextInt();
		}
		
		while (value > 12)
		{
			System.out.println("Predict a target value: ");
			value = in.nextInt();
		}
		
		numRolls = 0;
		
		while (roll1 + roll2 != value)
		{
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			numRolls++;
			System.out.println(roll1 + " " + roll2);
		}
		System.out.print("It took " + numRolls + " rolls to reach the target value of " + value + ".");
		
	}
}
