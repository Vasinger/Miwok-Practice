package com.example.android.miwok;

/**
 * Created by Mateusz Ławniczak on 07.03.2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mSongResourcePosition;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int songResourcePosition) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSongResourcePosition = songResourcePosition;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int songResourcePosition) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSongResourcePosition = songResourcePosition;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getSongResourcePosition() {
        return mSongResourcePosition;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
