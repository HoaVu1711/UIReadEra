package com.vdh.testnavigation.ui.format;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vdh.testnavigation.R;
import com.vdh.testnavigation.adapter.AuthorAdapter;
import com.vdh.testnavigation.adapter.FormatAdapter;
import com.vdh.testnavigation.databinding.FormatFragmentBinding;
import com.vdh.testnavigation.databinding.FragmentHomeBinding;
import com.vdh.testnavigation.model.Author;
import com.vdh.testnavigation.model.File;
import com.vdh.testnavigation.ui.home.HomeViewModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class FormatFragment extends Fragment {

    private FormatViewModel formatViewModel;
    private FormatFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        formatViewModel =
                new ViewModelProvider(this).get(FormatViewModel.class);

        binding = FormatFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initFormat();
    }

    public void initFormat() {
        List<File> mList = new ArrayList<>();
        mList.add(new File("PDF", "1"));
        mList.add(new File("TXT", "1"));
        mList.add(new File("EPUB", "1"));
        mList.add(new File("WORD", "1"));
        mList.add(new File("DOC", "1"));
        mList.add(new File("DOCX", "1"));
        mList.add(new File("MOBI", "1"));
        mList.add(new File("DJVU", "1"));
        mList.add(new File("CHM", "1"));
        mList.add(new File("RTF", "1"));
        mList.add(new File("ODT", "1"));
        mList.add(new File("FB2", "1"));
        mList.add(new File("AZW", "1"));
        mList.add(new File("COMIC", "1"));
        mList.add(new File("CBR", "1"));
        mList.add(new File("CBZ", "1"));
        RecyclerView revFormat = binding.revFormat;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        revFormat.setLayoutManager(linearLayoutManager);
        FormatAdapter adapter = new FormatAdapter();
        adapter.setData(mList);
        revFormat.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}