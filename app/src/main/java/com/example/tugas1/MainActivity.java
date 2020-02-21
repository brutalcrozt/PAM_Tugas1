package com.example.tugas1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

  private Button reg;
  private EditText uname, fname, psswd, c_psswd;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    reg= findViewById(R.id.button);
    uname= findViewById(R.id.uname);
    fname= findViewById(R.id.fname);
    psswd= findViewById(R.id.psswd);
    c_psswd= findViewById(R.id.c_psswd);
  }

  public void reg(View v) {
    if (checkAllInput(v)) {
      if (matchPassword(v)) {
        Intent i = new Intent(this, Login.class);
        i.putExtra("username", uname.getText().toString());
        i.putExtra("password", psswd.getText().toString());
        startActivity(i);
      }
    }
  }

  public boolean checkAllInput(View v) {
    if (uname.getText().toString().isEmpty()) {
      Snackbar.make(v, "Username can't be empty", Snackbar.LENGTH_LONG).show();
      return false;
    }
    if (fname.getText().toString().isEmpty()) {
      Snackbar.make(v, "Full name can't be empty", Snackbar.LENGTH_LONG).show();
      return false;
    }
    if (psswd.getText().toString().isEmpty()) {
      Snackbar.make(v, "Password can't be empty", Snackbar.LENGTH_LONG).show();
      return false;
    }
    if (c_psswd.getText().toString().isEmpty()) {
      Snackbar.make(v, "Confirm password can't be empty", Snackbar.LENGTH_LONG).show();
      return false;
    }
    return true;
  }

  public boolean matchPassword(View v) {
//    FrameLayout.LayoutParams params=  (FrameLayout.LayoutParams) v.getLayoutParams();
//    params.gravity= Gravity.TOP;
    if (psswd.getText().toString().equals(c_psswd.getText().toString())) {
      return true;
    }
    Snackbar.make(v, "password and confirm password did not match", 0).show();
    return false;
  }
}
