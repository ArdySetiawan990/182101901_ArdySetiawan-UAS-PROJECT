package com.ardysetiawan.a1812101901_ardysetiawanuasproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.ardysetiawan.a1812101901_ardysetiawanuasproject.adapter.UsersAdapter;
import com.ardysetiawan.a1812101901_ardysetiawanuasproject.model.GetUser;
import com.ardysetiawan.a1812101901_ardysetiawanuasproject.model.UserModel;
import com.ardysetiawan.a1812101901_ardysetiawanuasproject.rest.ApiClient;
import com.ardysetiawan.a1812101901_ardysetiawanuasproject.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button btnInsert;
    ApiInterface mApiInterface;
    private RecyclerView mRecycleview;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public static MainActivity ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInsert = (Button)findViewById(R.id.btnInsert);
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,InsertActivity));
            }
        });
        mRecycleview = (RecyclerView) findViewById(R.id.recycleView);
        mLayoutManager = new LinearLayoutManager(this);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        ma = this;
        refresh();
    }

    public void refresh(){
        Call<GetUser> userCall = mApiInterface.getUser();
        userCall.enqueue(new Callback<GetUser>() {
            @Override
            public void onResponse(Call<GetUser> call, Response<GetUser> response) {
                List<UserModel> userModelList = response.body().getData();
                Log.d("Retrofit Get", "Jumlah Data User"+ String.valueOf(userModelList.size()) );
                mAdapter = new UsersAdapter(userModelList);
                mRecycleview.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<GetUser> call, Throwable t) {
                Log.e("Retrofit Get",t.toString());
            }
        });
}