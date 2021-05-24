package string2;

public class Test {
	
  
	public static void main(String[] args) {
		String string1="ccccccc";
		String string2="dd";
		String st =StringUtiles.betterString(string1,string2,(s1,s2)->s1.length()>s2.length());
		System.out.println(st);
		System.out.println(IsAlphapet("SDW2"));
	}
    public static boolean IsAlphapet(String str) {
    	for(int i=0; i<str.length();i++) {
    	if (!Character.isLetter(str.charAt(i)))
    		return false;
    }
    	return true;
    }
}
