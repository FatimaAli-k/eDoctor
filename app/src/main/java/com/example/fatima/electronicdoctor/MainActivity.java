package com.example.fatima.electronicdoctor;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;

            switch (item.getItemId()) {
                case R.id.navigation_home:

                    fragment = new RecyclerFragment();
                    break;

                case R.id.navigation_answered_questions:

                    fragment = new AnswersFeedFragment();
                    break;
//                    Intent myIntent = new Intent(MainActivity.this, MainActivity.class);
//                    MainActivity.this.startActivity(myIntent);
                case R.id.navigation_ask_question:
                    fragment = new WritePostFragment();
                    break;

//                    return true;
            }
            return loadFragment(fragment);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new ProfileFragment());

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
       navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
