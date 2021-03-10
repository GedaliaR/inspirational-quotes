package com.github.gedaliar;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class StartupActivity implements com.intellij.openapi.startup.StartupActivity {

    QuoteOfTheDayGetter getter;
    QuoteOfTheDayJSONParser parser;
    QuoteOfTheDayAPIResponse response;

    @Override
    public void runActivity(@NotNull Project project) {
        getter = new QuoteOfTheDayGetter();
        parser = new QuoteOfTheDayJSONParser();
        try {
            response = parser.parseJson(getter.getQuoteOfTheDayAsJSON());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Messages.showMessageDialog(project, response.getContents().getQuotes().get(0).getQuote(),
                "Quote of the Day", Messages.getInformationIcon());
    }


}
