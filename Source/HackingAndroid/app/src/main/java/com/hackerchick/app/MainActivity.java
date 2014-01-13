package com.hackerchick.app;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    private TextView _textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _textView = (TextView) findViewById(R.id.textview_conference);

        _textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeConferenceName();
            }
        });
    }

    private void changeConferenceName() {
        _textView.setText(R.string.hello_andevcon);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            _textView.setText(R.string.hello_codemash);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
