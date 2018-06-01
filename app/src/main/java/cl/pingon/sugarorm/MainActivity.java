package cl.pingon.sugarorm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import cl.pingon.sugarorm.models.Favorite;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Favorite favorite = new Favorite("www.google.cl", true);
        favorite.save();

        Log.d("E4", String.valueOf(favorite.getId()));

    }
}
