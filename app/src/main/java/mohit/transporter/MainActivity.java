package mohit.transporter;

import android.content.Context;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView text;
    LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    text= (TextView) findViewById(R.id.textView);


        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        //locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, getApplicationContext());

    }
}
