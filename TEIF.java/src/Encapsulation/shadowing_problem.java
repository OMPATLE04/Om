package Encapsulation;

public class shadowing_problem {
	public static void main (String []args) {
		
		Employee e = new Employee("om" , 220100652 , 5000000 );
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getSallary());
		
		}

	}
	class Employee1{ 
		private String Name;
		private int Id;
		private int Sallary;
		
		public Employee1(String Name , int Id  , int Sallary) {
			this.Name = Name;			
			this.Id = Id;
			this.Sallary = Sallary;
		}
		
		public String getName(){
			return Name;
		}
		public int getId(){
			return Id;
		}
		public int getSallary(){
			return Sallary;
		}
	}

//	1 . according to industry standard the name of the local variable  inside the local variable
//	    must be same as the name of the instance variable.
//	2.  but when we do this modification of values is not reflected in the instance variable.
//	3 . this is because the JVM is not able to differentiate between local and instance var.
//	4.  As a result all the modification are basically happening on the local var them self.
//	5.  it appears that the local variable and shadowing the instance  variable and hence the above prob 
//	    is also known as shadowing problem.


	