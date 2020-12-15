package javanew.com;

public class OCCURENCECOUNT {

	public static void freqcount(String str){
		//String str="that was an was that an ab hai";
		str=str.replace(" ","");
		while(str.length()>0){
			char ch=str.charAt(0);
			int count=0;
			for(int i=0;i<str.length();i++){
			if(ch==str.charAt(i))
			{
				count++;
			}
			
			}
			System.out.println(ch + " " +count );
			str=str.replace(""+ch,"");
		}
	} 
		/*public static int fr(String str,char ch){
			int count=0;
			while(str.indexOf(ch)!=-1){
				count++;
				str=str.substring(str.indexOf(ch)+1);
			}
			return count;
			
		}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
OCCURENCECOUNT w=new OCCURENCECOUNT();
w.freqcount("ab tere ab hai tere");
	}

}
