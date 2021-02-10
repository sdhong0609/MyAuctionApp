package com.hong_studio.myauctionapp.Tab4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.hong_studio.myauctionapp.R;
import com.hong_studio.myauctionapp.Tab1.Tab1RecyclerAdapter;
import com.hong_studio.myauctionapp.Tab1.Tab1RecyclerItem;

import java.util.ArrayList;

public class Tab4Page2Fragment extends Fragment {

    ArrayList<Tab4RecyclerItem> items= new ArrayList<>();
    RecyclerView recyclerView;
    Tab4RecyclerAdapter recyclerAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadData();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.page2_tab4, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView= view.findViewById(R.id.recycler);
        recyclerAdapter= new Tab4RecyclerAdapter(getActivity(), items);
        recyclerView.setAdapter(recyclerAdapter);
    }

    void loadData(){
        //일단은 더미데이터
        items.add(new Tab4RecyclerItem(R.drawable.img05, "커피잔", "등록자 5", "03:12:11"));
        items.add(new Tab4RecyclerItem(R.drawable.img04, "앱 기획서", "등록자 4", "10:29:32"));
    }
}
