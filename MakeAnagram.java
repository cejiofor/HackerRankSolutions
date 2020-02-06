public class MakeAnagram {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        StringBuilder aSB = new StringBuilder(a);
        StringBuilder bSB = new StringBuilder(b);
        
        int uniqueCharsS1 = aSB.length();
        for (int i = 0; i< aSB.length(); i++){
            int charIndex = bSB.indexOf(""+aSB.charAt(i));
            if (charIndex != -1){
                bSB.deleteCharAt(charIndex);
                uniqueCharsS1 -= 1;
            }
        }
        return uniqueCharsS1 + bSB.length();
    }

}