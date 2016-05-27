package com.estsoft.rnadomchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int RESULT_CODE_FOR_PREFERENCES_DIALOG_ACTIVITY = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById( R.id.button_settings ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, PreferencesDialogActivity.class );
                startActivityForResult( intent, RESULT_CODE_FOR_PREFERENCES_DIALOG_ACTIVITY );
            }
        });
    }
}
