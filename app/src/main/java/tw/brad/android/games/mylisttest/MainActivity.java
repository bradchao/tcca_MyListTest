package tw.brad.android.games.mylisttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends AppCompatActivity {
    private ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);
        initListView();
    }


    private void initListView(){
        SimpleAdapter adapter = new SimpleAdapter(
                this, data, R.layout.layout_item, from, to);
        list.setAdapter(adapter);


    }


}
