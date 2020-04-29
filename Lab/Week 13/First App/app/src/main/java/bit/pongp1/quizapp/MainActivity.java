package bit.pongp1.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencing the components
        Button btnTrue = (Button)findViewById(R.id.button1);
        Button btnFalse = (Button)findViewById(R.id.button2);
        btnTrue.setOnClickListener(this);
        btnFalse.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1)
        {
            Toast.makeText(this,"Correct", Toast.LENGTH_LONG).show();
        }

        if (v.getId() == R.id.button2)
        {
            Toast.makeText(this,"Wrong", Toast.LENGTH_LONG).show();
        }
    }
}
