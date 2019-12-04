package com.yagya.easylaundry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private View findViewById;
    public EditText emailid, password;
    private Button loginBtn;
    //    private TextView signUp;
//    private CheckBox show_hide_password;
//    private LinearLayout loginLayout;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailid = (EditText) findViewById(R.id.emailid);
        password = (EditText) findViewById(R.id.password);
        loginBtn = (Button) findViewById(R.id.loginBtn);
//        signUp = (TextView) view.findViewById(R.id.createAccount);
//        show_hide_password = (CheckBox) view
//                .findViewById(R.id.show_hide_password);
//        loginLayout = (LinearLayout) view.findViewById(R.id.login_layout);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Emailid = emailid.getText().toString();
                String Password = password.getText().toString();

                if (Emailid.isEmpty()) {
                    emailid.setError("Enter Username!");
                } else if (Password.isEmpty()) {
                    password.setError("Enter Password!");
                } else {
                    validate(emailid.getText().toString(), password.getText().toString());
                }
                validate(emailid.getText().toString(), password.getText().toString());
            }
        });
    }

    private void validate(String emailid, String password) {
        if ((emailid.equals("admin")) && (password.equals("admin123"))) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }
//        else {
//            emailid.setError("Please Enter Email and Password");
//        }
    }
}