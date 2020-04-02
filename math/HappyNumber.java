package math;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
//	
//	//Using Hashset
//	public boolean isHappy(int n) {
//
//		Set<Integer> set = new HashSet<Integer>();
//		set.add(n);
//		while (n != 1) {
//			int num = 0;
//			while (n > 0) {
//				num += Math.pow(n % 10, 2);
//				n /= 10;
//			}
//			System.out.println(num);
//			if (set.contains(num))
//				return false;
//			set.add(num);
//			n = num;
//
//		}
//		return true;
//	}

	// Using Slow Pointer and Fast Pointer
	public boolean isHappy(int n) {
		int sp = n, fp = n;

		do {

			sp = calculate(sp);
			fp = calculate(calculate(fp));
			System.out.println("sp = " + sp + " fp = " + fp);
			if (sp == 1 || fp == 1)
				return true;
		} while (sp != fp);

		return false;
	}

	int calculate(int n) {
		int num = 0;
		while (n > 0) {
			num += Math.pow(n % 10, 2);
			n /= 10;
		}
		return num;
	}

}
