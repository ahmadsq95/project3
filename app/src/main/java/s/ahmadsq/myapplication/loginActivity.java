package s.ahmadsq.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton =(Button) findViewById(R.id.loginButton);
        final EditText usernameTextFeild = (EditText) findViewById(R.id.usernameEditText);
        EditText passwordTextFeild = (EditText) findViewById(R.id.passwordEditText);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent log = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(log);
            }
        });


    }
}
