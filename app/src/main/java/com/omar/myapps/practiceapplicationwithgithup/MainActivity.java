package com.omar.myapps.practiceapplicationwithgithup;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "hello home!!!!", Toast.LENGTH_SHORT).show();
            textView.setText("message was shown");
        }
    };

    private Button showMessageBtn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        showMessageBtn = findViewById(R.id.shoeMessagebutton);
        textView = findViewById(R.id.textview);
        showMessageBtn.setOnClickListener(onClickListener);

    }
}
