package com.polyPro.dao;

import com.polyPro.model.ChuyenDe;
import com.polyPro.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, String>{

    @Override
    public void insert(ChuyenDe model) {
        String sql = "INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa) VALUES (?, ?, ?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
                model.getMaCD(),
                model.getTenCD(),
                model.getHocPhi(),
                model.getThoiLuong(),
                model.getHinh(),
                model.getMoTa());
    }

    @Override
    public void update(ChuyenDe model) {
        String sql = "UPDATE ChuyenDe SET TenCD=?, HocPhi=?, ThoiLuong=?, Hinh=?, MoTa=? WHERE MaCD=?";
        XJdbc.executeUpdate(sql,
                model.getTenCD(),
                model.getHocPhi(),
                model.getThoiLuong(),
                model.getHinh(),
                model.getMoTa(),
                model.getMaCD());
    }

    @Override
    public void delete(String MaCD) {
        String sql = "DELETE FROM ChuyenDe WHERE MaCD=?";
        XJdbc.executeUpdate(sql, MaCD);
    }

    @Override
    public List<ChuyenDe> select() {
        String sql = "SELECT * FROM ChuyenDe";
        return select(sql);
    }

    @Override
    public ChuyenDe selectById(String macd) {
        String sql = "SELECT * FROM ChuyenDe WHERE MaCD=?";
        List<ChuyenDe> list = select(sql, macd);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<ChuyenDe> select(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.executeQuery(sql, args);
                while (rs.next()) {
                    ChuyenDe model = readFromResultSet(rs);
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

    private ChuyenDe readFromResultSet(ResultSet rs) throws SQLException {
        ChuyenDe model = new ChuyenDe();
        model.setMaCD(rs.getString("MaCD"));
        model.setHinh(rs.getString("Hinh"));
        model.setHocPhi(rs.getDouble("HocPhi"));
        model.setMoTa(rs.getString("MoTa"));
        model.setTenCD(rs.getString("TenCD"));
        model.setThoiLuong(rs.getInt("ThoiLuong"));
        return model;
    }
}
