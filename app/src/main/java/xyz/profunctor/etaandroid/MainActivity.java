package xyz.profunctor.etaandroid;

import android.app.Activity;
import android.os.Bundle;
import xyz.profunctor.android.ActivityImpl;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityImpl.startActivity(this);
    }
}
