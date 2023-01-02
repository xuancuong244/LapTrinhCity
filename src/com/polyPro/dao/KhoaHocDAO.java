package com.polyPro.dao;

import com.polyPro.model.KhoaHoc;
import com.polyPro.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KhoaHocDAO extends EduSysDAO<KhoaHoc, Integer>{
    
    @Override
    public void insert(KhoaHoc model) {
        String sql
                = "INSERT INTO KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
                model.getMaCD(),
                model.getHocPhi(),
                model.getThoiLuong(),
                model.getNgayKG(),
                model.getGhiChu(),
                model.getMaNV());
    }

    @Override
    public void update(KhoaHoc model) {
        String sql
                = "UPDATE KhoaHoc SET MaCD=?, HocPhi=?, ThoiLuong=?, NgayKG=?, GhiChu=?, MaNV=? WHERE MaKH =  ?";
        XJdbc.executeUpdate(sql,
                model.getMaCD(),
                model.getHocPhi(),
                model.getThoiLuong(),
                model.getNgayKG(),
                model.getGhiChu(),
                model.getMaNV(),
                model.getMaKH());
    }

    @Override
    public void delete(Integer MaKH) {
        String sql = "DELETE FROM KhoaHoc WHERE MaKH=?";
        XJdbc.executeUpdate(sql, MaKH);
    }

    @Override
    public List<KhoaHoc> select() {
        String sql = "SELECT * FROM KhoaHoc";
        return select(sql);
    }

    public List<KhoaHoc> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM KhoaHoc WHERE MAKh LIKE ?";
        return select(sql, "%" + keyword + "%");
    }
    
    @Override
    public KhoaHoc selectById(Integer makh) {
        String sql = "SELECT * FROM KhoaHoc WHERE MaKH=?";
        List<KhoaHoc> list = select(sql, makh);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<KhoaHoc> select(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.executeQuery(sql, args);
                while (rs.next()) {
                    KhoaHoc model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private KhoaHoc readFromResultSet(ResultSet rs) throws SQLException {
        KhoaHoc model = new KhoaHoc();
        model.setMaKH(rs.getInt("MaKH"));
        model.setHocPhi(rs.getDouble("HocPhi"));
        model.setThoiLuong(rs.getInt("ThoiLuong"));
        model.setNgayKG(rs.getDate("NgayKG"));
        model.setGhiChu(rs.getString("GhiChu"));
        model.setMaNV(rs.getString("MaNV"));
        model.setNgayTao(rs.getDate("NgayTao"));
        model.setMaCD(rs.getString("MaCD"));

        return model;
    }

    
}
