package kyu_5.predictive_contact_list.java;

import java.util.List;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class PredictiveContactListTest {

    @Test
    public void testPredictionUsingOneKeystroke() {
        // given
        List<String> inputContacts = Arrays.asList(
                "jones", "thompson", "brown", "taylor",
                "bow", "smith", "cox", "timmons"
        );
        String keystrokes = "2";

        // when
        List<String> outputContacts = PredictiveContactList.predict(inputContacts, keystrokes);

        // then
        assertThat("Bad prediction result for keystrokes: '" + keystrokes + "' and contacts: " + inputContacts,
                outputContacts, is(Arrays.asList("brown", "bow", "cox")));
    }

    @Test
    public void testPredictionUsingThreeKeystrokes() {
        // given
        List<String> inputContacts = Arrays.asList(
                "jones", "thompson", "brown", "taylor",
                "bow", "smith", "cox", "timmons"
        );
        String keystrokes = "269";

        // when
        List<String> outputContacts = PredictiveContactList.predict(inputContacts, keystrokes);

        // then
        assertThat("Bad prediction result for keystrokes: '" + keystrokes + "' and contacts: " + inputContacts,
                outputContacts, is(Arrays.asList("bow", "cox")));
    }

    @Test
    public void testPredictionUsingTooMuchKeystrokes() {
        // given
        List<String> inputContacts = Arrays.asList(
                "jones", "thompson", "brown", "taylor",
                "bow", "smith", "cox", "timmons"
        );
        String keystrokes = "234567892345";

        // when
        List<String> outputContacts = PredictiveContactList.predict(inputContacts, keystrokes);

        // then
        assertTrue("Prediction result should be empty for keystrokes: '" + keystrokes + "' and contacts: " + inputContacts,
                outputContacts.isEmpty());
    }
}
