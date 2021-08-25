package com.eliz.mackolik.network.data;

import com.eliz.mackolik.app.data.NewsBO;

import java.util.List;

public class NewsResponseDTO {
    public List<NewsItem> news;

    public NewsResponseDTO(List<NewsItem> news) {
        this.news = news;
    }
}
