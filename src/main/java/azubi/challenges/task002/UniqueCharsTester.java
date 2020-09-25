package azubi.challenges.task002;

public class UniqueCharsTester {

    /**
     * hasUniqueChars returs true, when the given string consists only of 
     * unique chars, false otherwise
     * 
     * @param candidate given String to test
     */
    public static boolean hasUniqueChars(String candidate) {
        for(int i = 0; i < candidate.length(); i++){
            for(int x = i + 1; x < candidate.length(); x++){
                if(candidate.charAt(i) == candidate.charAt(x)){
                    return false;
                }
            }
        }

        return true;
    }
}