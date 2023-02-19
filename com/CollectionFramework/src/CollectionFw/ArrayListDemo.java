package CollectionFw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;


public class ArrayListDemo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int i = 10;
//		Integer j = Integer.valueOf(i); //Manual boxing converting primitive to object
//		Integer k = i; //Auto boxing internally converted in the form of Integer.valueOf(i);
//		
//		System.out.println(k);
//		
//		String s = "abc";
//		String t = s.valueOf(s);
//		
//		System.out.println(t);
//		
//		int l = k.intValue();//Manual Unboxing 
//		int m = k; //auto unboxing
//		System.out.println(l);
		
		int[] arr = {1,2,3,4};
		int[] arr1 = {5,6,7,8};
		
		List<Integer> set1 = new ArrayList(Arrays.asList(arr));
		
		for(int i=0;i<set1.size();i++) {
			System.out.println(set1.get(i));
		}
//		Object orr[] = set1.toArray();
//		
//		for(int i=0;i<orr.length;i++) {
//			int value = (Integer)orr[i];
//			System.out.println(value);
//		}
			
		
	}

	

}
