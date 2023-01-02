package com.polyPro.dao;

import com.polyPro.model.HocVien;
import com.polyPro.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HocVienDAO extends EduSysDAO<HocVien, Integer>{
    @Override
    public void insert(HocVien model) {
        String sql = "INSERT INTO HocVien(MaKH, MaNH, Diem) VALUES(?, ?, ?)";
        XJdbc.executeUpdate(sql,
                model.getMaKH(),
                model.getMaNH(),
                model.getDiem());
    }

    @Override
    public void update(HocVien model) {
        String sql = "UPDATE HocVien SET MaKH=?, MaNH=?, Diem=? WHERE MaHV=?";
        XJdbc.executeUpdate(sql,
                model.getMaKH(),
                model.getMaNH(),
                model.getDiem(),
                model.getMaHV());
    }

    @Override
    public void delete(Integer MaHV) {
        String sql = "DELETE FROM HocVien WHERE MaHV=?";
        XJdbc.executeUpdate(sql, MaHV);
    }

    @Override
    public List<HocVien> select() {
        String sql = "SELECT * FROM HocVien";
        return select(sql);
    }

    @Override
    public HocVien selectById(Integer mahv) {
        String sql = "SELECT * FROM HocVien WHERE MaHV=?";
        List<HocVien> list = select(sql, mahv);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<HocVien> select(String sql, Object... args) {
        List<HocVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.executeQuery(sql, args);
                while (rs.next()) {
                    HocVien model = readFromResultSet(rs);
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

    private HocVien readFromResultSet(ResultSet rs) throws SQLException {
        HocVien model = new HocVien();
        model.setMaHV(rs.getInt("MaHV"));
        model.setMaKH(rs.getInt("MaKH"));
        model.setMaNH(rs.getString("MaNH"));
        model.setDiem(rs.getDouble("Diem"));
        return model;
    }
}
