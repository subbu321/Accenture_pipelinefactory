import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class arrayPratice {

	public static void main(String[] args) {
        ArrayList<Integer> i =new ArrayList<Integer>();
        i.add(20);
        i.add(28);
        i.add(22);
      //  i.set(0,28); //values modified in present array index
        //System.out.println(i.get(0));
       // i.remove(1);  //remove values from mentioned index
        System.out.println(i.get(1));
        Collections.sort(i);
    for (Integer integer : i) {
		System.out.println(integer);
	} 
    ArrayList<String> s=new ArrayList<String>();
    s.add("cars");
    s.add("bull");
    s.add("bike");
    s.add("ninja");
    s.add("car");
    s.add("call");
    Collections.sort(s);
    for (String string : s) {
		System.out.println(string);
    }
	HashMap<String,String> cc=new HashMap<String,String>();
		cc.put("subbu", "342");
		System.out.println(cc);

      
		Map<String,Integer>map=new HashMap<>();
	System.out.println(map.isEmpty());
		
	}

}
