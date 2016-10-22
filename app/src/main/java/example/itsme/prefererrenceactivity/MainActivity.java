package example.itsme.prefererrenceactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
//    EditText et_user= (EditText) findViewById(R.id.editText);
//    EditText et_pass= (EditText) findViewById(R.id.editText2);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Save(View view) {
        EditText et_user= (EditText) findViewById(R.id.editText);
        EditText et_pass= (EditText) findViewById(R.id.editText2);
//        et_user.getText();
//        String username=et_user.toString();
        SharedPreferences data=getSharedPreferences("mydata",MODE_PRIVATE);
        SharedPreferences.Editor editor=data.edit();
        editor.putString("username",et_user.getText().toString());
        editor.putString("password",et_pass.getText().toString());
        editor.commit();

        Toast.makeText(MainActivity.this,"data is Stored Successfully",Toast.LENGTH_LONG).show();
    }



    public void Next(View view) {


        Toast.makeText(MainActivity.this,"Second Activity",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);


    }
}
