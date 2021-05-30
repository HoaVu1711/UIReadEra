package com.vdh.testnavigation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vdh.testnavigation.R;
import com.vdh.testnavigation.model.Book;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ListBookAdapter extends RecyclerView.Adapter<ListBookAdapter.ViewHolder> {
    private List<Book>bookList;

    public void setData(List<Book>mList){
        this.bookList=mList;
        notifyDataSetChanged();
    }
    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
        holder.imgAvatar.setImageResource(bookList.get(position).getAvatar());
        holder.tvName.setText(bookList.get(position).getName());
        holder.tvAuthor.setText(bookList.get(position).getAuthor());
        holder.tvDescribe.setText(bookList.get(position).getDescribe());
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgAvatar;
        private TextView tvName;
        private TextView tvAuthor;
        private TextView tvDescribe;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imgAvatar=itemView.findViewById(R.id.avatar_book);
            tvName=itemView.findViewById(R.id.tv_title_book);
            tvAuthor=itemView.findViewById(R.id.tv_author);
            tvDescribe=itemView.findViewById(R.id.tv_describe);
        }
    }
}
