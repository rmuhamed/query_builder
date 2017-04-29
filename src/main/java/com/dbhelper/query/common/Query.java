package com.dbhelper.query.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quares on 28/03/2017.
 */

public class Query implements SQLStatement {

    private List<String> selectFields;
    private String table;
    private List<String> joins;
    private List<String> whereClauses;
    private List<String> groupByFields;
    private List<String> havingClauses;
    private List<String> orderByFields;

    public void addSelectField(String selectField) {
        if(this.selectFields == null) {
            this.selectFields = new ArrayList<>();
        }
        this.selectFields.add(selectField);
    }

    public void addJoin(String join) {
        if(this.joins == null) {
            this.joins = new ArrayList<>();
        }
        this.joins.add(join);
    }

    public void addWhereClause(String whereClause) {
        if(this.whereClauses == null) {
            this.whereClauses = new ArrayList<>();
        }
        this.whereClauses.add(whereClause);
    }

    public void addGroupByField(String groupByField) {
        if(this.groupByFields == null) {
            this.groupByFields = new ArrayList<>();
        }
        this.groupByFields.add(groupByField);
    }

    public void addHavingClause(String havingClause) {
        if(this.havingClauses == null) {
            this.havingClauses = new ArrayList<>();
        }
        this.havingClauses.add(havingClause);
    }

    public void addOrderByField(String orderByField) {
        if(this.orderByFields == null) {
            this.orderByFields = new ArrayList<>();
        }
        this.orderByFields.add(orderByField);
    }

    public List<String> getSelectFields() {
        return selectFields;
    }

    public void setSelectFields(List<String> selectFields) {
        this.selectFields = selectFields;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public List<String> getJoins() {
        return joins;
    }

    public void setJoins(List<String> joins) {
        this.joins = joins;
    }

    public List<String> getWhereClauses() {
        return whereClauses;
    }

    public void setWhereClauses(List<String> whereClauses) {
        this.whereClauses = whereClauses;
    }

    public List<String> getGroupByFields() {
        return groupByFields;
    }

    public void setGroupByFields(List<String> groupByFields) {
        this.groupByFields = groupByFields;
    }

    public List<String> getHavingClauses() {
        return havingClauses;
    }

    public void setHavingClauses(List<String> havingClauses) {
        this.havingClauses = havingClauses;
    }

    public List<String> getOrderByFields() {
        return orderByFields;
    }

    public void setOrderByFields(List<String> orderByFields) {
        this.orderByFields = orderByFields;
    }

    @Override
    public String getStatementAsString() {
        String query = "SELECT ";

        if(this.selectFields != null && this.selectFields.size() != 0) {
            for(String field : this.selectFields) {
                query = query.concat(field).concat(",");
            }
            query = String.format("%s ", query.substring(0, query.length()-1));
        }

        query = String.format("%s FROM %s ", query, this.table);

        if(this.joins != null && this.joins.size() != 0) {
            for(String join : this.joins) {
                query = query.concat(join).concat(" ");
            }
        }

        if(this.whereClauses != null && this.whereClauses.size() != 0) {
            query = query.concat("WHERE ");
            for(String whereClause : this.whereClauses) {
                query = query.concat(whereClause).concat(" ");
            }
        }

        if(this.groupByFields != null && this.groupByFields.size() != 0) {
            query = query.concat("GROUP BY ");
            for(String groupBy : this.groupByFields) {
                query = query.concat(groupBy).concat(",");
            }
            query = String.format("%s ", query.substring(0, query.length()-1));
        }

        if(this.havingClauses != null && this.havingClauses.size() != 0) {
            query = query.concat("HAVING ");
            for(String having : this.havingClauses) {
                query = query.concat(having).concat(" ");
            }
        }

        if(this.orderByFields != null && this.orderByFields.size() != 0) {
            query = query.concat("ORDER BY ");
            for(String orderBy : this.orderByFields) {
                query = query.concat(orderBy).concat(",");
            }
            query = String.format("%s ", query.substring(0, query.length()-1));
        }

        return query;
    }
}
