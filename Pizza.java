import java.util.Scanner;

enum Size
{
	Normal,
	Large
}

enum Topping
{
	Ham,
	Moshroom,
	Corn,
	Chees,
	Salami,
	Egg
}

enum Base
{
	Tomato,
	SourCream,
	BBQ,
	HotPepper
}

class Pizza
{
	private Base base = Base.Tomato;
	private Topping[] toppings = {Topping.Chees};
	private Size size = Size.Normal;
	
	Pizza() { }
	
	Pizza(Base base, Topping[] toppings)
	{
		this.base = base;
		this.toppings = toppings;
	}
	
	Pizza(Base base, Topping[] toppings, Size size)
	{
		this.base = base;
		this.toppings = toppings;
		this.size = size;
	}
	
	public int Price()
	{
		int basePrice = 1500;
		if(this.size == Size.Large)
		{
			basePrice *= 2.5;
		}
		if(this.toppings.length > 3)
		{
			basePrice += (this.toppings.length - 3) * 100;
		}
		return basePrice;
	}
}

class Main
{
	public static void main(String[] args)
	{
		/*
		Pizza margarita = new Pizza();
		Pizza songoku = new Pizza(
									Base.Tomato,
									new Topping[]
									{
										Topping.Ham,
										Topping.Moshroom,
										Topping.Corn,
										Topping.Chees
									}
								);
								
		System.out.println("margarita: " + margarita.Price() + "Ft");
		System.out.println("Songoku: " + songoku.Price() + "Ft");
		*/
		Pizza[] order;
		Scanner cin = new Scanner(System.in);
		scanner.nextLine()
		do
		{
			
		}while()
	}
}




















