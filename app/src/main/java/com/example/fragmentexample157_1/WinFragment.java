package com.example.fragmentexample157_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentexample157_1.databinding.FragmentWinBinding;

public class WinFragment extends Fragment {
private FragmentWinBinding binding;
    public WinFragment() {
        // Required empty public constructor
    }

    public static WinFragment newInstance() {
        WinFragment fragment = new WinFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_lose, container, false);
    }
}