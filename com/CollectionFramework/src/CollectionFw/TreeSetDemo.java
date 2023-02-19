package CollectionFw;

import java.time.LocalDate;
//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		MobileSetDemo m1 = new MobileSetDemo("M101",12500,LocalDate.parse("2012-11-01"));
		MobileSetDemo m2 = new MobileSetDemo("M102",18500,LocalDate.parse("2012-11-18"));
		MobileSetDemo m3 = new MobileSetDemo("M103",13500,LocalDate.parse("2012-11-15"));
		MobileSetDemo m4 = new MobileSetDemo("M104",14000,LocalDate.parse("2012-11-22"));
		
		
		Set<MobileSetDemo> mobileSet = new TreeSet<>();
		
		mobileSet.add(m1);
		mobileSet.add(m2);
		mobileSet.add(m3);
		mobileSet.add(m4);
		
		
		System.out.println(mobileSet);
	}
}
