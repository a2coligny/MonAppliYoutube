package fr.esilv.s8.td6_rouaultdecoligny;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import adapters.Cell_resultAdapter;
import models.Cell_result;





public class MainActivity extends AppCompatActivity {


    Gson gson;
    ListView lv;
    Cell_resultAdapter adapter;
    Cell_result cell_result;
    EditText searchquery;
    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.list);
        searchquery = (EditText) findViewById(R.id.search);

    }

    public void Submit(View v)
    {

        data = searchquery.getText().toString();
        //Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
        //intent.putExtra("data", searchquery);
        Log.d("Search Query : ", String.valueOf(data));
        getResults(data);


    }


    public String  getResults(String query) {


        String q = query.replaceAll("\\s","+");
        String url = "https://www.googleapis.com/youtube/v3/search?part=snippet&q=" + q + "&type=video&key=AIzaSyC-gh5lUS4qmqcuHjVsyFzjKD-YodumBVY";
      //  String apikey = "AIzaSyC-gh5lUS4qmqcuHjVsyFzjKD-YodumBVY";
       // String urlwithapikey = url + "key=" + apikey;



        final StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                gson = new Gson();
                cell_result = gson.fromJson(response, Cell_result.class);
                adapter = new Cell_resultAdapter(MainActivity.this, cell_result.getItems());
                lv.setAdapter(adapter);

                Log.d("Cell_result", response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError response) {
                Log.e("Cell_result", response.getMessage());
            }
        });
        Volley.newRequestQueue(this).add(request);

        return query;
    }
}




