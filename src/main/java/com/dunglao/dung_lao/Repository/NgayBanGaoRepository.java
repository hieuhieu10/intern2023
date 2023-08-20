package com.dunglao.dung_lao.Repository;

import com.dunglao.dung_lao.DTO.TienLaiNgay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class NgayBanGaoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<TienLaiNgay> tinhTienLaiTungTuan() {
        String sql = "SELECT NgayBan AS ngayBan,SoLuongGaoXinBanDuoc AS soGaoBan " +
                "FROM NgayBanGao "
//                "GROUP BY NgayBan " +
//                + "ORDER BY NgayBan DESC"
                ;
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(TienLaiNgay.class));
    }

    public List<TienLaiNgay> tinhTienLaiTungNgay() {
        String sql = "SELECT NgayBan AS ngayBan,SoLuongGaoXinBanDuoc AS soGaoBan " +
                "FROM NgayBanGao "+
                "GROUP BY NgayBan " +
                "ORDER BY NgayBan DESC";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(TienLaiNgay.class));
    }
}
