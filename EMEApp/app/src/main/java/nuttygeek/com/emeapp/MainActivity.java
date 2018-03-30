package nuttygeek.com.emeapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterViewFlipper;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {


    int[] slides;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slides = new int[]{R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};

        AdapterViewFlipper viewFlipper = findViewById(R.id.view_flipper);

        FlipperAdpater adapter = new FlipperAdpater(this,slides);

        viewFlipper.setAdapter(adapter);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);

    }
}
