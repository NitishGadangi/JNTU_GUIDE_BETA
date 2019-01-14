package nitish.build.com.jgtest2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

public class Syllabus_Sem extends AppCompatActivity {
    String[] listStringArr;
    int codeCourseBranchYearPos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus__sem);

        Intent sourceIntent = getIntent();
        codeCourseBranchYearPos = sourceIntent.getIntExtra("CourseBranchYear",1111);

        Toolbar toolbar = findViewById(R.id.toolbarSyll);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Select Semester");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // what do you want here
                onBackPressed();
            }
        });

        //listStringArr=ArrayListSetter.setSemList(codeCourseBranchYearPos);
        listStringArr=AllStringsArrays.SEMESTERS;
        //setListStringArray(clickedCoursePos);

        ListView courseList = findViewById(R.id.semList);
        CustomAdapter coursesAdapter = new CustomAdapter();
        courseList.setAdapter(coursesAdapter);

        courseList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String codeStr = Integer.toString(codeCourseBranchYearPos)+Integer.toString(position);
                if(Character.getNumericValue(codeStr.charAt(2))==0) {//at present if for ECE

                    if (Character.getNumericValue(codeStr.charAt(0))==1){
                    Intent toSubjList = new Intent(getApplicationContext(), Syllabus_Subj.class);
                    toSubjList.putExtra("CourseBranchYearSem", Integer.parseInt(codeStr));
                    startActivity(toSubjList);
                    }else if(Character.getNumericValue(codeStr.charAt(0))==2){
                        Intent toRefBooksDisplay = new Intent(getApplicationContext(),Show_Available_Books.class);
                        toRefBooksDisplay.putExtra("CourseBranchYearSem", Integer.parseInt(codeStr));
                        startActivity(toRefBooksDisplay);
                    }
                }
                //Test
                //Intent toPdfViewer = new Intent(getApplicationContext(),PdfViewerTest.class);
                //startActivity(toPdfViewer);

            }
        });
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            Log.i("Countaaaa",Integer.toString(listStringArr.length));
            //Toast.makeText(syllabus_select_course.this, COURSES.length, Toast.LENGTH_SHORT).show();
            return (listStringArr.length);
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
            customListHead.setText(listStringArr[position]);
            customListDes.setText(listStringArr[position]);

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
