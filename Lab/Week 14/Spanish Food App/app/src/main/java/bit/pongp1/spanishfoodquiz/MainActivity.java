package bit.pongp1.spanishfoodquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvBeef;
    TextView tvChicken;
    TextView tvLamb;
    TextView tvGuineaPig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencing the text views
        tvBeef = (TextView)findViewById(R.id.textView1);
        tvLamb = (TextView)findViewById(R.id.textView2);
        tvChicken = (TextView)findViewById(R.id.textView3);
        tvGuineaPig = (TextView)findViewById(R.id.textView4);
        tvBeef.setOnClickListener(this);
        tvChicken.setOnClickListener(this);
        tvLamb.setOnClickListener(this);
        tvGuineaPig.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.textView1)
        {
            tvBeef.setGravity(Gravity.CENTER);
            tvBeef.setBackground(null);
            tvBeef.setText("Wrong\nEnglish: Beef\nSpanish: Carne de res");
        }

        if(v.getId() == R.id.textView2)
        {
            tvLamb.setGravity(Gravity.CENTER);
            tvLamb.setBackground(null);
            tvLamb.setText("Wrong\nEnglish: Lamb\nSpanish: Cordero");
        }

        if(v.getId() == R.id.textView3)
        {
            tvChicken.setGravity(Gravity.CENTER);
            tvChicken.setBackground(null);
            tvChicken.setText("Wrong\nEnglish: Chicken\nSpanish: Cerdo");
        }

        if(v.getId() == R.id.textView4)
        {
            tvGuineaPig.setGravity(Gravity.CENTER);
            tvGuineaPig.setBackground(null);
            tvGuineaPig.setText("Correct\nEnglish: Guinea Pig\nSpanish: Cuy");
        }
    }
}
