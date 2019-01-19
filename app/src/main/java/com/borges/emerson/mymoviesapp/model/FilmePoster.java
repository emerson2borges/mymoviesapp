package com.borges.emerson.mymoviesapp.model;

import android.os.Parcel;
import android.os.Parcelable;

public class FilmePoster implements Parcelable{

    private int id;
    private int mPoster;
    private String mTitulo;
    private String mAno;
    private String mDuracao;
    private String mRatio;
    private String mTgBtn;
    private String mSinopse;
    private String mTrailer;

    public FilmePoster(int id, String mTitulo, int mPoster, String mAno, String mDuracao, String mRatio, String mTgBtn, String mSinopse) {
        this.id         = id;
        this.mTitulo    = mTitulo;
        this.mPoster    = mPoster;
        this.mAno       = mAno;
        this.mDuracao   = mDuracao;
        this.mRatio     = mRatio;
        this.mTgBtn     = mTgBtn;
        this.mSinopse   = mSinopse;
        this.mTrailer   = mTrailer;
    }

    protected FilmePoster(Parcel in) {
        id          = in.readInt();
        mTitulo     = in.readString();
        mPoster     = in.readInt();
        mAno        = in.readString();
        mDuracao    = in.readString();
        mRatio      = in.readString();
        mTgBtn      = in.readString();
        mSinopse    = in.readString();
        mTrailer    = in.readString();
    }

    public static final Creator<FilmePoster> CREATOR = new Creator<FilmePoster>() {
        @Override
        public FilmePoster createFromParcel(Parcel in) {
            return new FilmePoster(in);
        }

        @Override
        public FilmePoster[] newArray(int size) {
            return new FilmePoster[size];
        }
    };

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getmTitulo() {return mTitulo;}
    public void setmTitulo(String mTitulo){this.mTitulo = mTitulo;}

    public int getmPoster() {return mPoster;}
    public void setmPoster(int mPoster) {this.mPoster = mPoster;}

    public String getmAno() {return mAno;}
    public void setmAno(String mAno){this.mAno = mAno;}

    public String getmDuracao(){ return mDuracao;}
    public void setmDuracao(String mDuracao){this.mDuracao = mDuracao;}

    public String getmRatio(){return mRatio;}
    public void setmRatio(String mRatio){this.mRatio = mRatio;}

    public String getmTgBtn(){return mTgBtn;}
    public void setmTgBtn(String mTgBtn){this.mTgBtn = mTgBtn;}

    public String getmSinopse(){return mSinopse;}
    public void setmSinopse(String mSinopse){this.mSinopse = mSinopse;}

    public String getmTrailer(){return mTrailer;}
    public void setmTrailer(String mTrailer){this.mTrailer = mTrailer;}

    @Override
    public String toString() {
        return "FilmePoster{" +
                "id=" + id +
                ", mTitulo='" + mTitulo + '\'' +
                ", mPoster=" + mPoster +
                ", mAno=" + mAno +
                ", mDuracao=" + mDuracao +
                ", mRatio=" + mRatio +
                ", mTgBtn=" + mTgBtn +
                ", mSinopse=" + mSinopse +
                ", mTrailer=" + mTrailer +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(mTitulo);
        dest.writeInt(mPoster);
        dest.writeString(mAno);
        dest.writeString(mDuracao);
        dest.writeString(mRatio);
        dest.writeString(mTgBtn);
        dest.writeString(mSinopse);
        dest.writeString(mTrailer);
    }
}
