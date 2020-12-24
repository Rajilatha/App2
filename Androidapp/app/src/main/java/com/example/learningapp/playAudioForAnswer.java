package com.example.learningapp;

import android.content.Context;
import android.media.MediaPlayer;

public class playAudioForAnswer {
    private Context mcontext;
    private MediaPlayer mediaPlayer;

    public playAudioForAnswer(Context mcontext) {
        this.mcontext = mcontext;
    }
    public void setAudioforAnswer(int flag){
        switch(flag){
            case 1:
                int rightAudio = R.raw.right;
                playmusic(rightAudio);
                break;
            case 2:
                int wrongAudio = R.raw.wrong;
                playmusic(wrongAudio);
                break;
            case 3:
                int goodAudio = R.raw.good;
                playmusic(goodAudio);
                break;
            case 4:
                int trybestAudio = R.raw.trybest;
                playmusic(trybestAudio);
                break;



        }
    }

    private void playmusic(int audiofile) {
        mediaPlayer =MediaPlayer.create(mcontext,audiofile);
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mediaPlayer.start();

            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
    }
}
