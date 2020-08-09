class Course {
	void start()
	{
		
	}
	void end()
	{
		
	}
}
	class Basic extends Course
	{
		void start() 
		{
			System.out.println("Basic starrt");
		}
		void end() 
		{
			System.out.println("Basic course end");
		}
	}
	class MsCit extends Course
	{
		void start()
		{
			System.out.println("MsCit start");
		}
		void end() 
		{
			System.out.println("Mscit course end");
		}
	}
	class DbDa extends Course
	{
		void start() {
			System.out.println("DbDa start");
		}
		void orientation() {
			System.out.println("DbDa orientation");
		}
		void end() 
		{
			System.out.println("DbDa course end");
		}
	}

public class CourseDemo {
	static void perform(Course ref) 
	 {
		 if(ref instanceof DbDa)
		 {
			DbDa obj=(DbDa)ref;
			obj.orientation();
		 }
		 ref.start();
		 ref.end();
	 }
		public static void main(String[] args)
		{       
			perform(new DbDa());
			perform(new Basic());
			perform(new MsCit());
			
		}
		

	}