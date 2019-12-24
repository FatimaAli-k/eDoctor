package com.example.fatima.electronicdoctor.controller;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fatima.electronicdoctor.MainActivity;
import com.example.fatima.electronicdoctor.PopUpClass;
import com.example.fatima.electronicdoctor.R;
import com.example.fatima.electronicdoctor.model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostsFeedFragment extends Fragment {
    public static Fragment newInstance() {
        return new PostsFeedFragment();
    }
    private ListAdapter mListadapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler_view_fragment, container,false);
//        if (savedInstanceState != null) {
//            //Restore the fragment's state here
//        }


        //test values

        List<String> list=new ArrayList<>();
        list.add("FINGERS AND HOW THEY COULD KILL YOU AND EVERYONE YOU KNOW ");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
 String[] str=new String[5];
 str[0]="FINGERS AND HOW THEY COULD KILL YOU AND EVERYONE YOU KNOW ";
 str[1]="frf";
 str[2]="vfvdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfx vfdxvfdxvx";
 str[3]="dxvfx vfdxvfdxvxdxvfx vfdxvfdxvx";
 str[4]="dxvfxnhnyn";

        String[] str2=new String[5];
        str2[0]="yo sick people boy do i have some tips for you. FINGERTIPS to be exact hahahahahahah yip. as we all know nails are an important part in the health of out fingertips But im here to show the dangers of nails. for one what if you accidentally pinch someone with it and they sue you hmmm? never thought of that i see well if you wanna know how to avoid this horrible terrible fate buy my book. TIPS ABOUT THE FINGERTIPS AT YOUR TIPS.";
        str2[1]="22frf";
        str2[2]="evevvfvdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfxvfvdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfxvfvdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfxvfvdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfx vfdxvfdxvx";
        str2[3]="dxvfx vfdxvfdxvxdxvfx vfdxvfdxvx";
        str2[4]="dxvfxnhnyn";

        //

//        List<List<String>> listOfLists = new ArrayList<List<String>>();
//        listOfLists.add(new ArrayList<String>());


        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new RecyclerViewAdapter(str,str2));


        return view;

    }

//    @Override
//    public void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//
//
//        //Save the fragment's state here
//    }

    private class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private CardView mCardView;
        private TextView docName,speciality,postTitle,postDescription,rateUpCount,rateDownCount,expand;
        //private Button usefulBan,unclearBtn;
        private ImageView imageView;
        BottomNavigationView rateMenu;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public RecyclerViewHolder(LayoutInflater inflater, ViewGroup container){
            super(inflater.inflate(R.layout.doctor_post_view,container,false));

            mCardView=itemView.findViewById(R.id.doctor_post_view);
            docName=itemView.findViewById(R.id.docNameTextView);
            speciality=itemView.findViewById(R.id.specialityTextView);
            postTitle=itemView.findViewById(R.id.postTitleTextView);
            postDescription=itemView.findViewById(R.id.postDescriptionTextView);

            postDescription.setVisibility(View.GONE);
            expand=itemView.findViewById(R.id.expand);
//xml code int main_activity,  replaced by rate_button
//            usefulBan =itemView.findViewById(R.id.usefulBtn);
//            unclearBtn=itemView.findViewById(R.id.unclearBtn);
//

            rateMenu = itemView.findViewById(R.id.rate);
            rateUpCount = itemView.findViewById(R.id.up_count);
            rateDownCount=itemView.findViewById(R.id.down_count);


            imageView=itemView.findViewById(R.id.postImageView);


        }


    }

    private class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{

        private String[] mList,s;
        public RecyclerViewAdapter(String[] list, String[] s){
            this.mList=list;
            this.s=s;

        }




        @NonNull
        @Override
        public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            return new RecyclerViewHolder(inflater, viewGroup);

        }

        @Override
        public void onBindViewHolder(@NonNull final RecyclerViewHolder recyclerViewHolder, final int i) {

            recyclerViewHolder.postTitle.setText(mList[i]);
            recyclerViewHolder.postDescription.setText(s[i]);
            //expand on click
            recyclerViewHolder.expand.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                        recyclerViewHolder.postDescription.setVisibility( recyclerViewHolder.postDescription.isShown()
                                ? View.GONE
                                : View.VISIBLE );

                        if(recyclerViewHolder.postDescription.isShown())
                            recyclerViewHolder.expand.setText("\nclick to hide");

                        else
                            recyclerViewHolder.expand.setText("\nclick to expand");

                }
            });
            //rate buttons click
            recyclerViewHolder.rateMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()) {
                case R.id.rate_up:

                    Toast.makeText(getActivity(), "Item " + i + " is clicked.", Toast.LENGTH_SHORT).show();
                    recyclerViewHolder.rateUpCount.setText("999M");
                    return true;

                case R.id.rate_down:
                    Toast.makeText(getActivity(), "Item " + i + " is clicked.", Toast.LENGTH_SHORT).show();
                    recyclerViewHolder.rateDownCount.setText("1");
                    return true;
//
//
//
            }
                    return false;
                }
            });

            //test
            //image set on 1st item
            if(i==0)
            recyclerViewHolder.imageView.setImageResource(R.drawable.pic2);

            //image expand
            recyclerViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    PopUpClass popUpClass = new PopUpClass();
                    popUpClass.showPopupWindow(view,recyclerViewHolder.imageView.getDrawable());


                }
            });




//            //rate buttons action OLD BUTTONS
//            recyclerViewHolder.usefulBan.setOnClickListener(new View.OnClickListener()
//            {
//                @Override
//                public void onClick(View v)
//                {
//                    recyclerViewHolder.usefulBan.setBackgroundColor(Color.RED);
//                    Toast.makeText(getActivity(), "Item " + i + " is clicked.", Toast.LENGTH_SHORT).show();
//                }
//            });
//
//
//            recyclerViewHolder.unclearBtn.setOnClickListener(new View.OnClickListener()
//            {
//                @Override
//                public void onClick(View v)
//                {
//                    recyclerViewHolder.unclearBtn.setBackgroundColor(Color.RED);
//                    Toast.makeText(getActivity(), "Item " + i + " is clicked.", Toast.LENGTH_SHORT).show();
//                }
//            });
            //




        }


        @Override
        public int getItemCount() {
            return s.length;
        }


    }
//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//
//            switch (item.getItemId()) {
//                case R.id.rate_up:
//                    Toast.makeText(getActivity(), "Item " + i + " is clicked.", Toast.LENGTH_SHORT).show();
//                    return true;
//
//                case R.id.rate_down:
//                    Toast.makeText(getActivity(), "Item " + i + " is clicked.", Toast.LENGTH_SHORT).show();
//                    return true;
////
//
//
//            }
//            return false;
//        }
//
////                    BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
////                    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
//
//    };




}
