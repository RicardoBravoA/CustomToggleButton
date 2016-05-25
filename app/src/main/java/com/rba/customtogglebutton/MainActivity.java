package com.rba.customtogglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.rba.customtogglebutton.util.customtogglebutton.CustomToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private RadioGroup rgTab;
    private Button btnShow;
    private ControlClass controlClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgTab = (RadioGroup) findViewById(R.id.rgTab);
        btnShow = (Button) findViewById(R.id.btnShow);

        controlClass = new ControlClass(this, rgTab);

        btnShow.setOnClickListener(this);
        generate();

        controlClass.setControlClass("2");

    }


    private void generate(){

        addButton(rgTab, R.id.tgb1, R.drawable.ic_home, false);
        addButton(rgTab, R.id.tgb2, R.drawable.ic_home, false);
        addButton(rgTab, R.id.tgb3, R.drawable.ic_home, true);
    }


    private void addButton(RadioGroup group, int id, int image, boolean isLast) {

        CustomToggleButton customToggleButton;

        if(isLast){
            customToggleButton =
                    (CustomToggleButton) getLayoutInflater().inflate(R.layout.toggle_last_item, null);
        }else{
            customToggleButton =
                    (CustomToggleButton) getLayoutInflater().inflate(R.layout.toggle_item, null);
        }

        customToggleButton.setText("Botón " + (group.getChildCount() + 1));
        customToggleButton.setCompoundDrawablesWithIntrinsicBounds(0, image, 0, 0);
        customToggleButton.setId(id);
        group.addView(customToggleButton);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnShow:
                Toast.makeText(getApplication(), controlClass.getControlClass(), Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
