package com.example.test1123.dao;

import org.apache.ibatis.annotations.Param;

public interface Userdao {
    int delete(@Param("a") int a);
}
