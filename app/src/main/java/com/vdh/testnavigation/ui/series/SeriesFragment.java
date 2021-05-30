package com.vdh.testnavigation.ui.series;

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
import com.vdh.testnavigation.adapter.SeriesAdapter;
import com.vdh.testnavigation.databinding.SeriesFragmentBinding;
import com.vdh.testnavigation.databinding.SettingFragmentBinding;
import com.vdh.testnavigation.model.Author;
import com.vdh.testnavigation.model.Series;
import com.vdh.testnavigation.ui.setting.SettingViewModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SeriesFragment extends Fragment {

    private SeriesViewModel seriesViewModel;
    private SeriesFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        seriesViewModel =
                new ViewModelProvider(this).get(SeriesViewModel.class);

        binding = SeriesFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initSeries();
    }

    public void initSeries() {
        List<Series> mList = new ArrayList<>();
        mList.add(new Series(R.drawable.ic_anh, "Doctor", "1"));
        mList.add(new Series(R.drawable.ic_anh, "Doctor", "1"));
        mList.add(new Series(R.drawable.ic_anh, "Doctor", "1"));
        mList.add(new Series(R.drawable.ic_anh, "Doctor", "1"));
        mList.add(new Series(R.drawable.ic_anh, "Doctor", "1"));
        RecyclerView revSeries = binding.rcvSeries;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        revSeries.setLayoutManager(linearLayoutManager);
        SeriesAdapter adapter = new SeriesAdapter();
        adapter.setData(mList);
        revSeries.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}