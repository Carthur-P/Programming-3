package bit.pongp1.mathquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    TextView tvScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        //getting intent and what is pass from main activity
        Intent source = getIntent();
        int score = source.getIntExtra("score", -99);

        //references
        tvScore = (TextView) findViewById(R.id.tvScore);
        tvScore.setText(score + " out of 5");
    }
}
