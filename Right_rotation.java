package Array;

import java.util.Arrays;

public class Right_rotation {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5}; 
		int rotation  = 2; 
		for(int i =0; i<rotation; i++) {
			int last = a[a.length-1]; 
			
			for(int j = a.length-1 ; j>0; j--) {
				a[j] = a[j-1];
			}
			a[0]=last;
		}
        System.out.println(Arrays.toString(a));
	}

}
