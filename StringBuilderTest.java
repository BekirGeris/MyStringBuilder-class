package Bolum_10_Soru_27;

public class StringBuilderTest {
	public static void main(String[] args) {

		String txt = "Hello World";
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());

		MyStringBuilder1 str = new MyStringBuilder1("hguýweFI");

		System.out.println(str.leength());

		MyStringBuilder1 str2 = new MyStringBuilder1("hguýweFIwVFRGV");

		System.out.println(str.append(5555).getStr());

		System.out.println(str.append(str2).getStr());

		System.out.println(str.charAt(5));
		
		System.out.println(str.toLowerCase1().getStr());
		
		System.out.println(str.toUperCase1().getStr());
	}
}
