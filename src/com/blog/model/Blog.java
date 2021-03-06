package com.blog.model;

/**
 * Created by nervliming on 2016/12/22.
 */
public class Blog {
    private int id;
    private String title;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", 标题='" + title + '\'' +
                ", 内容='" + content + '\'' +
                '}';
    }
}
