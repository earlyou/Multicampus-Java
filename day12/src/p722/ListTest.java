package p722;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();	// ����Ʈ�� String�� ��ڴ�.
//		List<String> list = new ArrayList<String>();		// �̷��� �ص���
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(2,"e");	// 2��°�� e�ְڴ�.
		
		for (String s : list) {
			System.out.println(s);
		}
		
	}

}
