package com.vdh.testnavigation.ui.author;

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
import com.vdh.testnavigation.adapter.TabMainAdpter;

import com.vdh.testnavigation.databinding.AuthorFragmentBinding;
import com.vdh.testnavigation.model.Author;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class AuthorFragment extends Fragment {

    private AuthorViewModel authorViewModel;
    private AuthorFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        authorViewModel =
                new ViewModelProvider(this).get(AuthorViewModel.class);

        binding = AuthorFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initAuthor();
    }

    public void initAuthor() {
        List<Author> mList = new ArrayList<>();
        mList.add(new Author(R.drawable.ic_anh, "Manson Mark", "1"));
        mList.add(new Author(R.drawable.ic_anh, "Manson Mark", "2"));
        mList.add(new Author(R.drawable.ic_anh, "Manson Mark", "3"));
        mList.add(new Author(R.drawable.ic_anh, "Manson Mark", "4"));
        mList.add(new Author(R.drawable.ic_anh, "Manson Mark", "5"));
        RecyclerView revAuthor = binding.revAuthor;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        revAuthor.setLayoutManager(linearLayoutManager);
        AuthorAdapter adapter = new AuthorAdapter();
        adapter.setData(mList);
        revAuthor.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}