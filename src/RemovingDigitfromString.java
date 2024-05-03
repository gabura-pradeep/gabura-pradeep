
public class RemovingDigitfromString {

	public static void main(String[] args) {
		
		String str="123JavaProgram345";
		String result=str.replaceAll("\\d", "");
		System.out.println(result);

	}

}
