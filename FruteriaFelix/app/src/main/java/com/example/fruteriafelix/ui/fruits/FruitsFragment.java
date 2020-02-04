package com.example.fruteriafelix.ui.fruits;

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

public class FruitsFragment extends Fragment {

    private FruitsViewModel fruitViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fruitViewModel =
                ViewModelProviders.of(this).get(FruitsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_fruits, container, false);

        return root;
    }
    public void openDialog() {


    }

}