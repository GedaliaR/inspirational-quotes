package com.github.gedaliar;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class QuoteOfTheDayJSONParserTest {

    QuoteOfTheDayGetter getter = new QuoteOfTheDayGetter();
    QuoteOfTheDayJSONParser parser = new QuoteOfTheDayJSONParser();

    @Test
    void BasicTest() throws IOException {
        QuoteOfTheDayAPIResponse response = parser.parseJson(getter.getQuoteOfTheDayAsJSON("inspire"));
        System.out.println(response);
    }

}