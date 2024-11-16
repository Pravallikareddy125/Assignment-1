package Assignment1;

public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {4,6,8,2,1,7};
		int y=15;
		for(int i=0;i<=x.length-1;i++) {
			for(int j=i+1;j<=x.length-1;j++) {
				if(y==x[i]+x[j]) {
					System.out.println(x[i]+ ","+ x[j]);
				}
			}
		}

	}

	}


