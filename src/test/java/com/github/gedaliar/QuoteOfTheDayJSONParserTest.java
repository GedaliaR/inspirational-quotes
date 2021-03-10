package com.github.gedaliar;

import org.junit.jupiter.api.Test;
import java.io.IOException;

class QuoteOfTheDayJSONParserTest {

    QuoteOfTheDayGetter getter = new QuoteOfTheDayGetter();
    QuoteOfTheDayJSONParser parser = new QuoteOfTheDayJSONParser();

    @Test
    void BasicTest() throws IOException {
        QuoteOfTheDayAPIResponse response = parser.parseJson(getter.getQuoteOfTheDayAsJSON());
        System.out.println(response);
    }

}