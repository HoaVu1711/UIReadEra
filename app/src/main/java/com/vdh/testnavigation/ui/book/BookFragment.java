package com.vdh.testnavigation.ui.book;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextClock;
import android.widget.TextView;

import com.vdh.testnavigation.R;
import com.vdh.testnavigation.adapter.ListBookAdapter;
import com.vdh.testnavigation.adapter.TabMainAdpter;
import com.vdh.testnavigation.databinding.BookFragmentBinding;
import com.vdh.testnavigation.model.Book;


import org.jetbrains.annotations.NotNull;


import java.util.ArrayList;
import java.util.List;

public class BookFragment extends Fragment {

    private BookViewModel bookViewModel;
    private BookFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bookViewModel =
                new ViewModelProvider(this).get(BookViewModel.class);

        binding = BookFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        initTabMain();
        initBookList();
    }

    public void initTabMain() {
        List<String> mList = new ArrayList<>();
        mList.add("All");
        mList.add("Reading Now");
        mList.add("Favorites");
        mList.add("Have Read");
        mList.add("Collections");

        RecyclerView revTabName = binding.revTabMain;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);
        revTabName.setLayoutManager(linearLayoutManager);
        TabMainAdpter adapter = new TabMainAdpter(new TabMainAdpter.IClickTab() {
            @Override
            public void onClickTabItem() {

            }
        });

        adapter.setData(mList);
        revTabName.setAdapter(adapter);
    }

    public void initBookList() {
        List<Book> mList = new ArrayList<>();
        mList.add(new Book(R.drawable.ic_anh, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.ic_anh, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.ic_anh, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.ic_anh, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.ic_anh, "Tittle", "Author", "Discribe"));
        RecyclerView revTabName = binding.rcvBook;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        revTabName.setLayoutManager(linearLayoutManager);
        ListBookAdapter adapter = new ListBookAdapter();
        adapter.setData(mList);
        revTabName.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}