package Assignment1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="mom";
		String b="";
		int n=a.length();
		for(int i=n-1;i>=0;i--){
			b=b+a.charAt(i);
		}
			if (a==b){
				System.out.println("palindrome");
				
			}
			else {
				System.out.println("not palindrome");
			}
			
		
		

	}

}
