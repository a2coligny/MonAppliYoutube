package fr.esilv.s8.td6_rouaultdecoligny;

/**
 * Created by auriane on 23/03/2017.
 */

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class Play extends YoutubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    private static final String API_KEY = "AIzaSyC-gh5lUS4qmqcuHjVsyFzjKD-YodumBVY";
    public String VIDEO_ID = "videoid";
    private YoutubePlayerView videoPlayer;
    private TextView videotext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        videotext = (TextView) findViewById(R.id.txtView);
        Bundle extras = getIntent().getExtras();
        String text = (extras != null ? extras.getString("data") : null);

        /*Recupération données liées à la video */
        videotext.setText(text);
        VIDEO_ID = text;


       /* Youtube Player */
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationFailure(Provider provider, YouTubeInitializationResult result) {
                Toast.makeText(Details.this, "Fail to display the video !", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
                player.loadVideo(VIDEO_ID);
            }
        };

        youTubePlayerView.initialize(API_KEY, onInitializedListener);

    }

}
