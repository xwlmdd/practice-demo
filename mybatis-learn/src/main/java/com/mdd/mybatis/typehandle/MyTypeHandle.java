package com.mdd.mybatis.typehandle;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyTypeHandle implements TypeHandler<String> {
    private static String prifix = "mdd";

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, s);
    }

    @Override
    public String getResult(ResultSet resultSet, String s) throws SQLException {
        String result = resultSet.getString(s);
        if (StringUtils.isNotEmpty(result)) {
            return prifix.concat(result);
        }
        return result;
    }

    @Override
    public String getResult(ResultSet resultSet, int i) throws SQLException {
        String result = resultSet.getString(i);
        if (StringUtils.isNotEmpty(result)) {
            return prifix.concat(result);
        }
        return result;
    }

    @Override
    public String getResult(CallableStatement callableStatement, int i) throws SQLException {
        String result = callableStatement.getString(i);
        if (StringUtils.isNotEmpty(result)) {
            return prifix.concat(result);
        }
        return result;
    }
}
