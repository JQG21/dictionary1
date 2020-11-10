package com.example.dictionary1;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.dictionary1.word.WordContent;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemClick(WordContent.WordItem wordItem) {
        DetailFragment detailFragment = (DetailFragment)getSupportFragmentManager().findFragmentById(R.id.wordDetail);
        if(detailFragment!=null){
            detailFragment.updateView(wordItem);
        }
        else {
            DetailFragment newFragment = new DetailFragment();
            Bundle args = new Bundle();

            args.putSerializable(DetailFragment.ARG_PARAM,wordItem);
            newFragment.setArguments(args);

            FragmentTransaction transaction =
                    getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.wordDetail,newFragment);
            transaction.commit();
        }
    }
}