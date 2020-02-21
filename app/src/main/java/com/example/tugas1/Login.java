package com.example.tugas1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

import com.google.android.material.snackbar.Snackbar;

public class Login extends AppCompatActivity {

  private String username, password;
  private EditText typedUsername, typedPassword;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    Intent i = getIntent();
    username= i.getStringExtra("username");
    password= i.getStringExtra("password");
    typedUsername=  findViewById(R.id.uname);
    typedPassword= findViewById(R.id.psswd);
//    String typedPassword= , typedUsername= ;
  }

  public void Login(View v) {
//    FrameLayout.LayoutParams params=  (FrameLayout.LayoutParams) v.getLayoutParams();
//    params.gravity= Gravity.TOP;
//    Snackbar.make(v, username + ":"+ password, 0).show();
    if (username.equals(typedUsername.getText().toString())) {
      if (password.equals(typedPassword.getText().toString())) {
//        good
        Intent i = new Intent(this, Welcome.class);
        i.putExtra("loggedUsername", username);
        startActivity(i);
      } else {
        Snackbar.make(v, "wrong password", 0).show();
      }
    } else {
      Snackbar.make(v, "system can't find that username", 0).show();
    }
  }

}
