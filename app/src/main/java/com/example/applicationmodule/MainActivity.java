package com.example.applicationmodule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("This is recycler View");

        rcv = (RecyclerView) findViewById(R.id.recycler);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        processdata();


    }

    public void processdata(){
        Call<List<ApplicationModel>> call =ApiController.getInstance().getapi().getdata();
        call.enqueue(new Callback<List<ApplicationModel>>() {
            @Override
            public void onResponse(Call<List<ApplicationModel>> call, Response<List<ApplicationModel>> response) {
               List<ApplicationModel> data = response.body();
               MyViewAdapter myViewAdapter = new MyViewAdapter(data);
               rcv.setAdapter(myViewAdapter);
            }

            @Override
            public void onFailure(Call<List<ApplicationModel>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}