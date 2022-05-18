package p722;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();	// 리스트에 String을 담겠다.
//		List<String> list = new ArrayList<String>();		// 이렇게 해도됨
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(2,"e");	// 2번째에 e넣겠다.
		
		for (String s : list) {
			System.out.println(s);
		}
		
	}

}
