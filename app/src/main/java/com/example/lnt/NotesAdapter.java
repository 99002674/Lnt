package com.example.lnt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewHolder> {
    LayoutInflater mLayoutInflater;
    ArrayList<Note> noteArrayList;

    public NotesAdapter(Context context, ArrayList<Note> notes) {
        noteArrayList = notes;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override // buy the planks-- sachin
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View notePlank = mLayoutInflater.inflate(R.layout.row_layout_listview, parent, false);

        return new NotesViewHolder(notePlank);
    }

    @Override // shikar-- write on the planks
    public void onBindViewHolder(@NonNull NotesViewHolder plankGivenSachin, int position) {
        Note note = noteArrayList.get(position);
        String title = note.getTitle();
        String subTitle = note.getSubTitle();

        plankGivenSachin.titleTextview.setText(title);
        plankGivenSachin.subTitleTextview.setText(subTitle);
    }

    @Override // sohel-- keep count of the data items
    public int getItemCount() {
        return noteArrayList.size();
    }

    public class NotesViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextview, subTitleTextview;
        public NotesViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextview = itemView.findViewById(R.id.textViewTitle);
            subTitleTextview = itemView.findViewById(R.id.textViewSubtitle);
        }
    }
}
