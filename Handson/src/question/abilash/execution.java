package question.abilash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		
		a = con(a, a.size());
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}
	
	 static ArrayList<Integer> con(ArrayList<Integer> a, int n) {
		int o=0;
		int s=o;
		int q=a.size()-1;
		ArrayList<Integer> b= new ArrayList<>();
		
		while(o<q) {
			
			
			
			 			
			while(a.get(o)%2==0) {
				//a.set(o, p);
				o++;
				s++;
				
			}while(a.get(q)%2!=0 && o<q){
				//a.set(s,p);
				q--;
				
				
			}
			
			if(o<q) {
			
				int t=a.get(o);
				a.set(o, a.get(q));
				a.set(q, t);

			}
		
		}
		//a.sort(Comparator.reverseOrder());
		return a;		
	
	}
}


