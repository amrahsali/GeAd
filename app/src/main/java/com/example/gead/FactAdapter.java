package com.example.gead;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Random;

public class FactAdapter  extends RecyclerView.Adapter<RecyclerViewHolder>  {
    private Random random;
    public FactAdapter(int i) {

        this.random = new Random(i);
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.fact_text;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new RecyclerViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        holder.getQuestion().setText("");
        holder.getAnswert().setText("");

    }

    @Override
    public int getItemCount() {
        return 100;
    }
}
