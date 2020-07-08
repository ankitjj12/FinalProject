package com.example.jokedisplay.ui.jokedisplay;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jokedisplay.JokeDisplay;
import com.example.jokedisplay.R;

public class JokeDisplayFragment extends Fragment {



    public static JokeDisplayFragment newInstance() {
        return new JokeDisplayFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root =  inflater.inflate(R.layout.joke_display_fragment, container, false);

        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(JokeDisplay.JOKE_ACTIVITY);
        TextView jokeText = root.findViewById(R.id.joke_text_fragment);
        if(joke!=null){
            jokeText.setText(joke);
        }
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // TODO: Use the ViewModel
    }

}
