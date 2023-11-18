public class ValidateSentence {
    public static boolean SentenceValidator(String sentence){
        //  1. Check if first letter is uppercase
        if (!Character.isUpperCase(sentence.charAt(0))) {
            return false;
        }
        //  2. Check for even number of quotation marks
        int qMarks = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == '"') {
                qMarks++;
            }
        }
        if (qMarks%2 !=0) { //  Off number of quotation marks return false
            return false;
        }
        //  3. Check if last character is a . ! or ?
        if (sentence.charAt(sentence.length()-1) != '.'&&sentence.charAt(sentence.length()-1) != '!'
                &&sentence.charAt(sentence.length()-1) != '?'){
            return false;
        }
        //  4. Check if there is more than one period in the sentence
        int period = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == '.') {
                period++;
            }
        }
        //  If there is a period and the last character is not the period return false
        if (period>1||period == 1 && sentence.charAt(sentence.length()-1)!= '.') {
            return false;
        }
        //  5. Check if there is a number in the sentence less than 13
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isDigit(sentence.charAt(i))) {
                int number = Character.getNumericValue(sentence.charAt(i));
                if (i < sentence.length() - 1 && Character.isDigit(sentence.charAt(i + 1))) {
                    // Get the numeric value of the next character.
                    int nextNumber = Character.getNumericValue(sentence.charAt(i + 1));
                    number = number * 10 + nextNumber;  // Combine the two numeric values to form a double-digit number.
                    i++;                                // Increment the index by 1 to skip the next character.
                }
                // Check if the number is less than 13.
                if (number < 13) {
                    return false; //  Return false if number is less than 13
                }
            }
        }
        return true; //  Return true if all sentence checks pass
    }
}
