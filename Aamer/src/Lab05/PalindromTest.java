package Lab05;

public class PalindromTest {

	public static void main(String[] args) {

		System.out.println("assa is Palindrom : " + isPalindrome("assa"));
		System.out.println("91019 is Palindrom : " + isPalindrome("91019"));
	}
	
	public static boolean isPalindrome(String word) {
		
		for(int i = 0, j = word.length()-1; i<=word.length()/2 && j>= word.length()/2; i++, j--) {
			if(word.charAt(i) != word.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
