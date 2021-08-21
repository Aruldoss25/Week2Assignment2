package week2.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "Hai helo how arre youuuu";
		int count;
		String str = "";
		String[] strArr = text.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				count = 1;		
				if (strArr[i].equals(strArr[j])) {
					count++;
				}
				if (count > 1) {
					strArr[j] = "";
					}
				}
		 }
		for (int k = 0; k < strArr.length; k++) {
			str+= " "+strArr[k];
        }
		System.out.println(str);
	}

}
