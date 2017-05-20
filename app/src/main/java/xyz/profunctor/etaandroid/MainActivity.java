package xyz.profunctor.etaandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import xyz.profunctor.android.ActivityImpl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityImpl.startActivity(this);
    }
}
