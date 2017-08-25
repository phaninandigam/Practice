package serialization;

public class Animal
{
	 int i=10;

	public Animal()
	{
		i=12;
		System.out.println("Animal constructor.");
		System.out.println("updated ");
	}
	
	{
		i=11;
		System.out.println("Instance block of Animal");
	}
}
