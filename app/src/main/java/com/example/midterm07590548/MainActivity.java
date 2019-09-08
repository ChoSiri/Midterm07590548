package com.example.midterm07590548;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.midterm07590548.Model.Auth;

public class MainActivity extends AppCompatActivity {

    private static final String EMAIL = "aaa";
    private static final String PASSWORD = "111";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ใช้ตัวแปร loginButton อ้างอิงไปยังปุ่มใน layout
        Button loginButton = findViewById(R.id.login_button);
        //สร้าง listener จากคลาส MyListener
        MyListener listener = new MyListener();
        //ผูกปุ่มกับ listener เข้าด้วยกัน
        loginButton.setOnClickListener(listener);
    }
    private class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Toast t = Toast.makeText(MainActivity.this, "Welcome Promlert Lovichit", Toast.LENGTH_SHORT);
            t.show();
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("user", "aaa");
            startActivity(intent);
        }

    }
    /*AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage(R.string.login_failed);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {

        public void onClick(DialogInterface dialog, int which) {
            //โค้ดที่ให้ทำงานเมื่อ user กดปุ่ม OK
            //tod
        }
    });
                    dialog.show();

*/
       /* Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText emailEditText = findViewById(R.id.email_edit_text);
                EditText passwordEditText = findViewById(R.id.password_edit_text);
                String inputEmail = emailEditText.getText().toString();
                //// แปลง string เป็น ตัวเลข int value = Integer.parseInt(inputEmail);
                String inputPassword = passwordEditText.getText().toString();

                //-//String loginSuccessText = getString(R.string.login_success);
                //-//String loginFailedText = getString(R.string.login_failed);
                // Auth วิธีที่ 1
                Auth auth = new Auth();
                auth.setEmail(inputEmail);
                auth.setPassword(inputPassword);
                // Auth วิธีที่ 2
                Auth auth = new Auth(inputEmail, inputPassword);

                boolean result = auth.check();
                if (result){
                    // login สำเร็จ
                    Toast.makeText(MainActivity.this,
                            R.string.login_success,
                            Toast.LENGTH_SHORT
                    ).show();


                }else{
                    // login ไม่สำเร็จ
                    /*Toast.makeText(LoginActivity.this,
                            R.string.login_success,
                            Toast.LENGTH_SHORT
                    ).show();
                    */
                  /*  AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage(R.string.login_failed);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //โค้ดที่ให้ทำงานเมื่อ user กดปุ่ม OK
                            //tod
                        }
                    });

                    dialog.show();
                }
                //-//if(inputEmail.equals(EMAIL) && inputPassword.equals(PASSWORD)){
                //-//Toast.makeText(LoginActivity.this,
                //-//R.string.login_success,
                //-//Toast.LENGTH_SHORT
                //-//).show();
                //-//}
                //-//else{
                //-//Toast.makeText(LoginActivity.this,
                //-//R.string.login_failed,
                //-//Toast.LENGTH_SHORT
                //-//).show();
                //-//}

            }
        });

                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("user", "aaa");
                startActivity(intent);
*/

}
