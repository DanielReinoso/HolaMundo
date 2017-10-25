public class Chicken
{
	
	//Clases con Uper camel Case
	//Atributos con Lower Camel Case
	//Metodos con Lower Camel Case
	//Variables con Lower Camel Case
		private String name;
		private String color;
		private int  age;
		public void initialize(String name, String color, int age)
		{
			this.name=name; //el primero es el atributo de la clase el segundo es el parametro que recibo
			this.color=color;
			this.age=age;
		}
		public void layAndEgg()
		{
			System.out.println("The Chicken lay an egg");
		}
		public void poop()
		{
			System.out.println("The Chicken pooped");
		}
		public void drink()
		{
			System.out.println("The Chicken drank");
		}
		public void showData()
		{
			System.out.println("The Name of the Chiken is: " + name + "Color: " + color + "Age: " + age);
		}

	

}