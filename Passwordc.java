package com.developer.harry.passwordcreator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class Passwordc extends AppCompatActivity implements OnClickListener{
    EditText input;
    EditText user;
    Button create;
    TextView show;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwordc);
        register();
    }
    void register(){
        input=(EditText)findViewById(R.id.EdStr);
        create=(Button)findViewById(R.id.BtCreate);
        show=(TextView)findViewById(R.id.show);
        save=(Button)findViewById(R.id.save);
        user=(EditText)findViewById(R.id.user);
        create.setOnClickListener(this);
        save.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        int get=view.getId();
        switch (get){
            case R.id.BtCreate:
                String sinput=input.getText().toString();
                input.setText("");
                show.setText(sinput);
                break;
            case R.id.save:
                Password p=new Password();
                p.setPass(show.getText().toString());
                p.setUser(user.getText().toString());
                p.write();
                break;
        }
    }
}
