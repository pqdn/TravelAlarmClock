package app.travelalarmclock.grafinterface.geoalarm.geoalarm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.TextView;

import app.travelalarmclock.R;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {
    public final static String ARRIVAL_STATION = "app.travelalarmclock.grafinterface.geoalarm.geoalarm.ARRIVAL";

    AutoCompleteTextView mAutoComplete;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAutoComplete = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        mListView = (ListView) findViewById(R.id.listView2);

        addTemplatesInAutoCompleteTextView();
        addLastResponses();

        mListView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void addTemplatesInAutoCompleteTextView() {
        String[] templates = {"Лесная", "Политехническая", "пл. Мужества"};
        mAutoComplete.setAdapter(new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, templates));
    }

    private void addLastResponses() {
        String[] previosResult = {"пл. Мужества", "Политехническая"};
        mListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, previosResult));
    }

    public void goToRouteViewOnClickButton(View view) {
        Intent intent = new Intent(this, RouteViewActivity.class);
        AutoCompleteTextView editText = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        String arrivalStation = editText.getText().toString();
        intent.putExtra(ARRIVAL_STATION,arrivalStation);
        startActivity(intent);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this,RouteViewActivity.class);
        TextView textView = (TextView) view;
        String arrivalStation = textView.getText().toString();
        intent.putExtra(ARRIVAL_STATION,arrivalStation);
        startActivity(intent);
    }
}
