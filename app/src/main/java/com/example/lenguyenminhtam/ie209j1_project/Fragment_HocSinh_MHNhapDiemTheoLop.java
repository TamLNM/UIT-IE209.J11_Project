package com.example.lenguyenminhtam.ie209j1_project;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Fragment_HocSinh_MHNhapDiemTheoLop extends Fragment {  private View mRootView;
//
    public MyHS_MHNhapDiemTheoLop_Adapter  mAdapter;
    public List<FaceHS_MHNhapDiemTheoLop> mListFace;
    public RecyclerView mRrvFace;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_hocsinh_mhnhapdiemtheolop, container, false);

        // Create recycler view
        mRrvFace = (RecyclerView) mRootView.findViewById(R.id.rv_DanhSachHS_MHNhapDiemTheoLop);
        mRrvFace.setHasFixedSize(true);
        mRrvFace.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Add data to recyclerView
        mListFace = new ArrayList<>();
        //for (int i = 1; i <= 3; i++){
        mListFace.add(new FaceHS_MHNhapDiemTheoLop(1,15520480, "Lê Duyên Minh"));
        mListFace.add(new FaceHS_MHNhapDiemTheoLop(2,15520756, "Lê Nguyễn Minh Tâm"));
        mListFace.add(new FaceHS_MHNhapDiemTheoLop(3,15520817, "Hoàng Thị Thảp"));

        // Create adapter
        mAdapter = new MyHS_MHNhapDiemTheoLop_Adapter(mListFace, getContext());
        mRrvFace.setAdapter(mAdapter);
        mRrvFace.setItemAnimator(new DefaultItemAnimator());

        return mRootView;//super.onCreateView(inflater, container, savedInstanceState); //
    }
}
