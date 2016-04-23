package info.innovation_startup.traffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //Bind widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutButton = (Button) findViewById(R.id.button);

        //Button controller
        buttonControtter();



    } //Main Method

    private void buttonControtter() {

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Sound
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.horse);
                mediaPlayer.start();


            } //onclick
        });

    } // Button controller Method


}  //Main class
