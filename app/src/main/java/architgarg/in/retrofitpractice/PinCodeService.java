package architgarg.in.retrofitpractice;

// Created by Archit Garg on 24 Sep, 2016.

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PinCodeService {

      public static PinCodeServiceInterface getPinCodeService (){
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .create();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://pincode.saratchandra.in/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            return retrofit.create(PinCodeServiceInterface.class);
      }
}
