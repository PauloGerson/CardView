package com.example.principal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;

import android.content.Context;
import android.os.Bundle;
import android.widget.GridLayout;

import com.example.principal.entity.Pessoa;
import com.example.principal.entity.PessoaAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    List<Pessoa> myDataset;
    //List<String> myDataset = new ArrayList<>();
    //Pessoa teste = new Pessoa();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       recyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
        myDataset = new ArrayList<>();

        Pessoa person = new Pessoa("Paulo",12);

        myDataset.add(person);
         layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

       // specify an adapter (see also next example)
         mAdapter = new PessoaAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);
    }

    public Context getActivity(){
        return this;
    }
}