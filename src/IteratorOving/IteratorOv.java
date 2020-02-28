package IteratorOving;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorOv {

	public static void main(String[] args) {
	

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(4);
		
		Iterator<Integer> a = a1.iterator();
		
		while(a.hasNext()) {
			System.out.println(a.next());
		}

	}

}
