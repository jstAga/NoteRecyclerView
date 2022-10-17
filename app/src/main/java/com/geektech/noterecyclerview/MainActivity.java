package com.geektech.noterecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvNote;
    private EditText etPressText;
    private Button btnAdd;
    private ArrayList<String> noteList = new ArrayList<>();
    private String newNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNote = findViewById(R.id.rv_note);
        etPressText = findViewById(R.id.et_press_text);
        btnAdd = findViewById(R.id.btn_add);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNote = etPressText.getText().toString();
                noteList.add(newNote);

                NoteAdapter noteAdapter = new NoteAdapter(noteList);
                rvNote.setAdapter(noteAdapter);
            }
        });

        NoteAdapter noteAdapter = new NoteAdapter(noteList);
        rvNote.setAdapter(noteAdapter);
    }

    public void initView() {
        rvNote = findViewById(R.id.rv_note);
        etPressText = findViewById(R.id.et_press_text);
        btnAdd = findViewById(R.id.btn_add);

    }
}