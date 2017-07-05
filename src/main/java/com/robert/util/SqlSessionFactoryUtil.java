package com.robert.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


/**
 * Created by robert on 2017/7/5.
 */
public class SqlSessionFactoryUtil {

    private static SqlSessionFactory sqlSessionFactory;

    public synchronized static SqlSession openSqlSession() {
        if (sqlSessionFactory == null) {
            InputStream stream = null;
            try {
                stream = Resources.getResourceAsStream("mybatis.cfg.xml");
            } catch (IOException e) {
                e.printStackTrace();
            }
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
        }
        return sqlSessionFactory.openSession();
    }
}
