package learning;

public class AddCroseElementTwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]a= {{1,2,3},{3,5,4},{9,5,8}};
		int sum=0;
		int len=a.length;
			
			for(int i=0;i<len;i++) {
				 sum+=a[i][i];
				 if(len%2!=0&&i==len/2)
					 continue;
				 
				 sum+=a[i][len-1-i];
				 
			}
			
				System.out.println(sum);

	}

}
