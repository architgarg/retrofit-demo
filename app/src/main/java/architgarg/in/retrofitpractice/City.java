package architgarg.in.retrofitpractice;

// Created by Archit Garg on 24 Sep, 2016.

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City {

      @SerializedName("taluk")
      @Expose
      private String cityName;

      @SerializedName("state_name")
      @Expose
      private String stateName;

      public String getCityName() {
            return cityName;
      }

      public void setCityName(String cityName) {
            this.cityName = cityName;
      }

      public String getStateName() {
            return stateName;
      }

      public void setStateName(String stateName) {
            this.stateName = stateName;
      }
}
