package com.eduardo.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.eduardo.playzoom.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

//    private Button btnGetStarted;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
 //       btnGetStarted= findViewById(R.id.btn_get_started);
 //       btnGetStarted.setOnClickListener(v -> {
 //           Toast.makeText(this, "comenzar", Toast.LENGTH_SHORT).show();
 //       });
    }
}