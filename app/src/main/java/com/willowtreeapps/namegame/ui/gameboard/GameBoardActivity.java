package com.willowtreeapps.namegame.ui.gameboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.willowtreeapps.namegame.R;

public class GameBoardActivity extends AppCompatActivity {

    private static final String FRAG_TAG = "NameGameFragmentTag";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name_game_activity);
        GameBoardFragment fragment = (GameBoardFragment) getSupportFragmentManager().findFragmentByTag(FRAG_TAG);
        if (fragment == null) {
            fragment = new GameBoardFragment();
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment, FRAG_TAG).commit();
    }

}