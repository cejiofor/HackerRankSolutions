public class AltCharactersSolution {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int index = 0;
        int removedCharCount = 0;
        while(index < sb.length()-1){
            if (sb.charAt(index) == sb.charAt(index+1)){
                sb.deleteCharAt(index+1);
                removedCharCount += 1;
                index -= 1;
            }
            index +=1;
        }
        return removedCharCount;

    }

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("ABABABAB"));
        System.out.println(alternatingCharacters("AAABBB"));

    }
}