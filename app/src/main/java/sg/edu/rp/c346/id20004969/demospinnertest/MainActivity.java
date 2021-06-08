package sg.edu.rp.c346.id20004969.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner SYN;
    TextView TvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SYN = findViewById(R.id.spinner);
        TvDisplay = findViewById(R.id.textView);

        SYN.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        TvDisplay.setText("Spinner Item, Yes Selected");
                        break;
                    case 1:
                        TvDisplay.setText("Spinner Item, No Selected");
                        break;
                }
            }


            public void onNothingSelected(AdapterView<?> parent){
            }
        });
    }
}