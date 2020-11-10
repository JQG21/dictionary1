package com.example.dictionary1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dictionary1.word.WordContent;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailFragment extends Fragment {

    TextView mTextViewId,mTextViewWord,mTextViewMeaning,mTextViewSample;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    public static final String ARG_PARAM = "param";

    // TODO: Rename and change types of parameters
    private String mParam;

    public DetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment DetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailFragment newInstance(String param1) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam = getArguments().getString(ARG_PARAM);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail,container,false);
        mTextViewId = view.findViewById(R.id.textviewId);
        mTextViewWord = view.findViewById(R.id.textviewWord);
        mTextViewMeaning =view.findViewById(R.id.textviewMeaning);
        mTextViewSample = view.findViewById(R.id.textviewSample);
        return view;
    }
    public void updateView(WordContent.WordItem wordItem){
        mTextViewId.setText(wordItem.id);
        mTextViewWord.setText(wordItem.word);
        mTextViewMeaning.setText(wordItem.meaning);
        mTextViewSample.setText(wordItem.sample);
    }
}