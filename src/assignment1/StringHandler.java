package assignment1;

public class StringHandler {

    /**
     * 
     * @param str
     * @return a string where all characters 'c' is replaced by the character 's'
     * Case insensitive.
     */
    public String stringManipulation(String str) {

        String replaceCWithS = str.replace("c","s");
        return replaceCWithS;


    }

    /**
     * 
     * @param str
     * @return the length of str
     * If the input str is null or "" you must return 0
     * 
     */
    public int stringLength(String str) {
       if (str == null){
           return 0;
       } else {
           return str.length();
       }
    }

    /**
     * 
     * @param arr
     * @return the cumulative length of all strings in arr
     * e.g. if arr is ["hi","hello","hej"] the method should return 10
     */
    public int stringArrayLength(String[] arr) {
        int characterAmount = 0;
        for (int aa = 0; aa < arr.length; aa++) {
            int sumOfIndex = arr[aa].length() + characterAmount;



        }
        return characterAmount;
    }

    /**
     * 
     * @param str
     * @return reverse the characters in the String str
     * e.g. "Hello" -> "olleH"
     */
    public String stringReverse(String str) {
        StringBuilder string = new StringBuilder(str);
        string.reverse();
        return string.toString();
    }

    /**
     * 
     * @param str any string
     * @param c the character to count
     * @return how many occurences of the character c in the String str
     * The method should not be case sensitive.
     * e.g. parameters: "Change comes through passion", 'g' should return 2
     */
    public int charCount(String str, char c) {
        int countCharacter = 0;
        String lowercaseString = str.toLowerCase();

        for (int i = 0; i < lowercaseString.length(); i++) {
            if (lowercaseString.charAt(i) == c) {
                countCharacter++;
            }
        }
        return countCharacter;
    }

    /**
     * Returns a string that contains exactly the amount of chars c, as stated by the given amount. So if amount => 4 and
     * char => c then the return value must be "cccc". If amount => 3 and c => X then the return value must be "XXX".
     *
     * @param amount The amount of chars in the return string
     * @param c      The chars the return string must consist of
     * @return The string created using the given parameters.
     */
    public String stringOfChars(int amount, char c) {
        char[] charArray = new char[amount];
        for (int i = 0; i < amount; i++) {
            charArray[i] = c;
        }
        String newString = new String(charArray);
        return newString;
    }


}
