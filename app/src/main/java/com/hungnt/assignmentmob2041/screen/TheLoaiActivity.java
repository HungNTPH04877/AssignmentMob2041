package com.hungnt.assignmentmob2041.screen;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.hungnt.assignmentmob2041.R;
import com.hungnt.assignmentmob2041.controller.TheLoaiDAO;
import com.hungnt.assignmentmob2041.customAdapter.TheLoaiAdapter;
import com.hungnt.assignmentmob2041.model.TheLoai;

import java.util.ArrayList;
import java.util.List;

public class TheLoaiActivity extends AppCompatActivity {

//    public static List<TheLoai> dsTheLoai = new ArrayList<>();
//    ListView lvtheloai;
//    TheLoaiAdapter adapter = null;
//    TheLoaiDAO theLoaiDao;
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        dsTheLoai.clear();
//        dsTheLoai = theLoaiDao.getAllTheLoai();
//        adapter.changeDataset(theLoaiDao.getAllTheLoai());
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_the_loai);
//
//        setTitle("Thể Loại");
//
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);
//
//        lvtheloai = findViewById(R.id.lvTheLoai);
//        theLoaiDao = new TheLoaiDAO(TheLoaiActivity.this);
//        dsTheLoai = theLoaiDao.getAllTheLoai();
//
//        adapter = new TheLoaiAdapter(this, dsTheLoai);
//
//        lvtheloai.setAdapter(adapter);
//        lvtheloai.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(TheLoaiActivity.this, ChiTietTheLoaiActivity.class);
//                Bundle b = new Bundle();
//
//                b.putString("MATHELOAI", dsTheLoai.get(position).getMaTheLoai());
//                b.putString("TENTHELOAI", dsTheLoai.get(position).getTenTheLoai());
//                b.putString("MOTA", dsTheLoai.get(position).getMoTa());
//                b.putString("VITRI",
//                        String.valueOf(dsTheLoai.get(position).getViTri()));
//                intent.putExtras(b);
//                startActivity(intent);
//            }
//        });
//
//
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_theloai, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.itemaddtheloai:
//                Intent a = new Intent(TheLoaiActivity.this, ThemTheLoaiActivity.class);
//                startActivity(a);
//                break;
//
//        }
//        return super.onOptionsItemSelected(item);
//    }


}
