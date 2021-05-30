package com.vdh.testnavigation.ui.feedback;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vdh.testnavigation.R;
import com.vdh.testnavigation.databinding.FeedBackFragmentBinding;
import com.vdh.testnavigation.databinding.TrashFragmentBinding;
import com.vdh.testnavigation.ui.trash.TrashViewModel;

public class FeedBackFragment extends Fragment {

    private FeedBackViewModel feedBackViewModel;
    private FeedBackFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        feedBackViewModel =
                new ViewModelProvider(this).get(FeedBackViewModel.class);

        binding = FeedBackFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFeedback;
        feedBackViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}