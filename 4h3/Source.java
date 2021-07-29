import java.util.*;

class stringSorter implements Comparator<String> {
  
   public int compare(String o1, String o2) {
      if (o1.length() < o2.length()) {
         return -1;
      }
      if (o1.length() > o2.length()) {
         return 1;
      }
      return o1.compareTo(o2);
   }
}

public class Source {
    //CODE HERE
    public static List<String> sort(String input) {
      if (input == null) {
         return new ArrayList<String>();
      } else {
         String words[] = input.split(" ");
         ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(words));
         Collections.sort(arrayList, new stringSorter());
         return arrayList;
      }
    }
	public static void main(String[] args) {
	//CODE HERE	
	Scanner scanner = new Scanner(System.in);
      System.out.println(sort(scanner.nextLine()));
	}
}
