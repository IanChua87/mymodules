package sg.edu.rp.c346.id22024905.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvmoduleCode;
    TextView tvmoduleName;
    TextView tvmoduleYear;
    TextView tvmoduleSem;
    TextView tvmoduleCredit;
    TextView tvmoduleVenue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvmoduleCode = findViewById(R.id.textViewModuleCode);
        tvmoduleName = findViewById(R.id.textViewModuleName);
        tvmoduleYear = findViewById(R.id.textViewAcademicYear);
        tvmoduleSem = findViewById(R.id.textViewSem);
        tvmoduleCredit = findViewById(R.id.textViewCredit);
        tvmoduleVenue = findViewById(R.id.textViewVenue);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("moduleCode");
        tvmoduleCode.setText("Module Code: " + moduleCode);
        String moduleName = intentReceived.getStringExtra("moduleName");
        tvmoduleName.setText("Module Name: " + moduleName);
        int moduleYear = intentReceived.getIntExtra("academicYear", 0);
        tvmoduleYear.setText("Academic Year: " + moduleYear);
        int moduleSem = intentReceived.getIntExtra("academicSem", 1);
        tvmoduleSem.setText("Semester: " + moduleSem);
        int moduleCred = intentReceived.getIntExtra("moduleCredit", 1);
        tvmoduleCredit.setText("Module Credit: " + moduleCred);
        String moduleVenue = intentReceived.getStringExtra("moduleVenue");
        tvmoduleVenue.setText("Venue: " + moduleVenue);


    }
}