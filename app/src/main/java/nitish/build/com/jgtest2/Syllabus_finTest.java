package nitish.build.com.jgtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Syllabus_finTest extends AppCompatActivity {
    int codeCourseBranchYearSemPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_fin_test);

        Intent sourceIntent = getIntent();
        codeCourseBranchYearSemPos = sourceIntent.getIntExtra("CourseBranchYearSem",1);

        TextView testString = findViewById(R.id.testFinSyllabus);
        testString.setText(ArrayListSetter.getFinalCourseName(codeCourseBranchYearSemPos));

    }
}
