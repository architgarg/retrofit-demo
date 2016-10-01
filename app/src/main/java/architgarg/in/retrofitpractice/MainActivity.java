package architgarg.in.retrofitpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<PinCodeFetcher> {

      private Button button;
      private TextView textView;

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button = (Button) findViewById(R.id.button);
            textView = (TextView) findViewById(R.id.text_view_id);
      }

      @Override
      public void onResponse(Call<PinCodeFetcher> call, Response<PinCodeFetcher> response) {

            PinCodeFetcher resp = response.body();

            List<City> cities = resp.getCities();

            textView.setText(cities.get(0).getCityName());

      }

      @Override
      public void onFailure(Call<PinCodeFetcher> call, Throwable t) {
            Log.d("Archit", t.getMessage());
      }

      public void buttonClicked(View view) {
            PinCodeServiceInterface pinCodeService = PinCodeService.getPinCodeService();
            Call<PinCodeFetcher> call = pinCodeService.fetchPinCodes("251001");
            call.enqueue(this);
      }
}
