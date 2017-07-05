package com.robert.typehandler;

import com.robert.enmu.Sex;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by robert on 2017/7/5.
 */
public class SexTypeHandler implements TypeHandler<Sex> {
    public void setParameter(PreparedStatement ps, int i, Sex parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter.getId());
    }

    public Sex getResult(ResultSet rs, String columnName) throws SQLException {
        int id = rs.getInt(columnName);
        return Sex.getSex(id);
    }

    public Sex getResult(ResultSet rs, int columnIndex) throws SQLException {
        return Sex.getSex(rs.getInt(columnIndex));
    }

    public Sex getResult(CallableStatement cs, int columnIndex) throws SQLException {
        int id = cs.getInt(columnIndex);
        return Sex.getSex(id);
    }
}
