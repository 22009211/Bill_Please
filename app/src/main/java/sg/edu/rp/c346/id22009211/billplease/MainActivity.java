package sg.edu.rp.c346.id22009211.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText amInput;
    EditText paxNumInput;
    Button noSVS;
    Button GST;
    RadioButton Cash;
    RadioButton PayNow;
    Button Split;
    Button Reset;

    TextView Total;

    TextView Each;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amInput = findViewById(R.id.editTextNumber4);
        paxNumInput = findViewById(R.id.editTextNumber);
        noSVS = findViewById(R.id.button2);
        GST = findViewById(R.id.button);
        Cash = findViewById(R.id.radioButton);
        PayNow = findViewById(R.id.radioButton2);
        Split = findViewById(R.id.button4);
        Reset = findViewById(R.id.button3);
        Total = findViewById(R.id.textView3);
        Each = findViewById(R.id.textView4);

        noSVS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (noSVS.isChecked()) {
                }
            }
        });
        Split.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}