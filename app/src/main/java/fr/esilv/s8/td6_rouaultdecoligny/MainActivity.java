package fr.esilv.s8.td6_rouaultdecoligny;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

   EditText edit =(EditText)findViewById(R.id.search);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void Submit(View v)
    {
        String searchquery = String.valueOf(edit.getText());
        Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
        intent.putExtra("data", searchquery);
        Log.d("Search Query : ", searchquery);
        startActivity(intent);
    }
}




