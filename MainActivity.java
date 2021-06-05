package com.tijaniadewale.temp.toastimages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void newClick(View view){
        ImageView image =  (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.view);
        EditText UserName = findViewById(R.id.UserName);
        Log.i("Username", UserName.getText().toString());
        Toast.makeText(this, "Hi! " + UserName.getText(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
