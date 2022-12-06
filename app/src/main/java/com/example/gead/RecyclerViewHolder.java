package com.example.gead;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder{
    private TextView  question, answer, payer_name, amount;
    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        answer = itemView.findViewById(R.id.answer);
        question = itemView.findViewById(R.id.question);

    }

    public TextView getQuestion(){
        return question;
    }

    public TextView getAnswert(){
        return amount;
    }
}
