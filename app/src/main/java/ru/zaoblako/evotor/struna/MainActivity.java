package ru.zaoblako.evotor.struna;

import android.content.Intent;
import android.os.Bundle;

import ru.evotor.framework.core.IntegrationAppCompatActivity;

public class MainActivity extends IntegrationAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnOpenStruna).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, WebActivity.class)));
    }
}
