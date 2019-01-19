package com.borges.emerson.mymoviesapp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.borges.emerson.mymoviesapp.model.FilmePoster;

public class Filme extends Activity {

    boolean verifica;
    TextView titulo;
    ToggleButton tgFavorito;
    int idFilme;
    FilmePoster filmePoster;
    String auxCheck;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme);

        savedInstanceState = getIntent().getExtras();
        filmePoster = savedInstanceState.getParcelable("filme");
        auxCheck = "Check" + filmePoster.getId();

        titulo = (TextView) findViewById(R.id.txtTitulo);
        ImageView poster = (ImageView) findViewById(R.id.imageView5);
        TextView ano = (TextView) findViewById(R.id.txtAno);
        TextView duracao = (TextView) findViewById(R.id.txtDuracao);
        TextView ratio = (TextView) findViewById(R.id.txtRatio);
        TextView sinopse = (TextView) findViewById(R.id.txtSinopse);
        tgFavorito = (ToggleButton) findViewById(R.id.tgFavorite);

        carregarSharedPreferences();

        titulo.setText(filmePoster.getmTitulo());
        poster.setImageResource(filmePoster.getmPoster());
        ano.setText(filmePoster.getmAno());
        duracao.setText(filmePoster.getmDuracao());
        ratio.setText(filmePoster.getmRatio());
        sinopse.setText(filmePoster.getmSinopse());

        ImageView linkTrailer = (ImageView) findViewById(R.id.imgTrailer);
        assert linkTrailer != null;
        linkTrailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);

                String auxiliar = filmePoster.getmTitulo();
                if (auxiliar.equals("Batman vs Superman")) {
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=IHDgrNxO-5I"));
                } else if (auxiliar.equals("De Volta Para o Futuro")) {
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=FHDKexBsSlU"));
                } else if (auxiliar.equals("007 Contra Spectre")) {
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=XnQtycFKCGs"));
                } else if (auxiliar.equals("Tubarão")) {
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=U1fu_sA7XhE"));
                }
                startActivity(intent);
            }
        });

        tgFavorito.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                salvarSharedPref(auxCheck, tgFavorito.isChecked());
                if(tgFavorito.isChecked()){
                    tgFavorito.setChecked(true);
                }else{
                    tgFavorito.setChecked(false);
                }
            }
        });
    }

    private void salvarSharedPref(String key, boolean booleano){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor edit = prefs.edit();
        edit.putBoolean(key, booleano);
        edit.commit();
    }

    private void carregarSharedPreferences() {

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        boolean btBool = sp.getBoolean(auxCheck, false);
        if(btBool){
            tgFavorito.setChecked(true);
        }else{
            tgFavorito.setChecked(false);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
