package bit.pongp1.nzquiz;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Carthur Pongpatimet (1000026069) on 12/06/2018.
 */
public class QuestionActivity extends AppCompatActivity implements View.OnClickListener {

    Random rand;
    QuestionSetup qs;
    int index = 0;
    int score = 0;
    boolean attempted = false;
    Button btnCheck;
    Button btnNext;
    Button btnMoreInfo;
    Button btnCheckScore;
    RadioGroup radioGroupAnswer;
    RadioButton chosen;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    ImageView image;

    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        rand = new Random();
        qs = new QuestionSetup();

        //referencing components
        btnCheck = (Button) findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(this);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);
        btnMoreInfo = (Button) findViewById(R.id.btnMoreInfo);
        btnMoreInfo.setOnClickListener(this);
        btnCheckScore = (Button) findViewById(R.id.btnCheckSocre);
        btnCheckScore.setOnClickListener(this);
        btnCheckScore.setVisibility(View.INVISIBLE);
        image = (ImageView) findViewById(R.id.imageQuestion);

        loadQuestion();
    }

    /**
     * Setting up all the components for the questions and displaying the correct question onto the screen
     */
    public void loadQuestion()
    {
        TextView tvQuestion = (TextView) findViewById(R.id.tvQuestion);
        tvQuestion.setText(qs.getQuestions().get(index));
        btnMoreInfo.setEnabled(false);
        btnNext.setEnabled(false);

        rb1 = (RadioButton)findViewById(R.id.radioButton1);
        rb2 = (RadioButton)findViewById(R.id.radioButton2);
        rb3 = (RadioButton)findViewById(R.id.radioButton3);
        rb4 = (RadioButton)findViewById(R.id.radioButton4);

        int answerLocation = rand.nextInt(4);

        switch (answerLocation) {
            case 0:
            {
                rb1.setText(qs.getAnswers().get(index));
                Collections.shuffle(qs.getOptions());
                rb2.setText(qs.getOptions().get(0));
                rb3.setText(qs.getOptions().get(1));
                rb4.setText(qs.getOptions().get(2));
                break;
            }

            case 1:
            {
                rb2.setText(qs.getAnswers().get(index));
                Collections.shuffle(qs.getOptions());
                rb1.setText(qs.getOptions().get(0));
                rb3.setText(qs.getOptions().get(1));
                rb4.setText(qs.getOptions().get(2));
                break;
            }

            case 2:
            {
                rb3.setText(qs.getAnswers().get(index));
                Collections.shuffle(qs.getOptions());
                rb2.setText(qs.getOptions().get(0));
                rb1.setText(qs.getOptions().get(1));
                rb4.setText(qs.getOptions().get(2));
                break;
            }

            case 3:
            {
                rb4.setText(qs.getAnswers().get(index));
                Collections.shuffle(qs.getOptions());
                rb2.setText(qs.getOptions().get(0));
                rb3.setText(qs.getOptions().get(1));
                rb1.setText(qs.getOptions().get(2));
                break;
            }

            default:
            {
                break;
            }
        }
    }

    /**
     * Checking to see if the radio button selected is the correct answer to the question
     */
    public void checkAnswer()
    {
        radioGroupAnswer = (RadioGroup) findViewById(R.id.radioGroupAnswer);

        try
        {
            chosen = (RadioButton)findViewById(radioGroupAnswer.getCheckedRadioButtonId());

            if(chosen.getText().equals(qs.getAnswers().get(index)))
            {
                chosen.setBackgroundResource(R.color.colorGreen);
                btnCheck.setEnabled(false);
                btnMoreInfo.setEnabled(true);

                if(index < 9)
                {
                    btnNext.setEnabled(true);
                }

                if(index == 9)
                {
                    btnCheckScore.setVisibility(View.VISIBLE);
                }

                if(attempted == false)
                {
                    score ++;
                }
            }

            else
            {
                chosen.setBackgroundResource(R.color.colorAccent);
                attempted = true;
            }
        }

        catch(NullPointerException e)
        {
            Toast.makeText(this, "Please select something", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * @param v
     * Button click events
     */
    @Override
    public void onClick(View v) {
        if(v.getId() == btnCheck.getId())
        {
            checkAnswer();
        }

        if(v.getId() == btnNext.getId())
        {
            radioGroupAnswer.clearCheck();
            rb1.setBackgroundResource(R.drawable.custom_button);
            rb2.setBackgroundResource(R.drawable.custom_button);
            rb3.setBackgroundResource(R.drawable.custom_button);
            rb4.setBackgroundResource(R.drawable.custom_button);
            index++;
            loadQuestion();
            btnCheck.setEnabled(true);
            btnNext.setEnabled(false);
            image.setImageResource(qs.getImageID()[index]);
            attempted = false;
        }

        if(v.getId() == btnMoreInfo.getId())
        {
            AlertDialog.Builder infoPopUp = new AlertDialog.Builder(QuestionActivity.this);
            infoPopUp.setCancelable(true);
            infoPopUp.setTitle(qs.getTitle().get(index));
            infoPopUp.setMessage(qs.getInfo().get(index));
            infoPopUp.show();
        }

       if(v.getId() == btnCheckScore.getId())
       {
           Intent goToScore = new Intent(QuestionActivity.this, ScoreActivity.class);
           goToScore.putExtra("score", score);
           startActivity(goToScore);
           index = 0;
           score = 0;
           attempted = false;
       }
    }
}
