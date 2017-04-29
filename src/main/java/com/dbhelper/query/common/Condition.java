package com.dbhelper.query.common;

/**
 * Created by quares on 28/03/2017.
 */

public class Condition implements SQLStatement {

    private String conditionString;

    @Override
    public String getStatementAsString() {
        return conditionString;
    }

    public String getConditionString() {
        return conditionString;
    }

    public void setConditionString(String conditionString) {
        this.conditionString = conditionString;
    }
}
