package com.example.fatima.electronicdoctor;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.fatima.electronicdoctor.controller.AnswersFeedFragment;
import com.example.fatima.electronicdoctor.controller.AskQuestionFragment;
import com.example.fatima.electronicdoctor.controller.PostsFeedFragment;

public class MainActivity extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;

            switch (item.getItemId()) {
                case R.id.navigation_home:

                    fragment = new PostsFeedFragment();
                    break;

                case R.id.navigation_answered_questions:

                    fragment = new AnswersFeedFragment();
                    break;
//                    Intent myIntent = new Intent(MainActivity.this, MainActivity.class);
//                    MainActivity.this.startActivity(myIntent);
                case R.id.navigation_ask_question:
                    fragment = new AskQuestionFragment();
                    break;

//                case R.id.navigation_post:
////                    Intent myIntent = new Intent(MainActivity.this, LoginActivity.class);
////                    MainActivity.this.startActivity(myIntent);
//                    break;

            }
            return loadFragment(fragment);
        }
    };

//    PostsFeedFragment mMyFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        if (savedInstanceState != null) {
//            //Restore the fragment's instance
//            mMyFragment = (PostsFeedFragment) getSupportFragmentManager().getFragment(savedInstanceState, "PostsFeedFragment");
//
//        }
//        else {
            loadFragment(new PostsFeedFragment());
//        }

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
       navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//
//        //Save the fragment's instance
//        getSupportFragmentManager().putFragment(outState, "PostsFeedFragment", mMyFragment);
//    }
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