package com.github.gedaliar;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class QuoteOfTheDayGetterTest {

    QuoteOfTheDayGetter getter = new QuoteOfTheDayGetter();

    @Test
    void BasicTest() throws IOException {
        System.out.println(getter.getQuoteOfTheDayAsJSON());
    }
}