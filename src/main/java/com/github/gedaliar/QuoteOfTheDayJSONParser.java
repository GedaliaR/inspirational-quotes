package com.github.gedaliar;

import com.google.gson.*;

/**
 * An object to parse JSON data returned from They Said So Quotes API into a QuoteOfTheDay POJO
 * @see QuoteOfTheDayAPIResponse - The POJO
 * @see QuoteOfTheDayGetter - The object responsible for calling the API
 */
public class QuoteOfTheDayJSONParser {
    private Gson gson;

    public QuoteOfTheDayJSONParser(){
        gson = new Gson();
    }

    public QuoteOfTheDayAPIResponse parseJson(String jsonData){
        return gson.fromJson(jsonData, QuoteOfTheDayAPIResponse.class);
    }

}
