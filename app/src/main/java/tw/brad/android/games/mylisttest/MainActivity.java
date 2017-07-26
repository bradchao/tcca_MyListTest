package tw.brad.android.games.mylisttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ListView list;
    private List<Map<String,String>> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);
        initListView();
    }


    private void initListView(){
        String[] from = {"brad", "tcca"};
        int[] to = {R.id.item_title, R.id.item_content};

        data = new LinkedList<>();

        Map<String,String> d0 = new HashMap<>();
        d0.put(from[0], "title 1");
        d0.put(from[1], "content 1");
        data.add(d0);

        Map<String,String> d1 = new HashMap<>();
        d1.put(from[0], "title 2");
        d1.put(from[1], "content 2");
        data.add(d1);


        SimpleAdapter adapter = new SimpleAdapter(
                this, data, R.layout.layout_item, from, to);
        list.setAdapter(adapter);


    }

}
