package package1;

public class Dice 

{



	//fields

	private int rolls;

	

	//constructors

	public Dice() 

	{

		rolls = 0;		

	}

	//methods

	public int roll() 

	{

		int value = (int)(1 + 6 * Math.random());

		rolls++;

		return value;

	}

	public int numRolls() 

	{

		return rolls;

	}

	public void reset()

	{

		rolls = 0;

	}

}