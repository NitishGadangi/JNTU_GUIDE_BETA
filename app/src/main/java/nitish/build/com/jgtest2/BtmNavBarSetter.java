package nitish.build.com.jgtest2;

import android.graphics.PorterDuff;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;

public class BtmNavBarSetter extends AppCompatActivity {
    public void initComponent(TabLayout tab_layout) {


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
                        Toast.makeText(getApplicationContext(), "0Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        // implement your code..
                        Toast.makeText(getApplicationContext(), "1Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        // implement your code..
                        Toast.makeText(getApplicationContext(), "2Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        // implement your code..
                        Toast.makeText(getApplicationContext(), "3Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        // implement your code..
                        Toast.makeText(getApplicationContext(), "4Clicked", Toast.LENGTH_SHORT).show();
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
