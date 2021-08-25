package com.eliz.mackolik.ui.news;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.eliz.mackolik.app.data.NewsBO;
import com.eliz.mackolik.network.MackolikClient;
import com.eliz.mackolik.network.data.NewsResponseDTO;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.Response;

public class NewsViewModel extends ViewModel {

    private MutableLiveData<List<NewsBO>> _data = new MutableLiveData<>();
    private ExecutorService service = Executors.newScheduledThreadPool(5);

    public NewsViewModel() {
        super();
        Log.d("[NewsViewModel]", "ViewModel is instantiated.");
    }

    public LiveData<List<NewsBO>> getData() {
        return _data;
    }

    public void fetchData() {
        service.submit(() -> {
            Single<Response<NewsResponseDTO>> response = MackolikClient.api.getNews();
            _data.postValue(response.blockingGet().body().news.stream().map((newsItem) -> newsItem.toDomainModel()).collect(Collectors.toList()));
        });
    }

}
