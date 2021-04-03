package Bolum_10_Soru_27;

public class MyStringBuilder1 {
	String str;

	public MyStringBuilder1(String str) {
		this.str = str;
	}

	public MyStringBuilder1 append(MyStringBuilder1 s) {
		MyStringBuilder1 s1 = new MyStringBuilder1(str + s.getStr());
		return s1;
	}

	public MyStringBuilder1 append(int s) {
		MyStringBuilder1 s1 = new MyStringBuilder1(str + s);
		return s1;
	}

	public MyStringBuilder1 toLowerCase1() {
		MyStringBuilder1 s1 = new MyStringBuilder1(str.toLowerCase());
		return s1;
	}
	
	public MyStringBuilder1 toUperCase1() {
		MyStringBuilder1 s1 = new MyStringBuilder1(str.toUpperCase());
		return s1;
	}

	public char charAt(int index) {
		return str.charAt(index);
	}

	public int leength() {
		return str.toString().length();
	}

	public String getStr() {
		return str;
	}

}
