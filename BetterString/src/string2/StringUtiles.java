package string2;
interface StringForm{
	boolean FormCompare(String s1,String s2);
}
public class StringUtiles {
	public static String betterString(String s1,String s2,StringForm cp)
	{
		if (cp.FormCompare(s1, s2))
			return s1;
		return s2;
	}

}
