package sg.edu.rp.c346.id22024905.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAndroid;
    TextView tvIpad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAndroid = findViewById(R.id.textViewAndroid);
        tvIpad = findViewById(R.id.textViewIpad);

        tvAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleCode", "C346");
                intent.putExtra("moduleName", "Android Programming");
                intent.putExtra("academicYear", 2020);
                intent.putExtra("academicSem", 1);
                intent.putExtra("moduleCredit", 4);
                intent.putExtra("moduleVenue", "W66M");
                startActivity(intent);
            }
        });

        tvIpad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleCode", "C349");
                intent.putExtra("moduleName", "iPad Programming");
                intent.putExtra("academicYear", 2018);
                intent.putExtra("academicSem", 1);
                intent.putExtra("moduleCredit", 4);
                intent.putExtra("moduleVenue", "E66C");
                startActivity(intent);
            }
        });

    }
}