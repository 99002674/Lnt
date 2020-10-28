package com.example.lnt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    ArrayList<Note> noteArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        noteArrayList = new ArrayList<>();

        createData();
        NotesAdapter adapter = new NotesAdapter(this, noteArrayList);
        RecyclerView notesRecyclerView = findViewById(R.id.notes_recyclerview);
        notesRecyclerView.setAdapter(adapter);
        notesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void createData() {
        noteArrayList.add(new Note("title1", "subtitle1"));
        noteArrayList.add(new Note("title11", "subtitle11"));
        noteArrayList.add(new Note("title12", "subtitle12"));
        noteArrayList.add(new Note("title13", "subtitle13"));
        noteArrayList.add(new Note("title14", "subtitle14"));
        noteArrayList.add(new Note("title15", "subtitle15"));
        noteArrayList.add(new Note("title16", "subtitle16"));
        noteArrayList.add(new Note("title17", "subtitle17"));
    }
}