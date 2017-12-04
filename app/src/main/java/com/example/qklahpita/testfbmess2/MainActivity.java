package com.example.qklahpita.testfbmess2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    TextView tvShow;
    EditText etId;
    EditText etName;
    Button btAddOrUpdate;
    Button btShow;
    Button btDel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseMessaging.getInstance().subscribeToTopic("android10");

        tvShow = findViewById(R.id.tv_show);
        etId = findViewById(R.id.et_id);
        etName = findViewById(R.id.et_name);
        btAddOrUpdate = findViewById(R.id.bt_add_or_update);
        btShow = findViewById(R.id.bt_read);
        btDel = findViewById(R.id.bt_del);

        btAddOrUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHandler.addUser(new UserModel(
                        etId.getText().toString(),
                        etName.getText().toString()
                ));
            }
        });

        btShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvShow.setText(DatabaseHandler.getListUser().toString());
            }
        });

        btDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHandler.deleteUser(etId.getText().toString());
            }
        });
    }
}
