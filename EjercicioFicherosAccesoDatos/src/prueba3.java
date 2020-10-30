import java.util.ArrayList;

public class prueba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
	      al.add("a");
	      al.add("b");
	      al.add("c");
	      StringBuffer sb = new StringBuffer();
	      
	      for (String s : al) {
	         sb.append(s);
	         sb.append(" ");
	      }
	      String str = sb.toString();
	      System.out.println(str);
	}

}
