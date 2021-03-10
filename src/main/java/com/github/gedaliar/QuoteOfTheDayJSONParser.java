package com.github.gedaliar;

import com.google.gson.*;

/**
 * An object to parse JSON data returned from They Said So Quotes API into a QuoteOfTheDay POJO
 * @see QuoteOfTheDay - The POJO
 * @see QuoteOfTheDayGetter - The object responsible for calling the API
 */
public class QuoteOfTheDayJSONParser {

    private QuoteOfTheDay quote;

    private Gson gson;

}
