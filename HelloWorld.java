public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("Hello Daniel");
		Chicken chicken;
		Chicken chicken1;
		Chicken chicken2;
		Chicken chicken3;
		chicken = new Chicken();
		chicken1 = new Chicken();
		chicken2 = new Chicken();
		chicken3 = new Chicken();
		chicken.initialize("Lucy","cafe",2);
		chicken.showData();
		chicken1.initialize1("Claudia");
		chicken1.showData1();
		chicken2.initialize1("Juana");
		chicken2.showData2();
		chicken3.initialize1("Pepita");
		chicken3.showData3();
		
	}
}