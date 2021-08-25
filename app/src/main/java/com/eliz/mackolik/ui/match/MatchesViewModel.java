package com.eliz.mackolik.ui.match;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.eliz.mackolik.app.data.MatchBO;
import com.eliz.mackolik.network.MackolikClient;
import com.eliz.mackolik.network.data.MatchesResponseDTO;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import io.reactivex.Single;
import retrofit2.Response;

public class MatchesViewModel extends ViewModel {

    private MutableLiveData<List<MatchBO>> _data = new MutableLiveData<>();
    private ExecutorService service = Executors.newScheduledThreadPool(5);

    public MatchesViewModel() {
        super();
        Log.d("[MatchesViewModel]", "MatchesViewModel is instantiated.");
    }

    public LiveData<List<MatchBO>> getData() {
        return _data;
    }

    public void fetchData() {
        service.submit(() -> {
            Single<Response<MatchesResponseDTO>> response = MackolikClient.api.getMatches();
            _data.postValue(response.blockingGet().body().matches.stream().map((matchItem) -> matchItem.toDomainModel()).collect(Collectors.toList()));
        });
    }
}
