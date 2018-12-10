package nitish.build.com.jgtest2;

import androidx.appcompat.app.AppCompatActivity;

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
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import static nitish.build.com.jgtest2.AllStringsArrays.*;



public class syllabus_select_course extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_select_course);
        //initToolbar();

        Toolbar toolbar = findViewById(R.id.toolbarSyll);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Select A Course");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // what do you want here
                onBackPressed();
            }
        });

        ListView courseList = findViewById(R.id.courseList);
        CustomAdapter coursesAdapter = new CustomAdapter();
        courseList.setAdapter(coursesAdapter);

        courseList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0||position==4||position==5){
                    //Goto profile
                    //

                }else{
                    Intent toBranch = new Intent(getApplicationContext(),Syllabus_Branch.class);
                    toBranch.putExtra("Course",position);
                    startActivity(toBranch);
                }
            }
        });

    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            Log.i("Countaaaa",Integer.toString(COURSES.length));
            //Toast.makeText(syllabus_select_course.this, COURSES.length, Toast.LENGTH_SHORT).show();
            return (COURSES.length+1);
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
                    customListHead = convertView.findViewById(R.id.customListHeading),
                    customListDes = convertView.findViewById(R.id.customListDes);
            ImageView rightArrow = convertView.findViewById(R.id.rightArrow);


            if (position == 0){
                rightArrow.setVisibility(View.VISIBLE);
                //customlistNo.setVisibility(View.INVISIBLE);
                customListHead.setText("Jump to Your Syllabus");
                customListDes.setText("Based on your Profile Data");
            }else {
                rightArrow.setVisibility(View.INVISIBLE);
                //customlistNo.setVisibility(View.VISIBLE);
                customlistNo.setText(Integer.toString(position));
                customListHead.setText(COURSES[position-1]);
                customListDes.setText(COURSESDES[position-1]);
            }
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
