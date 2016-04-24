package info.innovation_startup.traffic;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutButton = (Button) findViewById(R.id.button);

        //Button controller
        buttonControtter();

        //ListView controller
        listViewController();



    } //Main Method

    private void listViewController() {

        // Type1
        final int[] iconInts = {R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03,
                R.drawable.traffic_04, R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08, R.drawable.traffic_09,
                R.drawable.traffic_11, R.drawable.traffic_12, R.drawable.traffic_13,
                R.drawable.traffic_14, R.drawable.traffic_15, R.drawable.traffic_16,
                R.drawable.traffic_17, R.drawable.traffic_18, R.drawable.traffic_19,
                R.drawable.traffic_20,};

        // Type2
        final String[] titleStings = new String[20];
        titleStings[0] = "หัวข้อหลักที่ 1";
        titleStings[1] = "หัวข้อหลักที่ 2";
        titleStings[2] = "หัวข้อหลักที่ 3";
        titleStings[3] = "หัวข้อหลักที่ 4";
        titleStings[4] = "หัวข้อหลักที่ 5";
        titleStings[5] = "หัวข้อหลักที่ 6";
        titleStings[6] = "หัวข้อหลักที่ 7";
        titleStings[7] = "หัวข้อหลักที่ 8";
        titleStings[8] = "หัวข้อหลักที่ 9";
        titleStings[9] = "หัวข้อหลักที่ 10";
        titleStings[10] = "หัวข้อหลักที่ 11";
        titleStings[11] = "หัวข้อหลักที่ 12";
        titleStings[12] = "หัวข้อหลักที่ 13";
        titleStings[13] = "หัวข้อหลักที่ 14";
        titleStings[14] = "หัวข้อหลักที่ 15";
        titleStings[15] = "หัวข้อหลักที่ 16";
        titleStings[16] = "หัวข้อหลักที่ 17";
        titleStings[17] = "หัวข้อหลักที่ 18";
        titleStings[18] = "หัวข้อหลักที่ 19";
        titleStings[19] = "หัวข้อหลักที่ 20";

        //Type3
        final String[] detStrings = getResources().getStringArray(R.array.detail);

        //Create ListView
        Adapter adapter = new Adapter(this, iconInts, titleStings, detStrings);
        trafficListView.setAdapter(adapter);

        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("Title", titleStings[position]);
                intent.putExtra("Image", iconInts[position]);
                intent.putExtra("Detail", detStrings[position]);
                startActivity(intent);

            } //onItemClick
        });

    } // listViewCotroller

    private void buttonControtter() {

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Sound
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.horse);
                mediaPlayer.start();


                //webview
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://youtu.be/WZoYSMKy2ME"));
//                startActivity(intent);
                //call
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:0814855783"));
                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(intent);

            } //onclick
        });

    } // Button controller Method




}  //Main class
