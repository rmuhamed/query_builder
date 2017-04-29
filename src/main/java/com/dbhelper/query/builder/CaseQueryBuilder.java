package com.dbhelper.query.builder;

import com.dbhelper.query.common.Condition;
import com.dbhelper.query.common.Query;
import com.dbhelper.query.common.CaseQuery;
import com.dbhelper.query.exception.QueryBuilderException;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by quares on 06/04/2017.
 */

public class CaseQueryBuilder extends AbstractBuilder<CaseQuery> {

    private boolean caseClauseCalled = true;
    private boolean defaultClauseCalled = false;

    private Map<String, String> clauses = new LinkedHashMap<>();
    private String defaultCase;

    /**
     * Crea una cl&aacute;usula "CASE (condition.sqlValue) THEN consecuence"
     *
     * @param condition   Condicion que debe cumplirse para el CASE.
     * @param consecuence Valor a mostrar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return CaseQueryBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos o no se puede llamar a &eacute;ste m&eacute;todo.
     */
    public CaseQueryBuilder caseClause(Condition condition, String consecuence) {
        this.checkCallCaseClause();
        this.checkParams(condition, consecuence);
        this.caseClauseCalled = true;

        String conditionString = String.format("WHEN (%s)", condition.getStatementAsString());
        String consecuenceString = String.format("THEN %s", consecuence);
        clauses.put(conditionString, consecuenceString);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "CASE (condition.sqlValue) THEN (consecuence.sqlValue)"
     *
     * @param condition   Condicion que debe cumplirse para el CASE.
     * @param consecuence Valor a mostrar, resultado de Query.
     * @return CaseQueryBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos o no se puede llamar a &eacute;ste m&eacute;todo.
     */
    public CaseQueryBuilder caseClause(Condition condition, Query consecuence) {
        this.checkCallCaseClause();
        this.checkParams(condition);
        this.checkParams(consecuence);
        this.caseClauseCalled = true;

        String conditionString = String.format("WHEN (%s)", condition.getStatementAsString());
        String consecuenceString = String.format("THEN \'%s\'", consecuence.getStatementAsString());
        clauses.put(conditionString, consecuenceString);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "CASE (condition.sqlValue) THEN consecuence"
     *
     * @param condition   Condicion que debe cumplirse para el CASE.
     * @param consecuence Valor a mostrar.
     * @return CaseQueryBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos o no se puede llamar a &eacute;ste m&eacute;todo.
     */
    public CaseQueryBuilder caseClause(Condition condition, int consecuence) {
        this.checkCallCaseClause();
        this.checkParams(condition);
        this.caseClauseCalled = true;

        String conditionString = String.format("WHEN (%s)", condition.getStatementAsString());
        String consecuenceString = String.format("THEN %s", String.valueOf(consecuence));
        clauses.put(conditionString, consecuenceString);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "CASE (condition.sqlValue) THEN consecuence"
     *
     * @param condition   Condicion que debe cumplirse para el CASE.
     * @param consecuence Valor a mostrar.
     * @return CaseQueryBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos o no se puede llamar a &eacute;ste m&eacute;todo.
     */
    public CaseQueryBuilder caseClause(Condition condition, long consecuence) {
        this.checkCallCaseClause();
        this.checkParams(condition);
        this.caseClauseCalled = true;

        String conditionString = String.format("WHEN (%s)", condition.getStatementAsString());
        String consecuenceString = String.format("THEN %s", String.valueOf(consecuence));
        clauses.put(conditionString, consecuenceString);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "CASE (condition.sqlValue) THEN consecuence"
     *
     * @param condition   Condicion que debe cumplirse para el CASE.
     * @param consecuence Valor a mostrar.
     * @return CaseQueryBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos o no se puede llamar a &eacute;ste m&eacute;todo.
     */
    public CaseQueryBuilder caseClause(Condition condition, double consecuence) {
        this.checkCallCaseClause();
        this.checkParams(condition);
        this.caseClauseCalled = true;

        String conditionString = String.format("WHEN (%s)", condition.getStatementAsString());
        String consecuenceString = String.format("THEN %s", String.valueOf(consecuence));
        clauses.put(conditionString, consecuenceString);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "ELSE consecuence"
     *
     * @param consecuence Valor a mostrar, default
     * @return CaseQueryBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos o no se puede llamar a &eacute;ste m&eacute;todo.
     */
    public CaseQueryBuilder defaultClause(String consecuence) {
        this.checkCallDefaultClause();
        this.checkParams(consecuence);
        this.defaultClauseCalled = true;

        this.defaultCase = String.format("ELSE %s", consecuence);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "ELSE (consecuence.sqlValue)"
     *
     * @param consecuence Valor a mostrar, default, resultado de SubQuery
     * @return CaseQueryBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos o no se puede llamar a &eacute;ste m&eacute;todo.
     */
    public CaseQueryBuilder defaultClause(Query consecuence) {
        this.checkCallDefaultClause();
        this.checkParams(consecuence);
        this.defaultClauseCalled = true;

        this.defaultCase = String.format("ELSE (%s)", consecuence.getStatementAsString());

        return this;
    }

    /**
     * @return CaseQuery
     */
    @Override
    public CaseQuery build() {
        if (this.clauses.size() == 0) {
            throw new QueryBuilderException("CASE Query is EMPTY");
        }

        String caseQuery = "CASE ";
        for (String condition : this.clauses.keySet()) {
            String consecuence = this.clauses.get(condition);
            caseQuery = String.format("%s %s %s,", caseQuery, condition, consecuence);
        }

        caseQuery = String.format("%s", caseQuery.substring(0, caseQuery.length() - 1));

        if (this.defaultCase != null) {
            caseQuery = String.format("%s %s", caseQuery, this.defaultCase);
        }

        caseQuery = String.format("%s END", caseQuery);

        CaseQuery queryCase = new CaseQuery();
        queryCase.setQueryCase(caseQuery);
        return queryCase;
    }

    private void checkCallCaseClause() {
        if (this.defaultClauseCalled) {
            throw new QueryBuilderException("Cannot call CASE clause here");
        }
    }

    private void checkCallDefaultClause() {
        if (!this.caseClauseCalled) {
            throw new QueryBuilderException("Cannot call default CASE clause here");
        }
    }
}
