package strings;

public class string_buffer {
	public static void main(String []args) {
		
		// same for StringBuilder  
		
		StringBuffer b = new StringBuffer("Md ");
		System.out.println(b);
		
		
		StringBuffer sb = new StringBuffer( );
		System.out.println(sb.capacity());
		
		StringBuffer ab = new StringBuffer();
		ab.append("Ronaldo");
		System.out.println(ab.capacity());
		
		StringBuffer cb = new StringBuffer();
		cb.append("is a great footballer");
		System.out.println(cb.capacity());
		
		StringBuffer a = new StringBuffer(10);
		System.out.println(a.capacity());
		
		StringBuffer x = new StringBuffer();
		System.out.println(x.capacity());
		x.ensureCapacity(31);
		System.out.println(x.capacity());
		
		
		StringBuffer y = new StringBuffer();
		System.out.println(y.capacity());
		y.append("Ronaldo");
		y.trimToSize();
		System.out.println(y.capacity());
		
		
		
		
		
		
		
	}

}
