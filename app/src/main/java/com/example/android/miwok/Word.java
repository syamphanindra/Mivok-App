package com.example.android.miwok;

public class Word {
    private String mDefaultTrasulation;

    private String mmivokTrasulation;
    private int mImageResourceId=-1;
    private static  final  int NO_IMAGE_PROVIDED=-1;
    private  int mAudioResourceId;
    public Word(String defalutTrasulation, String mivokTrasulation,int audioResourceId) {
        mDefaultTrasulation = defalutTrasulation;
        mmivokTrasulation = mivokTrasulation;
        mAudioResourceId=audioResourceId;

    }
    public Word(String defalutTrasulation, String mivokTrasulation,int imageResourceId,int audioResourceId) {
        mDefaultTrasulation = defalutTrasulation;
        mmivokTrasulation = mivokTrasulation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioResourceId;

    }

    //get default trasulation of word
    public String getdefaultTrasulation() {
        return mDefaultTrasulation;
    }

    //get mivok trasulation of the word
    public String getMivokTransulation() {
        return mmivokTrasulation;
    }


    public int getImageResourceId(){
        return mImageResourceId;
}
public int getmAudioResourceId(){
    return mAudioResourceId;
}
public boolean hasImage()
{
    if(mImageResourceId!=NO_IMAGE_PROVIDED)
        return true;
    else
         return false;
}

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTrasulation='" + mDefaultTrasulation + '\'' +
                ", mmivokTrasulation='" + mmivokTrasulation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
