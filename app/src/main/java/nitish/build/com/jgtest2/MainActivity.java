package nitish.build.com.jgtest2;

import android.content.Intent;
import android.graphics.PorterDuff;
import com.google.android.material.tabs.TabLayout;
import androidx.core.widget.NestedScrollView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Attributes -------------
    static TabLayout tab_layout;   // Bottom Tab Icon Layout
    Button syllabusButn,refbooksBtn,resultsBtn;

    //------------------------   Double tap to Exit   ----------------------------//


    private boolean doubleBackToExitPressedOnce;
    private Handler mHandler = new Handler();
    public Toast exitToast ;

    private final Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            doubleBackToExitPressedOnce = false;
        }
    };

    @Override
    protected void onDestroy()
    {
        super.onDestroy();

        if (mHandler != null) { mHandler.removeCallbacks(mRunnable); }
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            exitToast.cancel();
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        exitToast.show();

        mHandler.postDelayed(mRunnable, 2000);
    }

    //------------------- End of Double tap to Exit code --------------------//


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initComponent();
        Log.i("hello","position");

        exitToast = Toast.makeText(getApplicationContext(), "Please click BACK again to exit", Toast.LENGTH_SHORT);

        syllabusButn=findViewById(R.id.syllabusBtn);
        syllabusButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent syllabusIntent = new Intent(getApplicationContext(),syllabus_select_course.class);
                syllabusIntent.putExtra("initCode",1);
                startActivity(syllabusIntent);
                }});

        refbooksBtn=findViewById(R.id.refbooksBtn);
        refbooksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent refBooks = new Intent(getApplicationContext(),syllabus_select_course.class);
                refBooks.putExtra("initCode",2);
                startActivity(refBooks);
            }
        });


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
        Log.i("hello","position");

        tab_layout = (TabLayout) findViewById(R.id.btmNav);

        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_home), 0);
        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_star), 1);
        //tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_sharezone), 2);
        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_navicon), 2);
        tab_layout.addTab(tab_layout.newTab().setIcon(R.drawable.ic_threedots), 3);

        // set icon color pre-selected
        tab_layout.getTabAt(0).getIcon().setColorFilter(getResources().getColor(R.color.colorWhite), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(1).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);
        //tab_layout.getTabAt(2).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(2).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(3).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);

        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //tab.getIcon().setColorFilter(getResources().getColor(R.color.colorWhite), PorterDuff.Mode.SRC_IN);
                int test = tab.getPosition();
                Log.i("teeast","posipointer"+test);
                switch (tab.getPosition()) {
                    case 0:
                        //Toast.makeText(MainActivity.this, "1Clicked", Toast.LENGTH_SHORT).show();

                        break;
                    case 1:

                        Log.i("teeast","position"+test);
                        Intent starActivity = new Intent(getApplicationContext(),My_Content.class);
                        starActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        starActivity.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        startActivity(starActivity);
                        finish();

                        //Toast.makeText(MainActivity.this, "1Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Intent navActivity = new Intent(getApplicationContext(),MainNavActivity.class);
                        navActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        navActivity.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        startActivity(navActivity);
                        finish();

                        break;
                    case 3:
                        Intent moreActivity = new Intent(getApplicationContext(),MainMoreActivity.class);
                        moreActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        moreActivity.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        startActivity(moreActivity);
                        finish();

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
