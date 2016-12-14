package com.kaltura.playkit.plugins;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.kaltura.playkit.PKEvent;
import com.kaltura.playkit.Player;
import com.kaltura.playkit.PlayerConfig;
import com.kaltura.playkit.ads.PKAdInfo;

/**
 * Created by zivilan on 11/12/2016.
 */

public class MockPlayer implements Player {

    @Override
    public void prepare(@NonNull PlayerConfig.Media playerConfig) {

    }

    @Override
    public void prepareNext(@NonNull PlayerConfig.Media mediaConfig) {

    }

    @Override
    public void updatePluginConfig(@NonNull String pluginName, @NonNull String key, @Nullable Object value) {

    }

    @Override
    public void skip() {

    }

    @Override
    public void onApplicationPaused() {

    }

    @Override
    public void onApplicationResumed() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void replay() {

    }

    @Override
    public View getView() {
        return null;
    }

    @Override
    public long getCurrentPosition() {
        return 0;
    }

    @Override
    public long getDuration() {
        return 100;
    }

    @Override
    public long getBufferedPosition() {
        return 0;
    }

    @Override
    public void setVolume(float volume) {

    }

    @Override
    public boolean isPlaying() {
        return false;
    }

    @Override
    public boolean isAutoPlay() {
        return false;
    }

    @Override
    public void addEventListener(@NonNull PKEvent.Listener listener, Enum... events) {

    }

    @Override
    public void addStateChangeListener(@NonNull PKEvent.Listener listener) {

    }

    @Override
    public void changeTrack(String uniqueId) {

    }

    @Override
    public void seekTo(long position) {

    }

    @Override
    public PKAdInfo getAdInfo() {
        return null;
    }
}