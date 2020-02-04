package com.example.fruteriafelix.ui.vegetables;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.fruteriafelix.R;

public class VegetablesFragment extends Fragment {

    private VegetablesViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(VegetablesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_vegetables, container, false);

        return root;
    }
}