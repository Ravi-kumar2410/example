package learning;

import java.util.Arrays;

public class AddtwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {8,3,8,4,4};
		int b[]= {8,5,3,2,};
		int c= (a.length+b.length);
		int []c1 = new int[c];
		//System.out.print(Arrays.toString(n));
		
		for(int i=0;i<a.length;i++) {
			c1[i]=a[i];
		
			
		}
		for(int i=0;i<b.length;i++) {
			c1[a.length+i]=b[i];
		}

			
		System.out.println(Arrays.toString(c1));
		
	}

}
