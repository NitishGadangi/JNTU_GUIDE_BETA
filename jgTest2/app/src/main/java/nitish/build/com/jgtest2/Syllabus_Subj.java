package nitish.build.com.jgtest2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Syllabus_Subj extends AppCompatActivity {
    String[][] listStringArrAr;
    int codeCourseBranchYearSemPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus__subj);

        Intent sourceIntent = getIntent();
        codeCourseBranchYearSemPos = sourceIntent.getIntExtra("CourseBranchYearSem",11111);

        Toolbar toolbar = findViewById(R.id.toolbarSyll);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Select a Subject");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // what do you want here
                onBackPressed();
            }
        });


        try {
            listStringArrAr=ArrayListSetter.setSubjectList(ArrayListSetter.extractCodeForSubject(codeCourseBranchYearSemPos));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //setListStringArray(clickedCoursePos);

        ListView courseList = findViewById(R.id.subjList);
        CustomAdapter coursesAdapter = new CustomAdapter();
        courseList.setAdapter(coursesAdapter);

        courseList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String codeStr = Integer.toString(codeCourseBranchYearSemPos)+Integer.toString(position);
                Intent toSemList = new Intent(getApplicationContext(),PdfViewerTest.class);
                toSemList.putExtra("CourseBranchYearSemSubj",Integer.parseInt(codeStr));
                startActivity(toSemList);


            }
        });


    }


    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            //Log.i("Countaaaa",Integer.toString(listStringArr.length));
            //Toast.makeText(syllabus_select_course.this, COURSES.length, Toast.LENGTH_SHORT).show();
            return (listStringArrAr.length);
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.custom_listview_latout_syll,null);

            TextView bg = convertView.findViewById(R.id.listlayoutbg),
                    customlistNo = convertView.findViewById(R.id.customListNo),
                    customListHead = convertView.findViewById(R.id.refListHead),
                    customListDes = convertView.findViewById(R.id.customListDes);
            ImageView rightArrow = convertView.findViewById(R.id.rightArrow);



            rightArrow.setVisibility(View.INVISIBLE);
            //customlistNo.setVisibility(View.VISIBLE);
            customlistNo.setText(Integer.toString(position+1));
            customListHead.setText(listStringArrAr[position][0]);
            customListDes.setText(listStringArrAr[position][1]);

            return convertView;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_basic,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId())
        {}
        return super.onOptionsItemSelected(item);
    }


}
