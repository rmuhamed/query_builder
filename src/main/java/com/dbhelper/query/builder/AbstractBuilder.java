package com.dbhelper.query.builder;

import com.dbhelper.query.common.SQLStatement;
import com.dbhelper.query.exception.QueryBuilderException;

/**
 * Created by quares on 06/04/2017.
 */

abstract class AbstractBuilder<T extends SQLStatement> implements IBuilder<T> {

    void checkParams(Object... params) {
        if (params == null || params.length == 0) {
            throw new QueryBuilderException("Params cannot be NULL or empty");
        }
        for (Object param : params) {
            if (param == null) {
                throw new QueryBuilderException("Params cannot be NULL");
            } else if (param instanceof String) {
                if (((String) param).length() == 0) {
                    throw new QueryBuilderException("Param cannot be empty");
                }
            } else if (param instanceof SQLStatement) {
                if (((SQLStatement) param).getStatementAsString().length() == 0) {
                    throw new QueryBuilderException("SQL Statement cannot be empty");
                }
            }
        }
    }

}
