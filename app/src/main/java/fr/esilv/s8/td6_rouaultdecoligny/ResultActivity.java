package fr.esilv.s8.td6_rouaultdecoligny;

/*
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import adapters.Cell_resultAdapter;
import models.Cell_result;

/**
 * Created by auriane on 17/03/2017.
 */

/*
public class ResultActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    Cell_result cell_result;
    //Cell_resultAdapter adapter;
    Gson gson;

   // private String urlwithapikey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.row_result);

        Bundle extras = getIntent().getExtras();
        String text = (extras != null ? extras.getString("data") : null);
        //Log.d("Received Query", text);

        /*
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
*/
        //getResults();
   /* }


   /* public void  getResults() {



        String url = "https://www.googleapis.com/youtube/v3/search?part=snippet&q='" + qtext + "'&type=video&key=AIzaSyC-gh5lUS4qmqcuHjVsyFzjKD-YodumBVY";
        String apikey = "AIzaSyC-gh5lUS4qmqcuHjVsyFzjKD-YodumBVY";
        String urlwithapikey = url + "key=" + apikey;



        final StringRequest request = new StringRequest(urlwithapikey, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                String reponsestr = new String(response);
                gson = new Gson();
                cell_result = gson.fromJson(reponsestr, Cell_result.class);
                adapter = new Cell_resultAdapter(ResultActivity.this, cell_result.getItems());
                recyclerView.setAdapter(adapter);
                recyclerView.setOnItemClickListener(onItemClickListener);
                Log.d("Cell_result", response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError response) {
                Log.e("Cell_result", response.getMessage());
            }
        });
        Volley.newRequestQueue(this).add(request);
    }


    public String setUrl(String wordsearch){
        wordsearch = "https://www.googleapis.com/youtube/v3/search?part=snippet&q=" + wordsearch + "&type=video&key=AIzaSyC-gh5lUS4qmqcuHjVsyFzjKD-YodumBVY";
        return wordsearch;
    }

    }

*/