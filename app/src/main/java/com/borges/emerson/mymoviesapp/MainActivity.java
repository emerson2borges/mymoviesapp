package com.borges.emerson.mymoviesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.borges.emerson.mymoviesapp.model.FilmePoster;

public class MainActivity extends AppCompatActivity {

    ImageView batmanView;
    ImageView futuroView;
    ImageView bondSpectreView;
    ImageView tubaraoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batmanView = (ImageView) findViewById(R.id.iv_batmanvssuperman);
        batmanView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Filme.class);
                FilmePoster batman = new FilmePoster(
                        1,
                        getResources().getString(R.string.titulo_batmanvssuperman),
                        R.drawable.batmanvssuperman25,
                        getResources().getString(R.string.ano_batmanvssuperman),
                        getResources().getString(R.string.duracao_batmanvssuperman),
                        getResources().getString(R.string.ratio_batmanvssuperman),
                        getResources().getString(R.string.favorito_batmanvssuperman),
                        getResources().getString(R.string.sinopse_batmanvssuperman)
                );

                intent.putExtra("filme", batman);
                startActivity(intent);
            }
        });

        futuroView = (ImageView) findViewById(R.id.iv_futuro);
        futuroView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Filme.class);
                FilmePoster futuro = new FilmePoster(
                        2,
                        getResources().getString(R.string.titulo_futuro),
                        R.drawable.devoltaparaofuturo25,
                        getResources().getString(R.string.ano_futuro),
                        getResources().getString(R.string.duracao_futuro),
                        getResources().getString(R.string.ratio_futuro),
                        getResources().getString(R.string.favorito_futuro),
                        getResources().getString(R.string.sinopse_futuro)
                );

                intent.putExtra("filme", futuro);
                startActivity(intent);
            }
        });

        bondSpectreView = (ImageView) findViewById(R.id.iv_bondspectre);
        bondSpectreView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Filme.class);
                FilmePoster bondspectre = new FilmePoster(
                        3,
                        getResources().getString(R.string.titulo_bondspectre),
                        R.drawable.jamesbondspectre25,
                        getResources().getString(R.string.ano_bondspectre),
                        getResources().getString(R.string.duracao_bondspectre),
                        getResources().getString(R.string.ratio_bondspectre),
                        getResources().getString(R.string.favorito_bondspectre),
                        getResources().getString(R.string.sinopse_bondspectre)
                );

                intent.putExtra("filme", bondspectre);
                startActivity(intent);
            }
        });

        tubaraoView = (ImageView) findViewById(R.id.iv_tubarao);
        tubaraoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Filme.class);
                FilmePoster tubarao = new FilmePoster(
                        4,
                        getResources().getString(R.string.titulo_tubarao),
                        R.drawable.tubarao25,
                        getResources().getString(R.string.ano_tubarao),
                        getResources().getString(R.string.duracao_tubarao),
                        getResources().getString(R.string.ratio_tubarao),
                        getResources().getString(R.string.favorito_tubarao),
                        getResources().getString(R.string.sinopse_tubarao)
                );

                intent.putExtra("filme", tubarao);
                startActivity(intent);
            }
        });

    }
}
