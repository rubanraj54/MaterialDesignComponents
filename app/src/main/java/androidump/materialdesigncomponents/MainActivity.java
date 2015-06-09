package androidump.materialdesigncomponents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.gc.materialdesign.views.ButtonFlat;
import com.gc.materialdesign.views.ButtonFloat;
import com.gc.materialdesign.views.ButtonFloatSmall;
import com.gc.materialdesign.views.ButtonRectangle;
import com.gc.materialdesign.views.CheckBox;
import com.gc.materialdesign.views.ProgressBarIndeterminateDeterminate;
import com.gc.materialdesign.views.Slider;
import com.gc.materialdesign.views.Switch;
/*
Rubanraj
www.androidumps.com
Created date : 08,June 2015
Last modified : 09,June 2015
 */

public class MainActivity extends AppCompatActivity {

    private ButtonFlat buttonFlat;
    private ButtonRectangle buttonRectangle;
    private ButtonFloat buttonFloat;
    private ButtonFloatSmall buttonFloatSmall;
    private CheckBox checkBox;
    private Switch switchView;
    private Slider slider;
    private Slider silderWithIndicator;

    public ProgressBarIndeterminateDeterminate progressBarIndeterminateDeterminate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //components declaration
        buttonFlat = (ButtonFlat) findViewById(R.id.buttonflat);
        buttonRectangle = (ButtonRectangle) findViewById(R.id.buttonRectangle);
        buttonFloat = (ButtonFloat) findViewById(R.id.buttonFloat);
        buttonFloatSmall = (ButtonFloatSmall) findViewById(R.id.buttonFloatSmall);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        switchView = (Switch) findViewById(R.id.switchView);
        slider = (Slider) findViewById(R.id.slider);
        silderWithIndicator = (Slider) findViewById(R.id.sliderWithNumberIndicator);

        //onClickListeners for buttons

        buttonFlat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Flat Button has been clicked",Toast.LENGTH_SHORT).show();
            }
        });

        buttonRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Rectangle Button has been clicked",Toast.LENGTH_SHORT).show();
            }
        });

        buttonFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Floating Button has been clicked",Toast.LENGTH_SHORT).show();
            }
        });

        buttonFloatSmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Small Floating Button has been clicked",Toast.LENGTH_SHORT).show();
            }
        });

        checkBox.setOncheckListener(new CheckBox.OnCheckListener() {
            @Override
            public void onCheck(CheckBox checkBox, boolean b) {
                if(checkBox.isCheck()){
                    Toast.makeText(getApplicationContext(),"checked",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Unchecked",Toast.LENGTH_SHORT).show();
                }
            }
        });

        switchView.setOncheckListener(new Switch.OnCheckListener() {
            @Override
            public void onCheck(Switch aSwitch, boolean b) {
                if(switchView.isCheck()){
                    Toast.makeText(getApplicationContext(),"On",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Off",Toast.LENGTH_SHORT).show();
                }
            }
        });

    //you can access the value of slider like this.
        //slider.getValue();
        //return type is int

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
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
