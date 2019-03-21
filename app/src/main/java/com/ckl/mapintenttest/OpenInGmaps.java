package com.ckl.mapintenttest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OpenInGmaps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_in_gmaps);


    }

    public void seatonBurnDirections(View view){
       /* Uri gmmIntentUri = Uri.parse("geo:54.851597, -1.572178");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }*/

       // https://www.google.com/maps/dir/?api=1

        String url = "https://www.google.com/maps/dir/?api=1" +
                "&origin= 2 Drum Rd, Chester le Street, DH2 1AB" +
                "&destination=Seaton Burn Services, Fisher Lane, Newcastle upon Tyne NE13 6BP" +
                "&waypoints=Alnwick Town Centre, 19 Lagny Street, Alnwick, NE66 1LA" +
                "|Newton Aycliffe, 4 Northfield Way, Newton Aycliffe, DL5 6EJ" +
                "|Thirsk Town Centre, 26 Market Place, Thirsk YO7 1LB" +
                "|Whitby Town Centre, Station Square, Whitby YO21 1DX" +
                "&travelmode=driving";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

      /*  Uri gmmIntentUri = Uri.parse("google.navigation:q=Seaton Burn Services, Fisher Lane, Newcastle upon Tyne NE13 6BP+to: Alnwick Town Centre, 19 Lagny Street, Alnwick, NE66 1LA ");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);*/
    }
    public void alnwickTownDirections(View view){

        Uri gmmIntentUri = Uri.parse("google.navigation:q=Alnwick Town Centre, 19 Lagny Street, Alnwick, NE66 1LA ");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
    public void newtonAycliffeDirections(View view){

        Uri gmmIntentUri = Uri.parse("google.navigation:q=Alnwick Town Centre, 19 Lagny Street, Alnwick, NE66 1LA");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
    public void thirskTownDirections(View view){

        Uri gmmIntentUri = Uri.parse("google.navigation:q=Alnwick Town Centre, 19 Lagny Street, Alnwick, NE66 1LA");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
    public void whitbyTownDirections(View view){


        Uri gmmIntentUri = Uri.parse("google.navigation:q=Alnwick Town Centre, 19 Lagny Street, Alnwick, NE66 1LA");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }

}
