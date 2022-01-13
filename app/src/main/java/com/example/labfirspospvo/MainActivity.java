package com.example.labfirspospvo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView)findViewById(R.id.avatar);
        Bundle arguments = getIntent().getExtras();

        if(arguments!=null) {
            String fileName = arguments.get("fileName").toString();
            switch (fileName) {
                case "anime.JPG":
                    iv.setImageResource(R.drawable.anime);
                    break;
                case "cat.JPG":
                    iv.setImageResource(R.drawable.cat);
                    break;
                case "china.JPG":
                    iv.setImageResource(R.drawable.china);
                    break;
                case "diehard.JPG":
                    iv.setImageResource(R.drawable.diehard);
                    break;
                case "lenin.JPG":
                    iv.setImageResource(R.drawable.lenin);
                    break;
                default:
                    break;
            }
        }

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnActTwo:
                EditText nameText = findViewById(R.id.name);
                String name = nameText.getText().toString();
                Intent intent = new Intent(this, ActivityTwo.class);
                intent.putExtra("name", name);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}