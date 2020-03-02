package com.curso.workshopapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import android.os.Bundle;
import android.widget.Toast;

import com.curso.workshopapi.Adapters.FilmsAdapter;
import com.curso.workshopapi.Models.Film;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private FilmsAdapter filmsAdapter;
    private List<Film> filmList = new ArrayList<>();
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //date();
        mRecyclerView = findViewById(R.id.myRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        //filmsAdapter = new FilmsAdapter(this,filmList);
        //mRecyclerView.setAdapter(filmsAdapter);
        OkHttpClient client = new OkHttpClient();
        final Request request = new Request.Builder()
                .url("https://swapi.co/api/films/?format=json")
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                Toast.makeText(getApplicationContext(), "No se puedo conectar"
                        , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                String json = response.body().string();
                JsonArray jsonArray;
                JsonObject jsonObject = new Gson().fromJson(json,(Type) JsonObject.class);
                jsonArray = jsonObject.getAsJsonArray("results");

                Gson gson = new GsonBuilder().create();
                Type list = new TypeToken<List<Film>>(){}.getType();
                filmList = gson.fromJson(jsonArray.toString(),list);

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        filmsAdapter = new FilmsAdapter(getApplicationContext(),filmList);
                        mRecyclerView.setAdapter(filmsAdapter);
                    }
                });
            }
        });

        update();
    }

    private void update() {

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                filmsAdapter = new FilmsAdapter(getApplicationContext(),filmList);
                filmsAdapter.notifyDataSetChanged();
            }
        });
    }

    public void date(){

        Film film = new Film();
        film.setTitle("Title");
        film.setEpidose_id(1);
        film.setOpening_clawl("opening");
        film.setDirector("director");
        film.setProducer("producer");
        film.setUrl("URL");
        film.setCreated("created");
        film.setEdited("edited");

        filmList.add(film);

        film = new Film();
        film.setTitle("Title");
        film.setEpidose_id(2);
        film.setOpening_clawl("opening");
        film.setDirector("director");
        film.setProducer("producer");
        film.setUrl("URL");
        film.setCreated("created");
        film.setEdited("edited");

        filmList.add(film);

        film = new Film();
        film.setTitle("Title");
        film.setEpidose_id(3);
        film.setOpening_clawl("opening");
        film.setDirector("director");
        film.setProducer("producer");
        film.setUrl("URL");
        film.setCreated("created");
        film.setEdited("edited");

        filmList.add(film);

        film = new Film();
        film.setTitle("Title");
        film.setEpidose_id(4);
        film.setOpening_clawl("opening");
        film.setDirector("director");
        film.setProducer("producer");
        film.setUrl("URL");
        film.setCreated("created");
        film.setEdited("edited");

        filmList.add(film);

        film = new Film();
        film.setTitle("Title");
        film.setEpidose_id(5);
        film.setOpening_clawl("opening");
        film.setDirector("director");
        film.setProducer("producer");
        film.setUrl("URL");
        film.setCreated("created");
        film.setEdited("edited");

        filmList.add(film);

        film = new Film();
        film.setTitle("Title");
        film.setEpidose_id(6);
        film.setOpening_clawl("opening");
        film.setDirector("director");
        film.setProducer("producer");
        film.setUrl("URL");
        film.setCreated("created");
        film.setEdited("edited");

        filmList.add(film);

        film = new Film();
        film.setTitle("Title");
        film.setEpidose_id(7);
        film.setOpening_clawl("opening");
        film.setDirector("director");
        film.setProducer("producer");
        film.setUrl("URL");
        film.setCreated("created");
        film.setEdited("edited");

        filmList.add(film);

        film = new Film();
        film.setTitle("Title");
        film.setEpidose_id(8);
        film.setOpening_clawl("opening");
        film.setDirector("director");
        film.setProducer("producer");
        film.setUrl("URL");
        film.setCreated("created");
        film.setEdited("edited");

        filmList.add(film);

        film = new Film();
        film.setTitle("Title");
        film.setEpidose_id(9);
        film.setOpening_clawl("opening");
        film.setDirector("director");
        film.setProducer("producer");
        film.setUrl("URL");
        film.setCreated("created");
        film.setEdited("edited");

        filmList.add(film);

        film = new Film();
        film.setTitle("Title");
        film.setEpidose_id(10);
        film.setOpening_clawl("opening");
        film.setDirector("director");
        film.setProducer("producer");
        film.setUrl("URL");
        film.setCreated("created");
        film.setEdited("edited");

        filmList.add(film);

    }
}
