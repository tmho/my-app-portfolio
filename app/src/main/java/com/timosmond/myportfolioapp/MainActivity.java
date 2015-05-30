package com.timosmond.myportfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.launcher_button_spotify_streamer)
    public void launchSpotifyStreamer(View view) {
        Toast.makeText(this, getString(R.string.spotify_streamer_toast_message), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.launcher_button_scores_app)
    public void launchScoresApp(View view) {
        Toast.makeText(this, getString(R.string.scores_app_toast_message), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.launcher_button_library_app)
    public void launchLibraryApp(View view) {
        Toast.makeText(this, getString(R.string.library_app_toast_message), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.launcher_button_build_it_bigger)
    public void launchBuildItBigger(View view) {
        Toast.makeText(this, getString(R.string.build_it_bigger_toast_message), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.launcher_button_xyz_reader)
    public void launchXyzReader(View view) {
        Toast.makeText(this, getString(R.string.xyz_reader_toast_message), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.launcher_button_capstone_app)
    public void launchCapstoneApp(View view) {
        Toast.makeText(this, getString(R.string.capstone_app_toast_message), Toast.LENGTH_SHORT).show();
    }
}
