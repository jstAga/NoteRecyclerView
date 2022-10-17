package com.geektech.noterecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class NoteHolder extends RecyclerView.ViewHolder {
    private TextView tvNote;



    public NoteHolder(@NonNull View itemView) {
        super(itemView);

        tvNote = itemView.findViewById(R.id.tv_note);
    }

    public void bind(String note){
        tvNote.setText(note);
    }
}
