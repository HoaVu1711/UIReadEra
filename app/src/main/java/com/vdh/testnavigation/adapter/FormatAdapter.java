package com.vdh.testnavigation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vdh.testnavigation.R;
import com.vdh.testnavigation.model.File;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class FormatAdapter extends RecyclerView.Adapter<FormatAdapter.ViewHolder> {
    private List<File>fileList;


    public void setData(List<File>mList){
        fileList=mList;
        notifyDataSetChanged();
    }
    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_format,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
       holder.tvFileType.setText(fileList.get(position).getFileType());
       holder.tvNumFile.setText(fileList.get(position).getNumFile());

    }

    @Override
    public int getItemCount() {
        return fileList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvFileType;
        private TextView tvNumFile;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            tvFileType=itemView.findViewById(R.id.tv_file_type);
            tvNumFile=itemView.findViewById(R.id.tv_num_file);
        }
    }
}
