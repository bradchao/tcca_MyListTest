package tw.brad.android.games.mylisttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Page3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

    }

    @Override
    public void finish() {
        Intent it = new Intent();
        it.putExtra("key", "Brad");
        setResult(222, it);
        super.finish();
    }
}
