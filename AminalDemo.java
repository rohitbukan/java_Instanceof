class Animal {
	void makesound()
	{
		
	}
}
	class Dog extends Animal
	{
		void makesound() 
		{
			System.out.println("Dog Bark");
		}
	}
	class Cat extends Animal
	{
		void makesound()
		{
			System.out.println("Cat meo meo");
		}
	}
	class Tiger extends Animal
	{
		void makesound() {
			System.out.println("Tiger Roar");
		}
		void hunting() {
			System.out.println("Tiger hunting the people");
		}
	}

public class AminalDemo {
	static void perform(Animal ref) 
	 {
		 if(ref instanceof Tiger)
		 {
			Tiger obj=(Tiger)ref;
			obj.hunting();
		 }
		 ref.makesound();
	 }
		public static void main(String[] args)
		{       
			perform(new Tiger());
			perform(new Dog());
			perform(new Cat());
			
		}
		

	}