package buttons.tvapp.com.tvbuton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button mTelugu,mSports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTelugu = (Button) findViewById(R.id.telugu);
        mTelugu.setOnClickListener(MainActivity.this);

        mSports = (Button) findViewById(R.id.sports);
        mSports.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.telugu:
            Intent intent = new Intent(this, TeluguTv.class);
            startActivity(intent);
                break;
            case R.id.sports:
                Intent inten = new Intent(this, SportsTv.class);
                startActivity(inten);
                break;


        }
    }
}
