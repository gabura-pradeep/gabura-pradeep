import java.util.Arrays;

public class DuplicateOccrancesPagala {

	public static void main(String[] args) {
		
		String str = "WelcomeWoWo";
		int len = str.length();
		char[] str1 = str.toCharArray();
		Arrays.sort(str1);
		String chars = new String(str1);



		for (int i = 0; i < len; i++)

		{
		int c = 1;

		while (i < len - 1  && str.charAt(i) == str.charAt(i + 1)) 
		{
		               c++;
		               i++;
		           }



		if (c > 1)

		{
		System.out.println("print the duplicate charaters:" + str.charAt(i) + " " + c);

		}

		}

		}


	}


