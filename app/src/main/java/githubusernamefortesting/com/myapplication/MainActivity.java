package githubusernamefortesting.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.crashlytics.android.Crashlytics;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.distribute.Distribute;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    private static final String APP_CENTER = "bf77df9c-ceef-4a6e-b6af-76139c894d5e";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

        AppCenter.start(getApplication(), APP_CENTER, Distribute.class);
    }
}
