package com.ardysetiawan.a1812101901_ardysetiawanuasproject.rest;

import com.ardysetiawan.a1812101901_ardysetiawanuasproject.model.GetUser;
import com.ardysetiawan.a1812101901_ardysetiawanuasproject.model.PostPutDelUser;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public class ApiInterface {
    @GET("users")
    Call<GetUser>getUser();
    @FormUrlEncoded
    @POST("users")
    Call<PostPutDelUser>postUser(@Field("name") String name,
                                 @Field("job") String job);
    @FormUrlEncoded
    @PUT("users")
    Call<PostPutDelUser>postUser(@Field("name") String name,
                                 @Field("job") String job);
    @FormUrlEncoded
    @HTTP(method = "Delete",path = "users", hasBody = true)
    Call<PostPutDelUser>deleteUser(@Field("id") String id);

}
