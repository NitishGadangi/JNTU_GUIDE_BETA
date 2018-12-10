package nitish.build.com.jgtest2;

import android.content.Intent;
import android.graphics.PorterDuff;
import com.google.android.material.tabs.TabLayout;
import androidx.core.widget.NestedScrollView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Attributes -------------
    private TabLayout tab_layout;   // Bottom Tab Icon Layout
    Button syllabusButn,resultsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();
        syllabusButn=findViewById(R.id.syllabusBtn);
        syllabusButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent syllabusIntent = new Intent(getApplicationContext(),syllabus_select_course.class);
                startActivity(syllabusIntent);
                }});

        resultsBtn=findViewById(R.id.resultsBtn);
        resultsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultsWebIntent = new Intent(getApplicationContext(),results_web.class);
                startActivity(resultsWebIntent);
            }
        });
    }

    private void initComponent() {

        tab_layout = (TabLayout) findViewById(R.id.btmNav);

        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_home), 0);
        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_star), 1);
        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_sharezone), 2);
        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_navicon), 3);
        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_threedots), 4);

        // set icon color pre-selected
        tab_layout.getTabAt(0).getIcon().setColorFilter(getResources().getColor(R.color.colorWhite), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(1).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(2).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(3).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(4).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);

        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(getResources().getColor(R.color.colorWhite), PorterDuff.Mode.SRC_IN);
                switch (tab.getPosition()) {
                    case 0:
                        // implement your code..like Toast msg.
                        Toast.makeText(MainActivity.this, "0Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        // implement your code..
                        Toast.makeText(MainActivity.this, "1Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        // implement your code..
                        Toast.makeText(MainActivity.this, "2Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        // implement your code..
                        Toast.makeText(MainActivity.this, "3Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        // implement your code..
                        Toast.makeText(MainActivity.this, "4Clicked", Toast.LENGTH_SHORT).show();
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
