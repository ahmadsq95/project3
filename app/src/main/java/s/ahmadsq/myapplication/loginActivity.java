package s.ahmadsq.myapplication;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        RequestQueue queue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST, "10.0.2.2", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) throws JSONException {
                Toast.makeText(getBaseContext(),response,Toast.LENGTH_SHORT).show();


                JSONObject jsonObject = new JSONObject(response);
                String XXXX = jsonObject.getString("login.php");


            }
        });
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
