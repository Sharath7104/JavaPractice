package CollectionFw;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
//import java.util.TreeSet;



public class SetDemo{
	public static void main(String[] args) {
		MobileSetDemo m1 = new MobileSetDemo("M101",12500,LocalDate.parse("2012-11-01"));
		MobileSetDemo m2 = new MobileSetDemo("M102",18500,LocalDate.parse("2012-11-18"));
		MobileSetDemo m3 = new MobileSetDemo("M103",13500,LocalDate.parse("2012-11-15"));
		MobileSetDemo m4 = new MobileSetDemo("M104",14000,LocalDate.parse("2012-11-22"));
		Set<MobileSetDemo> mobileSet = new HashSet<>();
		
		mobileSet.add(m1);
		mobileSet.add(m4);
		mobileSet.add(m3);
		mobileSet.add(m2);
		
		Iterator<MobileSetDemo> itr = mobileSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//		System.out.println(mobileSet);
		System.out.println();
		Set<MobileSetDemo> linkedMob = new LinkedHashSet<>();	
		linkedMob.add(m1);
		linkedMob.add(m4);
		linkedMob.add(m3);
		linkedMob.add(m2);
		
		Iterator<MobileSetDemo> linkitr = linkedMob.iterator();
		
		while(linkitr.hasNext()) {
			System.out.println(linkitr.next());
		}
	}
	
	
}
