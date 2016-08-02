package com.lmntrx.basilarackal.munchits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText userIDEditText, userPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userIDEditText = (EditText) findViewById(R.id.userIDET);
        userPasswordEditText = (EditText) findViewById(R.id.passwordET);

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
