package architgarg.in.retrofitpractice;

// Created by Archit Garg on 24 Sep, 2016.

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PinCodeServiceInterface {

      @GET("api/pincode/{code}")
      public Call<PinCodeFetcher> fetchPinCodes(@Path("code")  String pinCode);
}
