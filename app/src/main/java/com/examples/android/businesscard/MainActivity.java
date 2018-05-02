package com.examples.android.businesscard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Parse and launch web browser to 'supposed' website
    public void browseURL_onClick(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.manta.com/c/mmdvh76/r-s-transport-ll")));

    }

    // place phone call to company
    public void placeCall_onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "715-771-9110", null));
        startActivity(intent);

    }

    // locate address in MAPS
    public void geoLocate_onClick(View view) {
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=rs transport 4111 Kauth Dr Wisconsin Rapids WI"));
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
}
