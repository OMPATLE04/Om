package Encapsulation;

public class compile_err {
public static void main (String []args) {
		
		s_Employee e = new s_Employee( );
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getSallary());
		
		}

	}
	class s_Employee{ 
		private String Name;
		private int Id;
		private int Sallary;
		
		public s_Employee(String Name , int Id  , int Sallary) {
			 this.Name = Name;			this.Id = Id;
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

// in the above program the compiler will look for such a constructor which does not accept any argument 
//but their is no such constructor present in their class and hence we are going to get a compile time error.

