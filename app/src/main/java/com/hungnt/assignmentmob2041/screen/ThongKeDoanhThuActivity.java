package com.hungnt.assignmentmob2041.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.hungnt.assignmentmob2041.R;
import com.hungnt.assignmentmob2041.controller.HoaDonChiTietDAO;

public class ThongKeDoanhThuActivity extends AppCompatActivity {

    TextView tvNgay, tvThang, tvNam;
    HoaDonChiTietDAO hoaDonChiTietDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("DOANH THU");
        setContentView(R.layout.activity_thong_ke_doanh_thu);
        tvNgay = (TextView) findViewById(R.id.tvThongKeNgay);
        tvThang = (TextView) findViewById(R.id.tvThongKeThang);
        tvNam = (TextView) findViewById(R.id.tvThongKeNam);
        hoaDonChiTietDAO = new HoaDonChiTietDAO(this);
        tvNgay.setText("Hôm nay: " + hoaDonChiTietDAO.getDoanhThuTheoNgay());
        tvThang.setText("Tháng này: " + hoaDonChiTietDAO.getDoanhThuTheoThang());
        tvNam.setText("Năm này: " + hoaDonChiTietDAO.getDoanhThuTheoNam());
    }
}