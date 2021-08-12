package com.example.aug12_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.aug12_2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'aug12_2' library on application startup.
    static {
        System.loadLibrary("aug12_2");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'aug12_2' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}