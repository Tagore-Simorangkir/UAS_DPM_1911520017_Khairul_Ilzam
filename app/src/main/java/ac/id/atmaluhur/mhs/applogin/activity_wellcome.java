package ac.id.atmaluhur.mhs.applogin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class activity_wellcome extends AppCompatActivity {
    Button btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wellcome_activity);

        btnExit = (Button) findViewById(R.id.btnExit);

        btnExit.setOnClickListener((view -> {
            finish();
        }));
    }
}
