package nitish.build.com.jgtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import static nitish.build.com.jgtest2.AllStringsArrays.*;

public class MainMoreActivity extends AppCompatActivity {

    static TabLayout tab_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_more);

        initComponent();

        Button tempHome = findViewById(R.id.tempHome);
        tempHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeActivity = new Intent(getApplicationContext(),MainActivity.class);
                homeActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(homeActivity);
                finish();
            }
        });

        ListView moreList = findViewById(R.id.more_list);
        CustomAdapter moreAdapter = new CustomAdapter();
        moreList.setAdapter(moreAdapter);

    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            //Log.i("Countaaaa",Integer.toString(COURSES.length));
            //Toast.makeText(syllabus_select_course.this, COURSES.length, Toast.LENGTH_SHORT).show();
            return (MORE_LIST.length);
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
            convertView = getLayoutInflater().inflate(R.layout.custom_more_list_view,null);

            TextView heading = convertView.findViewById(R.id.cus_more_heading);
            ImageView icon = convertView.findViewById(R.id.cus_more_icon),
                    border = convertView.findViewById(R.id.cus_more_border);

            heading.setText(MORE_LIST[position][0]);
            icon.setImageResource(Integer.parseInt(MORE_LIST[position][1]));
            return convertView;
        }
    }


    private void initComponent() {

        tab_layout = (TabLayout) findViewById(R.id.btmNav);

        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_home), 0);
        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_star), 1);
        //tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_sharezone), 2);
        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_navicon), 2);
        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_threedots), 3);

        // set icon color pre-selected
        tab_layout.getTabAt(0).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(1).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);
        //tab_layout.getTabAt(2).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(2).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(3).getIcon().setColorFilter(getResources().getColor(R.color.colorWhite), PorterDuff.Mode.SRC_IN);

        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int test = tab.getPosition();
                Log.i("teeast","posipointer"+test);
                tab.getIcon().setColorFilter(getResources().getColor(R.color.colorWhite), PorterDuff.Mode.SRC_IN);
                switch (tab.getPosition()) {
                    case 0:
                        Intent homeActivity = new Intent(getApplicationContext(),MainActivity.class);
                        homeActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(homeActivity);
                        finish();


                        break;
                    case 1:
                        Intent starActivity = new Intent(getApplicationContext(),My_Content.class);
                        starActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        starActivity.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        startActivity(starActivity);

                        break;
                    case 2:
                        Intent navActivity = new Intent(getApplicationContext(),MainNavActivity.class);
                        navActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        navActivity.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        startActivity(navActivity);
                        finish();
                        break;
                    case 3:

                        break;

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
