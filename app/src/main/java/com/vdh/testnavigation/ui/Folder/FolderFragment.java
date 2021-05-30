package com.vdh.testnavigation.ui.Folder;

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
import com.vdh.testnavigation.databinding.FolderFragmentBinding;
import com.vdh.testnavigation.databinding.FragmentHomeBinding;
import com.vdh.testnavigation.ui.home.HomeViewModel;

public class FolderFragment extends Fragment {

    private FolderViewModel folderViewModel;
    private FolderFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        folderViewModel =
                new ViewModelProvider(this).get(FolderViewModel.class);

        binding = FolderFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFolder;
        folderViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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