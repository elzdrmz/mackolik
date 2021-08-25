package com.eliz.mackolik.network.data;

import androidx.annotation.NonNull;

import com.eliz.mackolik.app.data.NewsBO;

import java.util.Date;

/*
{
         "id":218533,
         "title":"İtalya'dan Muriqi iddiası: Anlaşma tamam",
         "description":"İtalyan basınında yer alan haberlere göre taraflar Vedat Muriqi'nin transferi için anlaşma sağladılar.",
         "date":"13.08.2020 12:40",
         "link":"https://www.mackolik.com/futbol/haber/italyadan-muriqi-iddiasi-lazio-ile-fenerbahce-anlasti/7otxe9os0ce010neq43tdh1eu",
         "picUrl":"https://upload.wikimedia.org/wikipedia/commons/c/c8/Vedat_Muriqi_Fenerbah%C3%A7e_SK_19_Aug_2019_%28cropped%29.jpg"
      }
 */
public class NewsItem {
    public Long id;
    public String title;
    public String description;
    public String date;
    public String link;
    public String picUrl;

    public NewsItem(Long id, String title, String description, String date, String link, String picUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.link = link;
        this.picUrl = picUrl;
    }

    public NewsBO toDomainModel() {
        return new NewsBO(
                this.id,
                this.title,
                this.description,
                this.date,
                this.link,
                this.picUrl);
    }

    @NonNull
    @Override
    public String toString() {
        return "{\n" +
                "    \"id\":" + id +",\n" +
                "    \"title\":\"" + title + "\",\n" +
                "    \"description\":\"" + description + "\",\n" +
                "    \"date\":\"" + date + "\",\n" +
                "    \"link\":\"" + link + "\",\n" +
                "    \"picUrl\":\"" + picUrl + "\"\n" +
                "}";
    }
}
