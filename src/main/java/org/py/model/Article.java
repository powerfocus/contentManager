package org.py.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Article implements Serializable {
    private static final long serialVersionUID = 7278398737046764157L;
    private Long id;
    private String title;
    private String author;
    private String source;
    private LocalDateTime publishdatetime;
    private String shorttitle;
    private Boolean isvarify;
    private String content;
    private String columntype;

    public Article() { }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public LocalDateTime getPublishdatetime() {
        return publishdatetime;
    }

    public void setPublishdatetime(LocalDateTime publishdatetime) {
        this.publishdatetime = publishdatetime;
    }

    public String getShorttitle() {
        return shorttitle;
    }

    public void setShorttitle(String shorttitle) {
        this.shorttitle = shorttitle;
    }

    public Boolean getIsvarify() {
        return isvarify;
    }

    public void setIsvarify(Boolean isvarify) {
        this.isvarify = isvarify;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColumntype() {
        return columntype;
    }

    public void setColumntype(String columntype) {
        this.columntype = columntype;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", source='" + source + '\'' +
                ", publishdatetime=" + publishdatetime +
                ", shorttitle='" + shorttitle + '\'' +
                ", isvarify=" + isvarify +
                ", content='" + content + '\'' +
                ", columntype='" + columntype + '\'' +
                '}';
    }
}
