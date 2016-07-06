package com.hyb.java7.feature;

import java.io.IOException;
import java.sql.SQLException;

/**
 * 同时捕获多个异常处理
 * http://www.365mini.com/page/12.htm
 */
public class 同时捕获多个异常处理 {
    static class FirstException extends Exception {
    }

    static class SecondException extends Exception {
    }

    /**
     * java 7以前
     *
     * @param exceptionName
     * @throws Exception
     */
    public void rethrowException0(String exceptionName) throws Exception {
        try {
            if (exceptionName.equals("First")) {
                throw new FirstException();
            } else {
                throw new SecondException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * java 7
     * 尽管catch子句的异常参数e是java.lang.Exception类型，
     * 但是编译器可以判断出它是FirstException或SecondException类型的一个实例
     *
     * @param exceptionName
     * @throws FirstException
     * @throws SecondException
     */
    public void rethrowException1(String exceptionName)
            throws FirstException, SecondException {
        try {
            if (true) {
                throw new FirstException();
            } else {
                throw new SecondException();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * java 7 捕捉多个异常
     *
     * @param exceptionName
     * @throws FirstException
     * @throws SecondException
     */
    public void rethrowException2(String exceptionName)
            throws FirstException, SecondException {
        try {
            switch ("") {
                case "IOException":
                    throw new IOException();
                case "SQLException":
                    throw new SQLException();
            }
        } catch (IOException | SQLException ex) {
        }
    }
}
