package com.example.fatima.electronicdoctor.controller;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
 str[0]="Ss";
 str[1]="frf";
 str[2]="vfvdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfx vfdxvfdxvxdxvfx vfdxvfdxvx";
 str[3]="dxvfx vfdxvfdxvxdxvfx vfdxvfdxvx";
 str[4]="dxvfxnhnyn";

        String[] str2=new String[5];
        str2[0]="22Ss";
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
        private TextView docName,speciality,postTitle,postDescription;
        private Button usefulBan,unclearBtn;
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

            usefulBan =itemView.findViewById(R.id.usefulBtn);
            unclearBtn=itemView.findViewById(R.id.unclearBtn);
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

            //rate buttons action
            recyclerViewHolder.usefulBan.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    recyclerViewHolder.usefulBan.setBackgroundColor(Color.RED);
                    Toast.makeText(getActivity(), "Item " + i + " is clicked.", Toast.LENGTH_SHORT).show();
                }
            });


            recyclerViewHolder.unclearBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    recyclerViewHolder.unclearBtn.setBackgroundColor(Color.RED);
                    Toast.makeText(getActivity(), "Item " + i + " is clicked.", Toast.LENGTH_SHORT).show();
                }
            });
            //

        }

        @Override
        public int getItemCount() {
            return s.length;
        }
    }


}
