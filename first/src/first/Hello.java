package first;

import java.util.List;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TEST");
		
		String[] list = {"1","2"};
		
		for(int i = 0 ; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		Object[] nameList = {"test","test2"};
		
		
		
		System.out.println(nameList[0]);
		System.out.println(nameList[1]);
		
		for(int j = 0 ;j<nameList.length;j++) {
			System.out.println(nameList[j]);
		}
	}

}
