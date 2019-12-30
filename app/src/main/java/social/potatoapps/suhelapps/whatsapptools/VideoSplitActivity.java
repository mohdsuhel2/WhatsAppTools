package social.potatoapps.suhelapps.whatsapptools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import java.net.URI;

public class VideoSplitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_split);

        Intent intent = getIntent();

        Uri path = Uri.parse(intent.getStringExtra("path"));

        VideoView videoView = findViewById(R.id.video_view);

        videoView.setVideoURI(path);
        videoView.start();
    }
}
