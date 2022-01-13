package com.example.labfirspospvo;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.labfirspospvo.databinding.ActivityTwoBinding;

import android.view.View.OnClickListener;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener{

    private AppBarConfiguration appBarConfiguration;
    private ActivityTwoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityTwoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_activity_two);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        Button batname = (Button)findViewById(R.id.btnActTwoTwo);
        Bundle arguments = getIntent().getExtras();


        if(arguments!=null){
            String name = arguments.get("name").toString();
            batname.setText("Go back?: "+name) ;
        }

    }
    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btnActTwoTwo:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.button1:
            case R.id.imageView1:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("fileName", "anime.JPG");
                startActivity(intent);
                break;
            case R.id.button2:
            case R.id.imageView2:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("fileName", "cat.JPG");
                startActivity(intent);
                break;
            case R.id.button3:
            case R.id.imageView3:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("fileName", "china.JPG");
                startActivity(intent);
                break;
            case R.id.button4:
            case R.id.imageView4:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("fileName", "diehard.JPG");
                startActivity(intent);
                break;
            case R.id.button5:
            case R.id.imageView5:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("fileName", "lenin.JPG");
                startActivity(intent);
                break;
            default:
                break;
        }
    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_activity_two);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}