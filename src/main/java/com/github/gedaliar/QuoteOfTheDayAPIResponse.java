package com.github.gedaliar;

import java.util.List;
import java.util.Objects;

/**
 * POJO representing all data returned by Quote of the Day's API
 */
public class QuoteOfTheDayAPIResponse {

    private Success success;
    private Contents contents;
    private String baseurl;
    private Copyright copyright;

    public Success getSuccess() {
        return success;
    }

    public void setSuccess(Success success) {
        this.success = success;
    }

    public Contents getContents() {
        return contents;
    }

    public void setContents(Contents contents) {
        this.contents = contents;
    }

    public String getBaseurl() {
        return baseurl;
    }

    public void setBaseurl(String baseurl) {
        this.baseurl = baseurl;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    @Override
    public String toString() {
        return "QuoteOfTheDayAPIResponse{" +
                "success=" + success +
                ", contents=" + contents +
                ", baseurl='" + baseurl + '\'' +
                ", copyright=" + copyright +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuoteOfTheDayAPIResponse that = (QuoteOfTheDayAPIResponse) o;
        return Objects.equals(success, that.success) && Objects.equals(contents, that.contents) && Objects.equals(baseurl, that.baseurl) && Objects.equals(copyright, that.copyright);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, contents, baseurl, copyright);
    }

    class Success {
        private int total;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        @Override
        public String toString() {
            return "Success{" +
                    "total=" + total +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Success success = (Success) o;
            return total == success.total;
        }

        @Override
        public int hashCode() {
            return Objects.hash(total);
        }
    }

    class Contents {
        private List<Quote> quotes;

        public List<Quote> getQuotes() {
            return quotes;
        }

        public void setQuotes(List<Quote> quotes) {
            this.quotes = quotes;
        }

        @Override
        public String toString() {
            return "Contents{" +
                    "quotes=" + quotes +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Contents contents = (Contents) o;
            return Objects.equals(quotes, contents.quotes);
        }

        @Override
        public int hashCode() {
            return Objects.hash(quotes);
        }
    }

    class Copyright {
        private int year;
        private String url;

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return "Copyright{" +
                    "year=" + year +
                    ", url='" + url + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Copyright copyright = (Copyright) o;
            return year == copyright.year && Objects.equals(url, copyright.url);
        }

        @Override
        public int hashCode() {
            return Objects.hash(year, url);
        }
    }

    class Quote {
        private String quote;
        private int length;
        private String author;
        private List<String> tags;
        private String category;
        private String language;
        private String date;
        private String permalink;
        private String id;
        private String background;
        private String title;

        public String getQuote() {
            return quote;
        }

        public void setQuote(String quote) {
            this.quote = quote;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getPermalink() {
            return permalink;
        }

        public void setPermalink(String permalink) {
            this.permalink = permalink;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getBackground() {
            return background;
        }

        public void setBackground(String background) {
            this.background = background;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "Quote{" +
                    "quote='" + quote + '\'' +
                    ", length=" + length +
                    ", author='" + author + '\'' +
                    ", tags=" + tags +
                    ", category='" + category + '\'' +
                    ", language='" + language + '\'' +
                    ", date='" + date + '\'' +
                    ", permalink='" + permalink + '\'' +
                    ", id='" + id + '\'' +
                    ", background='" + background + '\'' +
                    ", title='" + title + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Quote quote1 = (Quote) o;
            return length == quote1.length && Objects.equals(quote, quote1.quote) && Objects.equals(author, quote1.author) && Objects.equals(tags, quote1.tags) && Objects.equals(category, quote1.category) && Objects.equals(language, quote1.language) && Objects.equals(date, quote1.date) && Objects.equals(permalink, quote1.permalink) && Objects.equals(id, quote1.id) && Objects.equals(background, quote1.background) && Objects.equals(title, quote1.title);
        }

        @Override
        public int hashCode() {
            return Objects.hash(quote, length, author, tags, category, language, date, permalink, id, background, title);
        }
    }
}
