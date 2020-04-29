package bit.pongp1.nzquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Carthur Pongpatimet (1000026069) on 12/06/2018.
 */
public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAction;
    Button btnIntruction;

    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //referencing components
        btnAction = (Button) findViewById(R.id.btnStart);
        btnAction.setOnClickListener(this);
        btnIntruction = (Button) findViewById(R.id.btnIntruction);
        btnIntruction.setOnClickListener(this);
    }

    /**
     * @param v
     * Button click events
     */
    @Override
    public void onClick(View v) {
        if(v.getId() == btnAction.getId())
        {
            Intent goToQuestion = new Intent(WelcomeActivity.this, QuestionActivity.class);
            startActivity(goToQuestion);
        }

        if(v.getId() == btnIntruction.getId())
        {
            Intent goToInstruction = new Intent(WelcomeActivity.this, InstructionActivity.class);
            startActivity(goToInstruction);
        }
    }
}
