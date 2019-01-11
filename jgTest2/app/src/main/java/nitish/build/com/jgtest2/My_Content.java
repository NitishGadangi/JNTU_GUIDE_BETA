package nitish.build.com.jgtest2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class My_Content extends AppCompatActivity {

    static TabLayout tab_layout;

    /*
    @Override
    public void onBackPressed()
    {   //super.onBackPressed();
        Intent mainAct = new Intent(getApplicationContext(),MainActivity.class);
        //mainAct.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
        mainAct.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(mainAct);
        finish();

    }
    */

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
        setContentView(R.layout.activity_my__content);

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

        exitToast = Toast.makeText(getApplicationContext(), "Please click BACK again to exit", Toast.LENGTH_SHORT);

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(getApplicationContext(),R.color.ProfileStatusBar));

        Button bckBtn = findViewById(R.id.bckPrBtn);
        bckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainAct = new Intent(getApplicationContext(),MainActivity.class);
                //mainAct.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(mainAct);
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
        tab_layout.getTabAt(1).getIcon().setColorFilter(getResources().getColor(R.color.colorWhite), PorterDuff.Mode.SRC_IN);
        //tab_layout.getTabAt(2).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(2).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);
        tab_layout.getTabAt(3).getIcon().setColorFilter(getResources().getColor(R.color.BtmNavDull), PorterDuff.Mode.SRC_IN);

        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int test = tab.getPosition();
                Log.i("teeast","posipointer"+test);
                tab.getIcon().setColorFilter(getResources().getColor(R.color.colorWhite), PorterDuff.Mode.SRC_IN);
                switch (tab.getPosition()) {
                    case 0:
                        Intent homeActivity = new Intent(getApplicationContext(),MainActivity.class);
                        homeActivity.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(homeActivity);
                        finish();
                        break;
                    case 1:

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
