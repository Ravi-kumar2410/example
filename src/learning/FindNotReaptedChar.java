package learning;

public class FindNotReaptedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	

		        int[] a = {1, 2, 3, 4, 3, 9,3, 2,8, 2, 2};
		     

		        for (int i = 0; i < a.length; i++) {
		           boolean repeated = false;

		            for (int j = 0; j < a.length; j++) {
		                if (i!=j&&a[i] == a[j]) {
		                    //count++;
		                    repeated = true;
		                   break; 
		                }
		            }
		            
		          

		            if ( !repeated) {
		                System.out.println(a[i]);
		            }
		        }
		        
		    }
		
}


