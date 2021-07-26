package com.example.recyclerviewadditemfromotheractivity;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewadditemfromotheractivity.databinding.RecyclerViewItemBinding;

import java.util.ArrayList;

public class RecyclcerViewAdapter extends RecyclerView.Adapter<RecyclcerViewAdapter.RecyclerViewHolder> {

    private ArrayList<ModelItemMurojaah> murojaahArrayList;

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private AppCompatTextView noSurat;
        private AppCompatTextView namaSurat;
        private AppCompatTextView halamanSurat;
        public RecyclerViewItemBinding recyclerViewItemBinding;

        public RecyclerViewHolder( RecyclerViewItemBinding recyclerViewItemBinding) {
            super(recyclerViewItemBinding.getRoot());
            this.recyclerViewItemBinding = recyclerViewItemBinding;
            this.noSurat = recyclerViewItemBinding.noMurojaah;
            this.namaSurat = recyclerViewItemBinding.namaSurat;
            this.halamanSurat = recyclerViewItemBinding.namaSurat;
        }

        // Kalo dari stackoverflow in ga dipake, https://stackoverflow.com/a/60313720
        // tapi kalo dari Medium https://medium.com/androiddevelopers/android-data-binding-recyclerview-db7c40d9f0e4
//        public void bind(ClipData.Item item) {
//            recyclerViewItemBinding.setItem(item);
//        }
    }

    public RecyclcerViewAdapter (ArrayList<ModelItemMurojaah> iMurojaahArrayList) {
        this.murojaahArrayList = iMurojaahArrayList;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        return new RecyclerViewHolder(RecyclerViewItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull RecyclcerViewAdapter.RecyclerViewHolder holder, int position) {
        ModelItemMurojaah murojaahCurrentItem = murojaahArrayList.get(position);
        holder.recyclerViewItemBinding.noMurojaah.setText(murojaahCurrentItem.getNoMurojaah());
        holder.recyclerViewItemBinding.namaSurat.setText(murojaahCurrentItem.getNamaSurat());
        holder.recyclerViewItemBinding.halamanSurat.setText(murojaahCurrentItem.getHalamanSurat());
    }

    @Override
    public int getItemCount() {
        return murojaahArrayList.size();
    }
}
