package example.itsme.prefererrenceactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }



    public void Load(View view) {
        TextView tv_user= (TextView) findViewById(R.id.show_user);
        TextView tv_pass= (TextView) findViewById(R.id.show_pass);
        SharedPreferences data=getSharedPreferences("mydata",MODE_PRIVATE);
        String username=data.getString("username","Not Found");
        String password=data.getString("password","Not Found");
        tv_user.setText(username);
        tv_pass.setText(password);

    }


    public void previousActivity(View view) {
        Toast.makeText(SecondActivity.this," Going First Activity",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(SecondActivity.this,MainActivity.class);
        startActivity(intent);


    }
}
