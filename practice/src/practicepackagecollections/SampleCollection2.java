package practicepackagecollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SampleCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(18);
		a.add(100);

		// Iterator ite = a.iterator();
		// while(ite.hasNext()) {

		// }

		int headi = 0, len,head = 0, tail, diff = 0;
		// Object head,tail;
		len = a.size();
		int ndiff = 0;
		
		for (int i = 0; i< len; i++) {
			int j = i + 1;
			headi = a.get(i);
			//System.out.println("h");
			if (j > a.size()) {
				tail = a.get(i);
			} else {
				tail = a.get(j);
				
			}
			ndiff = headi - tail;
			
			// Iterator ite = a.iterator();
			// while(ite.hasNext()) {
			// head = ite.next();
			// tail = ite.
			// tail = ite.previousIndex();

			;
			// int head;
			if(ndiff>diff) {
			 diff=ndiff;
			head = a.indexOf(headi);

			// System.out.println(diff);

			//
			// System.out.println(diff);
		}
		}
		System.out.println(head);
		System.out.println(diff);
	}
}

