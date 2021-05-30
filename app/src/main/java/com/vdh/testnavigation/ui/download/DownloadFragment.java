package com.vdh.testnavigation.ui.download;

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
import com.vdh.testnavigation.adapter.ListBookAdapter;
import com.vdh.testnavigation.databinding.BookFragmentBinding;
import com.vdh.testnavigation.databinding.DownloadFragmentBinding;
import com.vdh.testnavigation.model.Book;
import com.vdh.testnavigation.ui.book.BookViewModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class DownloadFragment extends Fragment {

    private DownloadViewModel downloadViewModel;
    private DownloadFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        downloadViewModel =
                new ViewModelProvider(this).get(DownloadViewModel.class);

        binding = DownloadFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initBookList();
    }

    public void initBookList() {
        List<Book> mList = new ArrayList<>();
        mList.add(new Book(R.drawable.ic_anh, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.ic_anh, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.ic_anh, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.ic_anh, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.ic_anh, "Tittle", "Author", "Discribe"));
        RecyclerView revBook = binding.rcvBook;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        revBook.setLayoutManager(linearLayoutManager);
        ListBookAdapter adapter = new ListBookAdapter();
        adapter.setData(mList);
        revBook.setAdapter(adapter);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}