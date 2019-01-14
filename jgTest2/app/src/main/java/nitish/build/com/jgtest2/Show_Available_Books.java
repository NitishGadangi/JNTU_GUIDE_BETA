package nitish.build.com.jgtest2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Show_Available_Books extends AppCompatActivity {

    int codeCourseBranchYearSemPos;
    ProgressDialog progress;
    String webData="";
    String[] listStringArr;
    ListView bookList;
    CustomAdapter customAdapter;

    //---------SERVER END ASYNC TASKS-------------------------//

    public class myAsyncTask extends AsyncTask<String, Void, Void> {
        public String html;


        @Override
        protected void onPreExecute() {

            progress = ProgressDialog.show(Show_Available_Books.this, "Updating Profile", "Please Wait", true);
            progress.show();
        }

        protected Void doInBackground(String... params) {
            try {

                URL url = new URL(params[0]);
                HttpURLConnection response = (HttpURLConnection) url.openConnection();

                String html = "";
                InputStream in = response.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                StringBuilder str = new StringBuilder();
                String line = null;
                while ((line = reader.readLine()) != null) {
                    str.append(line);
                }
                in.close();
                html = str.toString();
                webData=html;
                Log.i("1ABCDEF",html);
            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void v) {
            //Log.e(TAG, "result: " + response);
            try {
                setListView();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (progress.isShowing()) {
                progress.dismiss();
            }
        }
    }

    //----------------------------------------------//

    public  void setListView() throws JSONException {
        listStringArr = ArrayListSetter.getStringSetFromJson(webData,"name");
        bookList.setAdapter(customAdapter);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show__available__books);

        //dialog = new ProgressDialog(getApplicationContext());

        Intent sourceIntent = getIntent();
        codeCourseBranchYearSemPos = sourceIntent.getIntExtra("CourseBranchYearSem",11111);
        final TextView refTest = findViewById(R.id.refTest);
        refTest.setText(Integer.toString(codeCourseBranchYearSemPos));

        Toolbar toolbar = findViewById(R.id.toolbarSyll);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Books Available");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // what do you want here
                onBackPressed();
            }
        });



        myAsyncTask task= new myAsyncTask();
        task.execute("https://script.google.com/macros/s/AKfycbxOLElujQcy1-ZUer1KgEvK16gkTLUqYftApjN" +
                "CM_IRTL3HSuDk/exec?id=1IqCxn0vLmkhl-Q-EJvl4x9JRsTl7LyzDBR24WEwBZUg&sheet=Sheet1");


        bookList = findViewById(R.id.refBooksList);
        customAdapter = new CustomAdapter();

        bookList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    RefBooksBtmSht btmSht = new RefBooksBtmSht();

                    Bundle bundle = new Bundle();
                    bundle.putString("webData",webData);
                    bundle.putInt("ClickPos",position);
                    btmSht.setArguments(bundle);

                    btmSht.show(getSupportFragmentManager(),"refBooksBtmSht");
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
            convertView = getLayoutInflater().inflate(R.layout.custom_ref_books,null);

            TextView head = convertView.findViewById(R.id.refListHead),
                    des = convertView.findViewById(R.id.refListDes);
            ImageView book = convertView.findViewById(R.id.ref_icon),
                    down = convertView.findViewById(R.id.ref_down_icon);


            head.setText(listStringArr[position]);

            return convertView;
        }
    }
}
