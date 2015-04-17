package com.example.asc1.scrambledeggs;

import android.app.Fragment;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.EditText;
import android.view.Menu;
import android.view.MenuItem;
import android.view.LayoutInflater;


public class MainActivity extends ActionBarActivity {
    TextView helloWorld, introText;
    Button levelEasy, levelMedium, levelHard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        levelEasy = (Button) findViewById(R.id.levelEasy);
        levelMedium = (Button) findViewById(R.id.levelMedium);
        levelHard = (Button) findViewById(R.id.levelHard);

    }
    public void easy(View view){
        Intent intent = new Intent(view.getContext(), LevelEasy.class);
        startActivity(intent);
    }
    public void medium(View view){
        Intent intent = new Intent(view.getContext(), LevelEasy.class);
        startActivity(intent);
    }
    public void hard(View view){
        Intent intent = new Intent(view.getContext(), LevelEasy.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
    public static class PlaceholderFragment extends Fragment{
        public PlaceholderFragment(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
            View rootView = inflater.inflate(R.layout.activity_main, container, false);
            return rootView;
        }
        public void easy(View view){
            Intent intent = new Intent(view.getContext(), LevelEasy.class);
            startActivity(intent);
        }
        public void medium(View view){
            Intent intent = new Intent(view.getContext(), LevelEasy.class);
            startActivity(intent);
        }
        public void hard(View view){
            Intent intent = new Intent(view.getContext(), LevelEasy.class);
            startActivity(intent);
        }
    }

}
