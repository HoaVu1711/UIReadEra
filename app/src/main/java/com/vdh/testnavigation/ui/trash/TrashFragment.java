package com.vdh.testnavigation.ui.trash;

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
import com.vdh.testnavigation.databinding.DownloadFragmentBinding;
import com.vdh.testnavigation.databinding.TrashFragmentBinding;
import com.vdh.testnavigation.ui.download.DownloadViewModel;

public class TrashFragment extends Fragment {

    private TrashViewModel trashViewModel;
    private TrashFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        trashViewModel =
                new ViewModelProvider(this).get(TrashViewModel.class);

        binding = TrashFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textTrash;
        trashViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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