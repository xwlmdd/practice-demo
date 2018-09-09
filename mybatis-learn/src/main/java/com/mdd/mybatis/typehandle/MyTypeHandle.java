package com.mdd.mybatis.typehandle;

import com.mdd.mybatis.util.DESUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyTypeHandle implements TypeHandler<String> {
    private static String KEY = "123456";

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {
        try {
            String encrypt = DESUtil.encrypt(s, KEY);
            preparedStatement.setString(i, encrypt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getResult(ResultSet resultSet, String s) throws SQLException {
        String result = resultSet.getString(s);
        if (StringUtils.isNotEmpty(result)) {
            try {
                return DESUtil.decrypt(result, KEY);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    @Override
    public String getResult(ResultSet resultSet, int i) throws SQLException {
        String result = resultSet.getString(i);
        if (StringUtils.isNotEmpty(result)) {
            try {
                return DESUtil.decrypt(result, KEY);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    @Override
    public String getResult(CallableStatement callableStatement, int i) throws SQLException {
        String result = callableStatement.getString(i);
        if (StringUtils.isNotEmpty(result)) {
            try {
                return DESUtil.decrypt(result, KEY);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
