package com.github.gedaliar;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class QuoteOfTheDayGetterTest {

    QuoteOfTheDayGetter getter = new QuoteOfTheDayGetter();

    @Test
    void BasicTest() throws IOException {
        System.out.println(getter.getQuoteOfTheDayAsJSON("funny"));
    }
}