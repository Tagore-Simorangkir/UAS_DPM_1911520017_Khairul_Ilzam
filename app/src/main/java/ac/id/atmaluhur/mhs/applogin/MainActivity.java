package ac.id.atmaluhur.mhs.applogin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener((view -> {
            String usernameKey = username.getText().toString();
            String passwordKey = password.getText().toString();

            if (usernameKey.equals("admin") && passwordKey.equals("123")){
                Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, activity_wellcome.class);
                MainActivity.this.startActivity(intent);
                finish();
            }else{
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Username atau Password yang Anda Ketik Salah!").setNegativeButton("Retry", null).create().show();
            }
            }));


    }
}