interface function{
		void display(String[] courses);
}
class MainInterface{
	public static void main(String...args)
	{
			String str[]={"Java Fullstack","Python","Web Design","C++"};
			System.out.println("Welcome to Anudip Foundations");
			function f=(String[] courses)->{
				for(String i:courses)
				{
					System.out.println(i);
				}
			};
			f.display(str);
	}
}