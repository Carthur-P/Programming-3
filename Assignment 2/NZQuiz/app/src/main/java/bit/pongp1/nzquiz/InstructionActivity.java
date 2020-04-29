package bit.pongp1.nzquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Carthur Pongpatimet (1000026069) on 12/06/2018.
 */
public class InstructionActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnBack;

    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);

        //referencing components
        TextView tvInstruction = (TextView) findViewById(R.id.tvInstruction);
        tvInstruction.setText("1. Select the answer that you which to submit out of the four options\n\n" +
                "2. Press the check button to check if your answer is correct\n\n" +
                "3. The option that you have selected will change colour to indicate if you have answered the question correctly. Red means wrong and green means correct.\n\n" +
                "4. The 'Next' and 'More Info' buttons will only become available once you have answered the question correctly\n\n" +
                "5. Click the 'Next' button to move on to the next question\n\n" +
                "6. Click the 'More Info' button to show more information about the answer you have answered\n\n" +
                "7. You are only granted a score if you are able to answer the question correctly on your first try");

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
    }

    /**
     * @param v
     * Button click event
     */
    @Override
    public void onClick(View v) {
        if(v.getId() == btnBack.getId())
        {
            Intent goToWelcome = new Intent(InstructionActivity.this, WelcomeActivity.class);
            startActivity(goToWelcome);
        }
    }
}
