package practicepackagecollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SampleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(7);
		a.add(4);
		ArrayList<Integer> b = new ArrayList<>();
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		b.add(0);
		ArrayList<Integer> c = new ArrayList<>();

		int i = 0;
		for (i = 0; i < b.size(); i++) {
			int j;
			j=b.get(i);
			if (a.contains(j)) {
				//System.out.println('l');
				c.add(j);
			}

			// Collection<Integer> s = new ArrayList<Integer>();

		}
		System.out.println(c);
	}
}
