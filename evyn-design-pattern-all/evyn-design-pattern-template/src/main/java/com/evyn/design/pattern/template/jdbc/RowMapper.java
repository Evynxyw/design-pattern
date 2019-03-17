package com.evyn.design.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * @ClassName RowMapper
 * @Description:
 * @Author xyw
 * @Date 2019/3/16 20:28
 * @Version 1.0
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
