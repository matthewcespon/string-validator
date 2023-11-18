import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ValidateSentenceTest {

    //VALID SENTENCES

    @Test //String starts with capital letter, expect true
    void StartsWithCapitalLetter() {
        ValidateSentence valid = new ValidateSentence();
        assertTrue(ValidateSentence.SentenceValidator("The quick brown fox said hello Mr lazy dog."));
    }

    @Test //String has even number of quotation marks, expect true
    void EvenQuotationMarks() {
        ValidateSentence valid = new ValidateSentence();
        assertTrue(ValidateSentence.SentenceValidator("The quick brown fox said “hello Mr lazy dog”."));
    }

    @Test //String ends with "." or "?" or "!", expect true
    void EndsWithCorrectPunctuation() {
        ValidateSentence valid = new ValidateSentence();
        assertTrue(ValidateSentence.SentenceValidator("How many “lazy dogs” are there?"));
    }

    @Test //No period characters apart from last character, expect true
    void NoPeriodApartFromLastChar() {
        ValidateSentence valid = new ValidateSentence();
        assertTrue(ValidateSentence.SentenceValidator("One lazy dog is too few, thirteen is too many."));
    }

    @Test //Numbers below 13 in the string must be spelled out, expect true
    void NumbersBelowThirteenSpelledOut() {
        ValidateSentence valid = new ValidateSentence();
        assertTrue(ValidateSentence.SentenceValidator("One lazy dog is too few, 13 is too many."));
    }



    //INVALID SENTENCES

    @Test //String does not starts with capital letter, expect false
    void StartsWithLowercaseLetter() {
        ValidateSentence valid = new ValidateSentence();
        assertFalse(ValidateSentence.SentenceValidator("the quick brown fox said “hello Mr lazy dog”."));
    }

    @Test //String has uneven amount of punctuation, expect false
    void UnevenQuotationMarks() {
        ValidateSentence valid = new ValidateSentence();
        assertFalse(ValidateSentence.SentenceValidator("“The quick brown fox said “hello Mr lazy dog”."));
    }

    @Test //String ends with no punctuation, expect false
    void NotEndsWithCorrectPunctuation() {
        ValidateSentence valid = new ValidateSentence();
        assertFalse(ValidateSentence.SentenceValidator("There is no punctuation in this sentence"));
    }

    @Test //Multiple period characters in sentence, expect false
    void MultiplePeriodsInSentence() {
        ValidateSentence valid = new ValidateSentence();
        assertFalse(ValidateSentence.SentenceValidator("One lazy dog is too few. Thirteen is too many."));
    }

    @Test //Numbers below 13 are not spelled out, expect false
    void NumbersBelowThirteen() {
        ValidateSentence valid = new ValidateSentence();
        assertFalse(ValidateSentence.SentenceValidator("Are there 11, 12, or 13 lazy dogs?"));
    }

}