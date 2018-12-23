package nitish.build.com.jgtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

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
