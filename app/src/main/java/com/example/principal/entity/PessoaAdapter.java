package com.example.principal.entity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.principal.R;

import java.util.List;

public class PessoaAdapter extends RecyclerView.Adapter<PessoaAdapter.MyViewHolder> {

    private List<Pessoa> mDataset;

    public PessoaAdapter(List<Pessoa> myDataset) {
        this.mDataset = myDataset;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        // each data item is just a string in this case
        public TextView textView, textView2;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.nome);
            textView2 = itemView.findViewById(R.id.idade);
        }
    }

    public PessoaAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_pessoa, parent, false);

        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textView.setText((CharSequence) mDataset.get(position));

    }

    public int getItemCount() {
        return mDataset.size();
    }
}
