public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("Hello Kevin");
		Chicken chicken;
		chicken = new Chicken();
		chicken.initialize("lucy","cafe",2);
		chicken.showData();
	}
}