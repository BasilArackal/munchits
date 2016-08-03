package com.lmntrx.basilarackal.munchits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Login extends AppCompatActivity {

    EditText userPasswordEditText;
    AutoCompleteTextView userIDEditText;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userIDEditText = (AutoCompleteTextView) findViewById(R.id.userIDET);
        userPasswordEditText = (EditText) findViewById(R.id.passwordET);


        //Spinner Code--
        spinner=(Spinner)findViewById(R.id.comboBoxSpinner);
        ArrayList<String>comboBoxArrayList=new ArrayList<>();
        comboBoxArrayList.add("ComboBox 1");
        comboBoxArrayList.add("ComboBox 2");
        comboBoxArrayList.add("ComboBox 3");
        comboBoxArrayList.add("ComboBox 4");
        comboBoxArrayList.add("ComboBox 5");

        //Login hint
        comboBoxArrayList.add("ComboBox");


        HintAdapter adapter=new HintAdapter(this,comboBoxArrayList,android.R.layout.simple_list_item_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setSelection(adapter.getCount());
        //--Spinner Code

        //AutoCompleteTextView Code--
        ArrayList<String>countryNames=new ArrayList<>();
        countryNames.add("India");
        countryNames.add("Indonesia");
        countryNames.add("Iran");
        countryNames.add("Iceland");
        countryNames.add("Iraq");
        ArrayAdapter countryAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,countryNames);
        userIDEditText.setAdapter(countryAdapter);
        userIDEditText.setThreshold(1);
        //--AutoCompleteTextView Code
    }

    public void login(View view) {

        String userID = userIDEditText.getText().toString();
        String password = userPasswordEditText.getText().toString();
        if (userID.isEmpty()){
            userIDEditText.setError("This field cannot be empty!");
        }else if (password.isEmpty()){
            userPasswordEditText.setError("This field cannot be empty!");
        }else {
            User.checkValidity(userID,password);
        }

    }
}
