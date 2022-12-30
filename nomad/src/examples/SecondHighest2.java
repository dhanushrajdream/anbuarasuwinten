package examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighest2 {
	public static void main(String[] args) {
		Integer a[]= {1,2,5,6,2,3};
		int total=a.length;
		List<Integer>list=Arrays.asList(a);
		Collections.sort(list);
		int element=list.get(total-2);
		System.out.println(element);
	}

}
