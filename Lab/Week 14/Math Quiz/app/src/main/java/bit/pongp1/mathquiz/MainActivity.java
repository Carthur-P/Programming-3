package bit.pongp1.mathquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int index = 0;
    int score = 0;
    TextView tvQuestion;
    TextView tvQuestionNumber;
    EditText ptAnswer;
    Button btnNext;
    Question q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the references
        tvQuestion = (TextView) findViewById(R.id.tvQuestion);
        tvQuestionNumber = (TextView) findViewById(R.id.tvQuestionNumber);
        ptAnswer = (EditText) findViewById(R.id.ptAnswer);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);

        //displaying the question
        q = new Question();
        q.createQuestion();
        tvQuestion.setText(q.getQuestions()[index]);
    }

    public void CheckResult()
    {
        if(Integer.parseInt(ptAnswer.getText().toString()) == q.getAnswer()[index])
        {
            score++;
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }

        else
        {
            Toast.makeText(this,"Wrong", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnNext)
        {
                if(index <= 4)
                {
                    CheckResult();
                    index++;
                    tvQuestion.setText(q.getQuestions()[index]);
                    tvQuestionNumber.setText("Question " + Integer.toString(index + 1));
                    ptAnswer.setText(null);

                    if(index == 4)
                    {
                        btnNext.setText("Check score");
                    }
                }

                if(index > 4)
                {
                    Intent change = new Intent(MainActivity.this, FinalActivity.class);
                    change.putExtra("score", score);
                    startActivity(change);
                    index = 0;
                }
        }
    }
}
