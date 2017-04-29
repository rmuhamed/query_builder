package com.dbhelper.query.common;

/**
 * Created by quares on 06/04/2017.
 */

public class CaseQuery implements SQLStatement {

    private String queryCase;

    @Override
    public String getStatementAsString() {
        return this.queryCase;
    }

    public String getQueryCase() {
        return queryCase;
    }

    public void setQueryCase(String queryCase) {
        this.queryCase = queryCase;
    }
}
