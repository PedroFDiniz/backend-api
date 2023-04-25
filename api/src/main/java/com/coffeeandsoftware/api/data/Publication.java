package com.coffeeandsoftware.api.data;

public class Publication {
    private String id;
    private String title;
    private String[] tags;
    private String content;

    public Publication(String title, String[] tags) {
        this.title = title;
        this.tags = tags;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String[] getTags() { return tags; }
    public String content() { return content; }
}
