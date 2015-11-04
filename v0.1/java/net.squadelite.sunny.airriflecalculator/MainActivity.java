package net.squadelite.sunny.airriflecalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText velmzev;
    EditText velgra;
    TextView resut;
    //Button btnCalcVel;

    double mzevel, gravel, velmzegra;
    String velmzegras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        velmzev = (EditText)findViewById(R.id.velmze);
        velgra = (EditText)findViewById(R.id.velgra);
        resut = (TextView) findViewById(R.id.results);
        Button btnCalcVel = (Button)findViewById(R.id.btnmzetovel);
        btnCalcVel.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        gravel = Double.parseDouble(velgra.getText().toString());
                        mzevel = Double.parseDouble(velmzev.getText().toString());
                        velmzegra = mzevel*450240/gravel;
                        velmzegra = Math.sqrt(velmzegra);
                        velmzegras = String.format("%.3f", velmzegra);
                        resut.setText(velmzegras);
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
