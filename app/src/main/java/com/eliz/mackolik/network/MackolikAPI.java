package com.eliz.mackolik.network;

import com.eliz.mackolik.network.data.MatchesResponseDTO;
import com.eliz.mackolik.network.data.NewsResponseDTO;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;

public interface MackolikAPI {

    @GET("/news")
    Single<Response<NewsResponseDTO>> getNews();

    @GET("/matches")
    Single<Response<MatchesResponseDTO>> getMatches();
}
