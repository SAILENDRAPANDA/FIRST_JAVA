package javanew.com;

public class WORDCOUNT {
	
	
	
	public void wordCount1(String str){
		int count=1;
		for(int i=0;i<str.length();i++){
			
		
		if(str.charAt(i)==' '&& i<str.length()-1 && str.charAt(i)+1!=' ')
			count++;
	}
		System.out.println(count); 
		
	} public static void main(String[] args) {
		
WORDCOUNT w1=new WORDCOUNT();

w1.wordCount1("this is for counting word ");
	}
 
}
