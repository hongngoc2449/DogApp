package com.example.dogapp.viewModel;

import com.example.dogapp.model.DogBreed;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface DogsApi {
    @GET("DevTides/DogsApi/master/dogs.json")
    Single<List<DogBreed>> getDog();
}
