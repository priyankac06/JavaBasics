package Programs;
import java.util.Arrays;
public class StringFunctions2 
{
	static int countofalpha=0;
	static int countofnumeric=0;
	static int countofspace=0;
	static int counofspecialcharacter=0;
public static void main(String[] args) 
{
		String s1="k v no 2";
	char [] c1=	s1.toCharArray();
	System.out.println(Arrays.toString(c1));
	for(int i=0;i<8;i++)
	{
		boolean b1=Character.isAlphabetic(c1[i]);
		boolean b2=	Character.isDigit(c1[i]);
		boolean b3=Character.isWhitespace(c1[i]);
		System.out.println(b1);
		if(b1==true)
		{
			countofalpha++;
		}
		if(b2==true)
		{
			countofnumeric++;
		}
		if(b3==true)
		{
			countofspace++;
		}
}
	int counofspecialcharacter=s1.length()-countofalpha+countofalpha+countofspace;
	System.out.println("Alphabet counts are--->"+countofalpha);
	System.out.println("Numeric counts are--->"+countofnumeric);
	System.out.println("Space counts are--->"+countofspace);
	System.out.println("Special character counts are-->"+counofspecialcharacter);
	}

}
