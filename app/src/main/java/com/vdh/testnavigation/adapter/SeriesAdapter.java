package com.vdh.testnavigation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vdh.testnavigation.R;
import com.vdh.testnavigation.model.Author;
import com.vdh.testnavigation.model.Series;

import org.jetbrains.annotations.NotNull;

import java.util.List;


public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.ViewHolder> {
    private List<Series>seriesList;


    public void setData(List<Series>mList){
        seriesList=mList;
        notifyDataSetChanged();
    }
    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_series,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
        holder.tvSeriesName.setText(seriesList.get(position).getName());
        holder.tvCount.setText(seriesList.get(position).getCount());
    }

    @Override
    public int getItemCount() {
        return seriesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgSeries;
        private TextView tvSeriesName;
        protected TextView tvCount;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imgSeries=itemView.findViewById(R.id.img_series);
            tvSeriesName=itemView.findViewById(R.id.tv_series_name);
            tvCount=itemView.findViewById(R.id.tv_count_series);

        }
    }
}
