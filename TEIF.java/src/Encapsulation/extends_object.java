package Encapsulation;

public class extends_object {
public static void main (String []args) {
		
		s_Employee e = new s_Employee("om" , 220100652 , 5000000 );
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getSallary());
		
		}

	}

	class S_Employee1 extends Object{ 
		 String Name;
		 int Id;
		 int Sallary;
		
		public S_Employee1(String Name , int Id  , int Sallary) {
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
	

