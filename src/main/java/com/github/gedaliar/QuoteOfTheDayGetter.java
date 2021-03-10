package com.github.gedaliar;

import com.intellij.openapi.diagnostic.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;

/**
 * An Object that gets the Quote of the Day from They Said So Quotes API
 */
public class QuoteOfTheDayGetter {

    private static final Logger LOGGER = Logger.getInstance(QuoteOfTheDayGetter.class.getName());
    public static final String API_BASE_URL = "http://quotes.rest/qod.json?category=";

    /**
     * Fetches Quote of the Day as JSOM from API and returns data as a String.
     * @param category category of quote as described by API todo: consider Inverting Dependency
     * @return String of returned JSON data
     * @throws IOException
     */
    public String getQuoteOfTheDayAsJSON(String category) throws IOException {

        String urlString = API_BASE_URL + category;

        URL url = new URL(urlString);

        try{
            //make connection
            HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
            urlc.setRequestMethod("GET");

            LOGGER.debug("Connect to: " + url.toString());

            urlc.setAllowUserInteraction(false);
            urlc.connect();

            //get result
            StringBuilder result = new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
            String s;
            while ((s=br.readLine())!=null) {
                result.append(s);
            }

            br.close();

            LOGGER.debug(result.toString());

            return result.toString();

        } catch (Exception e){
            LOGGER.debug(e.toString());
        }
        return "";
    }

}