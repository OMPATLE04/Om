package TEIF;

public class fanss {
		String  brand ;
		int cost;
		String color;
		void fans() {
			System.out.println("fans");
		}
		
		public class fanAPP{
			public static void main(String [] args) {
				fanss f1 = new fanss();
				System.out.println("before assigning values");
				System.out.println(f1.brand);
				System.out.println(f1.cost);
				System.out.println(f1.color);
				System.out.println("After assigning values");
				f1.brand = "surya";
				f1.cost=5000;
				f1.color="black";
				System.out.println(f1.brand);
				System.out.println(f1.cost);
				System.out.println(f1.color);
				
				
				
			
		}
			
		

	}

	}

