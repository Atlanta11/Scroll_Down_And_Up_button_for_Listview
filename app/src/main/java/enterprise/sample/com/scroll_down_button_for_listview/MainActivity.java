package enterprise.sample.com.scroll_down_button_for_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Button scrollDown;
    ListView CustomList;
    String[] CustomListElements = new String[] {
            "ONE",
            "TWO",
            "THREE",
            "FOUR",
            "FIVE",
            "SIX",
            "SEVEN",
            "EIGHT",
            "NINE",
            "TEN",
            "ELEVEN",
            "TWELVE",
            "THIRTEEN",
            "FOURTEEN",
            "FIFTEEN"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollDown = (Button)findViewById(R.id.button1);
        CustomList = (ListView)findViewById(R.id.listView1);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (MainActivity.this, android.R.layout.simple_list_item_1, CustomListElements);

        CustomList.setAdapter(adapter);

        scrollDown.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                CustomList.smoothScrollToPosition(adapter.getCount());

            }
        });
    }
}