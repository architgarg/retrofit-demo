package architgarg.in.retrofitpractice;

// Created by Archit Garg on 24 Sep, 2016.

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.LinkedList;
import java.util.List;

public class PinCodeFetcher {

      @SerializedName("status")
      @Expose
      private int status;


      @SerializedName("data")
      @Expose
      private List<City> cities = new LinkedList<>();

      public List<City> getCities() {
            return cities;
      }

      public void setCities(List<City> cities) {
            this.cities = cities;
      }

      public int getStatus() {
            return status;
      }

      public void setStatus(int status) {
            this.status = status;
      }
}
