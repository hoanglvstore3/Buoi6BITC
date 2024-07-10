public class StringAppBaiTap {
    public void CheckSubString(String mainString, String subString){
        if (mainString.contains(subString)) {
            System.out.println("Chuoi con '" + subString + "' co trong chuoi chinh.");
        } else {
            System.out.println("Chuoi con '" + subString + "' khong co trong chuoi chinh.");
        }
    }
    public int CountCharInString(String mainString, char searchChar){
        int count = 0;

        for (int i = 0; i < mainString.length(); i++) {
            if (mainString.charAt(i) == searchChar) {
                count++;
            }
        }

        return count;
    }
    public String UpperCaseToString(String mainString){
        String upperStr = mainString.toUpperCase();
        return upperStr;
    }
    public void isPalindrome(String mainString){
        
        int left = 0;
        int right = mainString.length() - 1;
        boolean check = true;
        
        while (left < right) {
            if (mainString.charAt(left) != mainString.charAt(right)) {
                System.out.printf("Chuoi : %s khong phai chuoi doi xung %n", mainString);
                check = false;
                break;
            }
            left++;
            right--;
        }
        if(check)
        System.out.printf("Chuoi : %s la chuoi doi xung %n", mainString);
    }
}
