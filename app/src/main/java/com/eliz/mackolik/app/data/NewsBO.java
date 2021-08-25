package com.eliz.mackolik.app.data;

import androidx.annotation.Nullable;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class NewsBO {

    private Long id;
    private String title;
    private String description;
    private String date;
    private String link;
    private String picUrl;

    public NewsBO(Long id, String title, String description, String date, String link, String picUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.link = link;
        this.picUrl = picUrl;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
//Wednesday, 7 December 1999, 13:37
    public String getDate() {
        StringBuilder builder = new StringBuilder();
        String[] dateTime = date.split(" ");
        String[] date = dateTime[0].split("[.]");
        Calendar cal = new GregorianCalendar(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));

        switch(cal.get(Calendar.DAY_OF_WEEK)) {
            case 1: builder.append("Sunday, "); break;
            case 2: builder.append("Monday, "); break;
            case 3: builder.append("Tuesday, "); break;
            case 4: builder.append("Wednesday, "); break;
            case 5: builder.append("Thursday, "); break;
            case 6: builder.append("Friday, "); break;
            case 7: builder.append("Saturday, "); break;
        }

        builder.append(date[0]);

        switch(cal.get(Calendar.MONTH)) {
            case 1: builder.append(" January "); break;
            case 2: builder.append(" February "); break;
            case 3: builder.append(" March "); break;
            case 4: builder.append(" April "); break;
            case 5: builder.append(" May "); break;
            case 6: builder.append(" June "); break;
            case 7: builder.append(" July "); break;
            case 8: builder.append(" August "); break;
            case 9: builder.append(" September "); break;
            case 10: builder.append(" October "); break;
            case 11: builder.append(" November "); break;
            case 12: builder.append(" December "); break;
        }

        builder
            .append(date[2])
            .append(" ")
            .append(dateTime[1]);

        return builder.toString();
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return ((NewsBO) obj).id == id;
    }
}
