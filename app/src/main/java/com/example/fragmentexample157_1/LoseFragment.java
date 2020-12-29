package com.example.fragmentexample157_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class LoseFragment extends Fragment {

    public LoseFragment() {
        // Required empty public constructor
    }
    public static LoseFragment newInstance() {
        LoseFragment fragment = new LoseFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lose, container, false);
    }
}