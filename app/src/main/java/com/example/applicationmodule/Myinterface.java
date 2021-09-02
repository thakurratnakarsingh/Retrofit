package com.example.applicationmodule;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Myinterface {

     @Headers("Content-type: application/json")

     Call<List<ApplicationModel>> getdata();

}
