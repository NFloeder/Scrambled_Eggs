package com.example.asc1.scrambledeggs;
import java.*;
import android.provider.UserDictionary;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.*;
import java.util.ArrayList;
import android.content.Context;
import android.widget.Toast;

public class LevelEasy extends ActionBarActivity {
    String[] words = {"cat", "rat", "bus", "mom", "dog", "car", "man", "see" , "eat", "pot", "pan", "pie", "tin", "phone"};
    int rand;
    EditText mEdit;
    TextView word;
    TextView t ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        ArrayList<String> words = new ArrayList<String>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_easy);


         rand = (int)(Math.random() * words.length);
        TextView word = (TextView) findViewById(R.id.textView50);
        Button checkWord = (Button) findViewById(R.id.button);
        checkWord.setOnClickListener(buttonListener);
        mEdit = (EditText) findViewById(R.id.editText);
        TextView t = (TextView) findViewById(R.id.textView6);
        String s= words[rand];
        String scram="";
        while(!s.equals("")){
            int a= (int)(Math.random() * s.length());
            scram+=s.charAt(a);
            s=s.substring(0,a)+s.substring(a+1);
        }

        word.setText(scram);

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

    /**
     * A placeholder fragment containing a simple view.
     */

}
