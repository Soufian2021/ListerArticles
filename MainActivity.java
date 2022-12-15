package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listviewapp.model.Article;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Article> articles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        articles = new ArrayList<>();
        articles.add(new Article(1, "pain", 2.));
        articles.add(new Article(2, "sucre", 10.));
        articles.add(new Article(3, "huile", 23.));
        articles.add(new Article(4, "café", 12.));

        //for (Article a:arts) {
        //Toast.makeText(this, a.toString(), Toast.LENGTH_SHORT).show();
        //}

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_main, arts);
        ListView listView = (ListView) findViewById(R.id.articlesList);
        listView.setAdapter(adapter);

    }
}

