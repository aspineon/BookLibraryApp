package com.github.sirlacky.BookLibraryApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {

    @JsonProperty("industryIdentifiers")
    private String industryIdentifiers;
    @JsonProperty("title")
    private String title;
    @JsonProperty("subtitle")
    private String subtitle;
    @JsonProperty("publisher")
    private String publisher;
    @JsonProperty("publishedDate")
    private long publishedDate;
    @JsonProperty("description")
    private String description;
    @JsonProperty("pageCount")
    private int pageCount;
    @JsonProperty("thumbnailUrl")
    private String thumbnailUrl;
    @JsonProperty("language")
    private String language;
    @JsonProperty("previewLink")
    private String previewLink;
    @JsonProperty("averageRating")
    private double averageRating;
    @JsonProperty("authors")
    private String[] authors;
    @JsonProperty("categories")
    private String[] categories;

    public String getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    public void setIndustryIdentifiers(String industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public long getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(long publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPreviewLink() {
        return previewLink;
    }

    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Book{" +
                "industryIdentifiers='" + industryIdentifiers + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishedDate=" + publishedDate +
                ", description='" + description + '\'' +
                ", pageCount=" + pageCount +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", language='" + language + '\'' +
                ", previewLink='" + previewLink + '\'' +
                ", averageRating=" + averageRating +
                ", authors=" + Arrays.toString(authors) +
                ", categories=" + Arrays.toString(categories) +
                '}';
    }


}
