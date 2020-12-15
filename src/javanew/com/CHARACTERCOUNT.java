package javanew.com;

public class CHARACTERCOUNT {

	public static void main(String[] args) {
	String str="aamar mane titli trippin";
	int count=0;
	int count1=0;
	for(int i=0;i<str.length();i++){
		
			if(str.charAt(i)!=' ') {
			count++;
	}
	//for(int j=0;j<str.length();j++){
	//if(str.charAt(i)==' ')
			else 
			{count1++;
	}
	}
		System.out.println("alphabets are "+ ""+count);
		System.out.println("spacess are "+ ""+count1);

	/*str=str.replace(" ","");
	 int count=0;
	 for(int i=0;i<str.length();i++)
	 {
		 count++;
	 }
	 System.out.println(count);
	}*/
	
}}