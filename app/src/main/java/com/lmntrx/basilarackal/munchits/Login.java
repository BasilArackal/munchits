package com.lmntrx.basilarackal.munchits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Login extends AppCompatActivity {

    EditText userIDEditText, userPasswordEditText;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userIDEditText = (EditText) findViewById(R.id.userIDET);
        userPasswordEditText = (EditText) findViewById(R.id.passwordET);

        spinner=(Spinner)findViewById(R.id.comboBoxSpinner);
        ArrayList<String>comboBoxArrayList=new ArrayList<>();
        comboBoxArrayList.add("ComboBox 1");
        comboBoxArrayList.add("ComboBox 2");
        comboBoxArrayList.add("ComboBox 3");
        comboBoxArrayList.add("ComboBox 4");
        comboBoxArrayList.add("ComboBox 5");
        comboBoxArrayList.add("ComboBox");


        HintAdapter adapter=new HintAdapter(this,comboBoxArrayList,android.R.layout.simple_list_item_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setSelection(adapter.getCount());
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
