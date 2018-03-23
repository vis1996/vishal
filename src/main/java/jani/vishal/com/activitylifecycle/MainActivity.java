package jani.vishal.com.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart activity", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onCreate");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause activity", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onPause");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart activity", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy activity", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onDestroy");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop activity", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity","onStop");
    }
}
