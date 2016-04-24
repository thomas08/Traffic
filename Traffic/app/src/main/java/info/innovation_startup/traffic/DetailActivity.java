package info.innovation_startup.traffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titleTextView = (TextView) findViewById(R.id.textView3);
        titleTextView.setText(getIntent().getStringExtra("Title"));


        ImageView trafficImageView = (ImageView) findViewById(R.id.imageView2);
        trafficImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.traffic_01));

        TextView detailTextView = (TextView) findViewById(R.id.textView4);
        detailTextView.setText(getIntent().getStringExtra("Detail"));


    } //mainmethod

    public void clcickback(View view) {
        finish();


    }


} //main
