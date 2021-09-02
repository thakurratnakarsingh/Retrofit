package com.example.applicationmodule;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiController {
    public static String url = "http://103.113.107.5:4430/VaaaN/VaaaNERP/GetExpenseMasterHeads?ProjectExpenseTypeId=1";

    //http://103.113.107.5:4430/VaaaN/VaaaNERP/GetExpenseMasterHeads?ProjectExpenseTypeId=1

    public static ApiController apiController;
    public static Retrofit retrofit;

    ApiController(){
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized ApiController getInstance(){
        if (apiController==null)
            apiController =new ApiController();
        return apiController;
    }
     Myinterface getapi(){
        return retrofit.create(Myinterface.class);

     }


}
