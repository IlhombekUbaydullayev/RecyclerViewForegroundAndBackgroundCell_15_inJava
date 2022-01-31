package com.example.recyclerviewforegroundandbackgroundcell_15_injava.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewforegroundandbackgroundcell_15_injava.R;
import com.example.recyclerviewforegroundandbackgroundcell_15_injava.model.Member;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<Member> members;
    public CustomAdapter(Context context,List<Member> members){
        this.context = context;
        this.members = members;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_custom_layout,viewGroup,false);

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Member member = members.get(position);

        if (holder instanceof CustomViewHolder) {

        }
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    public void removeItem(int position) {
        members.remove(position);

        notifyItemRemoved(position);
    }

    public void restoreItem(Member member, int position) {
        members.add(position,member);
        notifyItemInserted(position);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public RelativeLayout view_background,view_foreground;

        public CustomViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            view_background = view.findViewById(R.id.view_background);
            view_foreground = view.findViewById(R.id.view_foreground);
        }
    }
}