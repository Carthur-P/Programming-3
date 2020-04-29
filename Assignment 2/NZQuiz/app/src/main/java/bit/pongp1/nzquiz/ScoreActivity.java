package bit.pongp1.nzquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Carthur Pongpatimet (1000026069) on 13/06/2018.
 */
public class ScoreActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnPlayAgain;

    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        Intent source = getIntent();
        int score = source.getIntExtra("score", -99);

        //referencing components
        btnPlayAgain = (Button) findViewById(R.id.btnPlayAgain);
        btnPlayAgain.setOnClickListener(this);
        TextView tvScore = (TextView) findViewById(R.id.tvScore);
        tvScore.setText(score + " out of 10!");
    }

    /**
     * @param v
     * Button click events
     */
    @Override
    public void onClick(View v) {
        if(v.getId() == btnPlayAgain.getId())
        {
            Intent goToQuestion = new Intent(ScoreActivity.this, QuestionActivity.class);
            startActivity(goToQuestion);
        }
    }
}
