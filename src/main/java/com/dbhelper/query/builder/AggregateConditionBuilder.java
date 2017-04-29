package com.dbhelper.query.builder;

import com.dbhelper.query.common.Query;
import com.dbhelper.query.exception.QueryBuilderException;

/**
 * Created by quares on 10/04/2017.
 */

public class AggregateConditionBuilder extends ConditionBuilder {

    private static final String COUNT = "COUNT";
    private static final String SUM = "SUM";
    private static final String TOTAL = "TOTAL";
    private static final String MIN = "MIN";
    private static final String MAX = "MAX";
    private static final String AVG = "AVG";

    private void addConditionStatement(String function, String params, String operator, String valueToCompare) {
        this.checkParams(function, params, operator, valueToCompare);
        this.condition = String.format("%s %s(%s) %s (%s)", this.condition, function, params, operator, valueToCompare);
        this.orAndCalled = false;
    }

    //-----------------------------------

    /**
     * Crea una cl&aacute;usula "COUNT(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllLess(String valueToCompare) {
        this.addConditionStatement(COUNT, "*", LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllLess(int valueToCompare) {
        this.addConditionStatement(COUNT, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllLess(long valueToCompare) {
        this.addConditionStatement(COUNT, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllLess(double valueToCompare) {
        this.addConditionStatement(COUNT, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &lt; (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllLess(Query valueToCompare) {
        this.addConditionStatement(COUNT, "*", LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllLessOrEqual(String valueToCompare) {
        this.addConditionStatement(COUNT, "*", LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllLessOrEqual(int valueToCompare) {
        this.addConditionStatement(COUNT, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllLessOrEqual(long valueToCompare) {
        this.addConditionStatement(COUNT, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllLessOrEqual(double valueToCompare) {
        this.addConditionStatement(COUNT, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &lt;= (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllLessOrEqual(Query valueToCompare) {
        this.addConditionStatement(COUNT, "*", LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllGreater(String valueToCompare) {
        this.addConditionStatement(COUNT, "*", GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllGreater(int valueToCompare) {
        this.addConditionStatement(COUNT, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllGreater(long valueToCompare) {
        this.addConditionStatement(COUNT, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllGreater(double valueToCompare) {
        this.addConditionStatement(COUNT, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &gt; (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllGreater(Query valueToCompare) {
        this.addConditionStatement(COUNT, "*", GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllGreaterOrEqual(String valueToCompare) {
        this.addConditionStatement(COUNT, "*", GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllGreaterOrEqual(int valueToCompare) {
        this.addConditionStatement(COUNT, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllGreaterOrEqual(long valueToCompare) {
        this.addConditionStatement(COUNT, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllGreaterOrEqual(double valueToCompare) {
        this.addConditionStatement(COUNT, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) &gt;= (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllGreaterOrEqual(Query valueToCompare) {
        this.addConditionStatement(COUNT, "*", GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllEqual(String valueToCompare) {
        this.addConditionStatement(COUNT, "*", EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllEqual(int valueToCompare) {
        this.addConditionStatement(COUNT, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllEqual(long valueToCompare) {
        this.addConditionStatement(COUNT, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllEqual(double valueToCompare) {
        this.addConditionStatement(COUNT, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countAllEqual(Query valueToCompare) {
        this.addConditionStatement(COUNT, "*", EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &lt; valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLess(String countField, String valueToCompare) {
        this.addConditionStatement(COUNT, countField, LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &lt; valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLess(String countField, int valueToCompare) {
        this.addConditionStatement(COUNT, countField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &lt; valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLess(String countField, long valueToCompare) {
        this.addConditionStatement(COUNT, countField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &lt; valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLess(String countField, double valueToCompare) {
        this.addConditionStatement(COUNT, countField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &lt; (valueToCompare.sqlValue)"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLess(String countField, Query valueToCompare) {
        this.addConditionStatement(COUNT, countField, LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &lt; valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLess(Query countField, String valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &lt; valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLess(Query countField, int valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &lt; valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLess(Query countField, long valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &lt; valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLess(Query countField, double valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &lt; (valueToCompare.sqlValue)"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLess(Query countField, Query valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &lt;= valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLessOrEqual(String countField, String valueToCompare) {
        this.addConditionStatement(COUNT, countField, LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &lt;= valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLessOrEqual(String countField, int valueToCompare) {
        this.addConditionStatement(COUNT, countField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &lt;= valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLessOrEqual(String countField, long valueToCompare) {
        this.addConditionStatement(COUNT, countField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &lt;= valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLessOrEqual(String countField, double valueToCompare) {
        this.addConditionStatement(COUNT, countField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &lt;= (valueToCompare.sqlValue)"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLessOrEqual(String countField, Query valueToCompare) {
        this.addConditionStatement(COUNT, countField, LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &lt;= valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLessOrEqual(Query countField, String valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &lt;= valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLessOrEqual(Query countField, int valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &lt;= valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLessOrEqual(Query countField, long valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &lt;= valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLessOrEqual(Query countField, double valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &lt;= (valueToCompare.sqlValue)"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countLessOrEqual(Query countField, Query valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &gt; valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreater(String countField, String valueToCompare) {
        this.addConditionStatement(COUNT, countField, GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &gt; valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreater(String countField, int valueToCompare) {
        this.addConditionStatement(COUNT, countField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &gt; valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreater(String countField, long valueToCompare) {
        this.addConditionStatement(COUNT, countField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &gt; valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreater(String countField, double valueToCompare) {
        this.addConditionStatement(COUNT, countField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &gt; (valueToCompare.sqlValue)"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreater(String countField, Query valueToCompare) {
        this.addConditionStatement(COUNT, countField, GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &gt; valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreater(Query countField, String valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &gt; valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreater(Query countField, int valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &gt; valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreater(Query countField, long valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &gt; valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreater(Query countField, double valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &gt; (valueToCompare.sqlValue)"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreater(Query countField, Query valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &gt;= valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreaterOrEqual(String countField, String valueToCompare) {
        this.addConditionStatement(COUNT, countField, GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &gt;= valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreaterOrEqual(String countField, int valueToCompare) {
        this.addConditionStatement(COUNT, countField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &gt;= valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreaterOrEqual(String countField, long valueToCompare) {
        this.addConditionStatement(COUNT, countField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &gt;= valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreaterOrEqual(String countField, double valueToCompare) {
        this.addConditionStatement(COUNT, countField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) &gt;= (valueToCompare.sqlValue)"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreaterOrEqual(String countField, Query valueToCompare) {
        this.addConditionStatement(COUNT, countField, GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &gt;= valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreaterOrEqual(Query countField, String valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &gt;= valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreaterOrEqual(Query countField, int valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &gt;= valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreaterOrEqual(Query countField, long valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &gt;= valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreaterOrEqual(Query countField, double valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) &gt;= (valueToCompare.sqlValue)"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countGreaterOrEqual(Query countField, Query valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) = valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countEqual(String countField, String valueToCompare) {
        this.addConditionStatement(COUNT, countField, EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) = valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countEqual(String countField, int valueToCompare) {
        this.addConditionStatement(COUNT, countField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) = valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countEqual(String countField, long valueToCompare) {
        this.addConditionStatement(COUNT, countField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) = valueToCompare"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countEqual(String countField, double valueToCompare) {
        this.addConditionStatement(COUNT, countField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField) = (valueToCompare.sqlValue)"
     *
     * @param countField     Atributo a contar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countEqual(String countField, Query valueToCompare) {
        this.addConditionStatement(COUNT, countField, EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) = valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countEqual(Query countField, String valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) = valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countEqual(Query countField, int valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) = valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countEqual(Query countField, long valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) = valueToCompare"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countEqual(Query countField, double valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "COUNT(countField.sqlValue) = (valueToCompare.sqlValue)"
     *
     * @param countField     Atributo a contar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder countEqual(Query countField, Query valueToCompare) {
        this.addConditionStatement(COUNT, countField.getStatementAsString(), EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    //-----------------------------------

    /**
     * Crea una cl&aacute;usula "SUM(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllLess(String valueToCompare) {
        this.addConditionStatement(SUM, "*", LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllLess(int valueToCompare) {
        this.addConditionStatement(SUM, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllLess(long valueToCompare) {
        this.addConditionStatement(SUM, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllLess(double valueToCompare) {
        this.addConditionStatement(SUM, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &lt; (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllLess(Query valueToCompare) {
        this.addConditionStatement(SUM, "*", LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllLessOrEqual(String valueToCompare) {
        this.addConditionStatement(SUM, "*", LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllLessOrEqual(int valueToCompare) {
        this.addConditionStatement(SUM, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllLessOrEqual(long valueToCompare) {
        this.addConditionStatement(SUM, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllLessOrEqual(double valueToCompare) {
        this.addConditionStatement(SUM, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &lt;= (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllLessOrEqual(Query valueToCompare) {
        this.addConditionStatement(SUM, "*", LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllGreater(String valueToCompare) {
        this.addConditionStatement(SUM, "*", GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllGreater(int valueToCompare) {
        this.addConditionStatement(SUM, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllGreater(long valueToCompare) {
        this.addConditionStatement(SUM, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllGreater(double valueToCompare) {
        this.addConditionStatement(SUM, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &gt; (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllGreater(Query valueToCompare) {
        this.addConditionStatement(SUM, "*", GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllGreaterOrEqual(String valueToCompare) {
        this.addConditionStatement(SUM, "*", GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllGreaterOrEqual(int valueToCompare) {
        this.addConditionStatement(SUM, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllGreaterOrEqual(long valueToCompare) {
        this.addConditionStatement(SUM, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllGreaterOrEqual(double valueToCompare) {
        this.addConditionStatement(SUM, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) &gt;= (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllGreaterOrEqual(Query valueToCompare) {
        this.addConditionStatement(SUM, "*", GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllEqual(String valueToCompare) {
        this.addConditionStatement(SUM, "*", EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllEqual(int valueToCompare) {
        this.addConditionStatement(SUM, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllEqual(long valueToCompare) {
        this.addConditionStatement(SUM, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllEqual(double valueToCompare) {
        this.addConditionStatement(SUM, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumAllEqual(Query valueToCompare) {
        this.addConditionStatement(SUM, "*", EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &lt; valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLess(String sumField, String valueToCompare) {
        this.addConditionStatement(SUM, sumField, LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &lt; valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLess(String sumField, int valueToCompare) {
        this.addConditionStatement(SUM, sumField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &lt; valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLess(String sumField, long valueToCompare) {
        this.addConditionStatement(SUM, sumField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &lt; valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLess(String sumField, double valueToCompare) {
        this.addConditionStatement(SUM, sumField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &lt; (valueToCompare.sqlValue)"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLess(String sumField, Query valueToCompare) {
        this.addConditionStatement(SUM, sumField, LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &lt; valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLess(Query sumField, String valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &lt; valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLess(Query sumField, int valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &lt; valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLess(Query sumField, long valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &lt; valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLess(Query sumField, double valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &lt; (valueToCompare.sqlValue)"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLess(Query sumField, Query valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &lt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLessOrEqual(String sumField, String valueToCompare) {
        this.addConditionStatement(SUM, sumField, LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &lt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLessOrEqual(String sumField, int valueToCompare) {
        this.addConditionStatement(SUM, sumField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &lt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLessOrEqual(String sumField, long valueToCompare) {
        this.addConditionStatement(SUM, sumField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &lt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLessOrEqual(String sumField, double valueToCompare) {
        this.addConditionStatement(SUM, sumField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &lt;= (valueToCompare.sqlValue)"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLessOrEqual(String sumField, Query valueToCompare) {
        this.addConditionStatement(SUM, sumField, LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &lt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLessOrEqual(Query sumField, String valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &lt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLessOrEqual(Query sumField, int valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &lt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLessOrEqual(Query sumField, long valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &lt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLessOrEqual(Query sumField, double valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &lt;= (valueToCompare.sqlValue)"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumLessOrEqual(Query sumField, Query valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &gt; valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreater(String sumField, String valueToCompare) {
        this.addConditionStatement(SUM, sumField, GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &gt; valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreater(String sumField, int valueToCompare) {
        this.addConditionStatement(SUM, sumField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &gt; valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreater(String sumField, long valueToCompare) {
        this.addConditionStatement(SUM, sumField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &gt; valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreater(String sumField, double valueToCompare) {
        this.addConditionStatement(SUM, sumField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &gt; (valueToCompare.sqlValue)"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreater(String sumField, Query valueToCompare) {
        this.addConditionStatement(SUM, sumField, GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &gt; valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreater(Query sumField, String valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &gt; valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreater(Query sumField, int valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &gt; valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreater(Query sumField, long valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &gt; valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreater(Query sumField, double valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &gt; (valueToCompare.sqlValue)"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreater(Query sumField, Query valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &gt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreaterOrEqual(String sumField, String valueToCompare) {
        this.addConditionStatement(SUM, sumField, GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &gt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreaterOrEqual(String sumField, int valueToCompare) {
        this.addConditionStatement(SUM, sumField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &gt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreaterOrEqual(String sumField, long valueToCompare) {
        this.addConditionStatement(SUM, sumField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &gt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreaterOrEqual(String sumField, double valueToCompare) {
        this.addConditionStatement(SUM, sumField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) &gt;= (valueToCompare.sqlValue)"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreaterOrEqual(String sumField, Query valueToCompare) {
        this.addConditionStatement(SUM, sumField, GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &gt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreaterOrEqual(Query sumField, String valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &gt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreaterOrEqual(Query sumField, int valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &gt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreaterOrEqual(Query sumField, long valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &gt;= valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreaterOrEqual(Query sumField, double valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) &gt;= (valueToCompare.sqlValue)"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumGreaterOrEqual(Query sumField, Query valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) = valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumEqual(String sumField, String valueToCompare) {
        this.addConditionStatement(SUM, sumField, EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) = valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumEqual(String sumField, int valueToCompare) {
        this.addConditionStatement(SUM, sumField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) = valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumEqual(String sumField, long valueToCompare) {
        this.addConditionStatement(SUM, sumField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) = valueToCompare"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumEqual(String sumField, double valueToCompare) {
        this.addConditionStatement(SUM, sumField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField) = (valueToCompare.sqlValue)"
     *
     * @param sumField       Atributo a sumar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumEqual(String sumField, Query valueToCompare) {
        this.addConditionStatement(SUM, sumField, EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) = valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumEqual(Query sumField, String valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) = valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumEqual(Query sumField, int valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) = valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumEqual(Query sumField, long valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) = valueToCompare"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumEqual(Query sumField, double valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SUM(sumField.sqlValue) = (valueToCompare.sqlValue)"
     *
     * @param sumField       Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder sumEqual(Query sumField, Query valueToCompare) {
        this.addConditionStatement(SUM, sumField.getStatementAsString(), EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    //-----------------------------------

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllLess(String valueToCompare) {
        this.addConditionStatement(TOTAL, "*", LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllLess(int valueToCompare) {
        this.addConditionStatement(TOTAL, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllLess(long valueToCompare) {
        this.addConditionStatement(TOTAL, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllLess(double valueToCompare) {
        this.addConditionStatement(TOTAL, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &lt; (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllLess(Query valueToCompare) {
        this.addConditionStatement(TOTAL, "*", LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllLessOrEqual(String valueToCompare) {
        this.addConditionStatement(TOTAL, "*", LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllLessOrEqual(int valueToCompare) {
        this.addConditionStatement(TOTAL, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllLessOrEqual(long valueToCompare) {
        this.addConditionStatement(TOTAL, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllLessOrEqual(double valueToCompare) {
        this.addConditionStatement(TOTAL, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &lt;= (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllLessOrEqual(Query valueToCompare) {
        this.addConditionStatement(TOTAL, "*", LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllGreater(String valueToCompare) {
        this.addConditionStatement(TOTAL, "*", GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllGreater(int valueToCompare) {
        this.addConditionStatement(TOTAL, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllGreater(long valueToCompare) {
        this.addConditionStatement(TOTAL, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllGreater(double valueToCompare) {
        this.addConditionStatement(TOTAL, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &gt; (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllGreater(Query valueToCompare) {
        this.addConditionStatement(TOTAL, "*", GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllGreaterOrEqual(String valueToCompare) {
        this.addConditionStatement(TOTAL, "*", GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllGreaterOrEqual(int valueToCompare) {
        this.addConditionStatement(TOTAL, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllGreaterOrEqual(long valueToCompare) {
        this.addConditionStatement(TOTAL, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllGreaterOrEqual(double valueToCompare) {
        this.addConditionStatement(TOTAL, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) &gt;= (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllGreaterOrEqual(Query valueToCompare) {
        this.addConditionStatement(TOTAL, "*", GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllEqual(String valueToCompare) {
        this.addConditionStatement(TOTAL, "*", EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllEqual(int valueToCompare) {
        this.addConditionStatement(TOTAL, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllEqual(long valueToCompare) {
        this.addConditionStatement(TOTAL, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllEqual(double valueToCompare) {
        this.addConditionStatement(TOTAL, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalAllEqual(Query valueToCompare) {
        this.addConditionStatement(TOTAL, "*", EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &lt; valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLess(String totalField, String valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &lt; valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLess(String totalField, int valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &lt; valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLess(String totalField, long valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &lt; valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLess(String totalField, double valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &lt; (valueToCompare.sqlValue)"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLess(String totalField, Query valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &lt; valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLess(Query totalField, String valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &lt; valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLess(Query totalField, int valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &lt; valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLess(Query totalField, long valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &lt; valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLess(Query totalField, double valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &lt; (valueToCompare.sqlValue)"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLess(Query totalField, Query valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &lt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLessOrEqual(String totalField, String valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &lt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLessOrEqual(String totalField, int valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &lt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLessOrEqual(String totalField, long valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &lt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLessOrEqual(String totalField, double valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &lt;= (valueToCompare.sqlValue)"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLessOrEqual(String totalField, Query valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &lt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLessOrEqual(Query totalField, String valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &lt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLessOrEqual(Query totalField, int valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &lt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLessOrEqual(Query totalField, long valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &lt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLessOrEqual(Query totalField, double valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &lt;= (valueToCompare.sqlValue)"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalLessOrEqual(Query totalField, Query valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &gt; valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreater(String totalField, String valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &gt; valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreater(String totalField, int valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &gt; valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreater(String totalField, long valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &gt; valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreater(String totalField, double valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &gt; (valueToCompare.sqlValue)"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreater(String totalField, Query valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &gt; valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreater(Query totalField, String valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &gt; valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreater(Query totalField, int valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &gt; valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreater(Query totalField, long valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &gt; valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreater(Query totalField, double valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &gt; (valueToCompare.sqlValue)"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreater(Query totalField, Query valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &gt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreaterOrEqual(String totalField, String valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &gt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreaterOrEqual(String totalField, int valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &gt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreaterOrEqual(String totalField, long valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &gt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreaterOrEqual(String totalField, double valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) &gt;= (valueToCompare.sqlValue)"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreaterOrEqual(String totalField, Query valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &gt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreaterOrEqual(Query totalField, String valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &gt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreaterOrEqual(Query totalField, int valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &gt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreaterOrEqual(Query totalField, long valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &gt;= valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreaterOrEqual(Query totalField, double valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) &gt;= (valueToCompare.sqlValue)"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalGreaterOrEqual(Query totalField, Query valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) = valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalEqual(String totalField, String valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) = valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalEqual(String totalField, int valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) = valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalEqual(String totalField, long valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) = valueToCompare"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalEqual(String totalField, double valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField) = (valueToCompare.sqlValue)"
     *
     * @param totalField     Atributo a sumar.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalEqual(String totalField, Query valueToCompare) {
        this.addConditionStatement(TOTAL, totalField, EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) = valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalEqual(Query totalField, String valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) = valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalEqual(Query totalField, int valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) = valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalEqual(Query totalField, long valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) = valueToCompare"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalEqual(Query totalField, double valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "TOTAL(totalField.sqlValue) = (valueToCompare.sqlValue)"
     *
     * @param totalField     Atributo a sumar, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder totalEqual(Query totalField, Query valueToCompare) {
        this.addConditionStatement(TOTAL, totalField.getStatementAsString(), EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    //-----------------------------------

    /**
     * Crea una cl&aacute;usula "MIN(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllLess(String valueToCompare) {
        this.addConditionStatement(MIN, "*", LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllLess(int valueToCompare) {
        this.addConditionStatement(MIN, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllLess(long valueToCompare) {
        this.addConditionStatement(MIN, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllLess(double valueToCompare) {
        this.addConditionStatement(MIN, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &lt; (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllLess(Query valueToCompare) {
        this.addConditionStatement(MIN, "*", LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllLessOrEqual(String valueToCompare) {
        this.addConditionStatement(MIN, "*", LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllLessOrEqual(int valueToCompare) {
        this.addConditionStatement(MIN, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllLessOrEqual(long valueToCompare) {
        this.addConditionStatement(MIN, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllLessOrEqual(double valueToCompare) {
        this.addConditionStatement(MIN, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &lt;= (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllLessOrEqual(Query valueToCompare) {
        this.addConditionStatement(MIN, "*", LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllGreater(String valueToCompare) {
        this.addConditionStatement(MIN, "*", GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllGreater(int valueToCompare) {
        this.addConditionStatement(MIN, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllGreater(long valueToCompare) {
        this.addConditionStatement(MIN, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllGreater(double valueToCompare) {
        this.addConditionStatement(MIN, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &gt; (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllGreater(Query valueToCompare) {
        this.addConditionStatement(MIN, "*", GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllGreaterOrEqual(String valueToCompare) {
        this.addConditionStatement(MIN, "*", GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllGreaterOrEqual(int valueToCompare) {
        this.addConditionStatement(MIN, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllGreaterOrEqual(long valueToCompare) {
        this.addConditionStatement(MIN, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllGreaterOrEqual(double valueToCompare) {
        this.addConditionStatement(MIN, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) &gt;= (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllGreaterOrEqual(Query valueToCompare) {
        this.addConditionStatement(MIN, "*", GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllEqual(String valueToCompare) {
        this.addConditionStatement(MIN, "*", EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllEqual(int valueToCompare) {
        this.addConditionStatement(MIN, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllEqual(long valueToCompare) {
        this.addConditionStatement(MIN, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllEqual(double valueToCompare) {
        this.addConditionStatement(MIN, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minAllEqual(Query valueToCompare) {
        this.addConditionStatement(MIN, "*", EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &lt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLess(String minField, String valueToCompare) {
        this.addConditionStatement(MIN, minField, LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &lt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLess(String minField, int valueToCompare) {
        this.addConditionStatement(MIN, minField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &lt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLess(String minField, long valueToCompare) {
        this.addConditionStatement(MIN, minField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &lt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLess(String minField, double valueToCompare) {
        this.addConditionStatement(MIN, minField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &lt; (valueToCompare.sqlValue)"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLess(String minField, Query valueToCompare) {
        this.addConditionStatement(MIN, minField, LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &lt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLess(Query minField, String valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &lt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLess(Query minField, int valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &lt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLess(Query minField, long valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &lt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLess(Query minField, double valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &lt; (valueToCompare.sqlValue)"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLess(Query minField, Query valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &lt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLessOrEqual(String minField, String valueToCompare) {
        this.addConditionStatement(MIN, minField, LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &lt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLessOrEqual(String minField, int valueToCompare) {
        this.addConditionStatement(MIN, minField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &lt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLessOrEqual(String minField, long valueToCompare) {
        this.addConditionStatement(MIN, minField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &lt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLessOrEqual(String minField, double valueToCompare) {
        this.addConditionStatement(MIN, minField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &lt;= (valueToCompare.sqlValue)"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLessOrEqual(String minField, Query valueToCompare) {
        this.addConditionStatement(MIN, minField, LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &lt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLessOrEqual(Query minField, String valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &lt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLessOrEqual(Query minField, int valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &lt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLessOrEqual(Query minField, long valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &lt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLessOrEqual(Query minField, double valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &lt;= (valueToCompare.sqlValue)"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minLessOrEqual(Query minField, Query valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &gt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreater(String minField, String valueToCompare) {
        this.addConditionStatement(MIN, minField, GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &gt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreater(String minField, int valueToCompare) {
        this.addConditionStatement(MIN, minField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &gt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreater(String minField, long valueToCompare) {
        this.addConditionStatement(MIN, minField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &gt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreater(String minField, double valueToCompare) {
        this.addConditionStatement(MIN, minField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &gt; (valueToCompare.sqlValue)"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreater(String minField, Query valueToCompare) {
        this.addConditionStatement(MIN, minField, GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &gt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreater(Query minField, String valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &gt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreater(Query minField, int valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &gt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreater(Query minField, long valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &gt; valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreater(Query minField, double valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &gt; (valueToCompare.sqlValue)"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreater(Query minField, Query valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &gt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreaterOrEqual(String minField, String valueToCompare) {
        this.addConditionStatement(MIN, minField, GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &gt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreaterOrEqual(String minField, int valueToCompare) {
        this.addConditionStatement(MIN, minField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &gt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreaterOrEqual(String minField, long valueToCompare) {
        this.addConditionStatement(MIN, minField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &gt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreaterOrEqual(String minField, double valueToCompare) {
        this.addConditionStatement(MIN, minField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) &gt;= (valueToCompare.sqlValue)"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreaterOrEqual(String minField, Query valueToCompare) {
        this.addConditionStatement(MIN, minField, GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &gt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreaterOrEqual(Query minField, String valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &gt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreaterOrEqual(Query minField, int valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &gt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreaterOrEqual(Query minField, long valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &gt;= valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreaterOrEqual(Query minField, double valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) &gt;= (valueToCompare.sqlValue)"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minGreaterOrEqual(Query minField, Query valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) = valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minEqual(String minField, String valueToCompare) {
        this.addConditionStatement(MIN, minField, EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) = valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minEqual(String minField, int valueToCompare) {
        this.addConditionStatement(MIN, minField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) = valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minEqual(String minField, long valueToCompare) {
        this.addConditionStatement(MIN, minField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) = valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minEqual(String minField, double valueToCompare) {
        this.addConditionStatement(MIN, minField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField) = (valueToCompare.sqlValue)"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minEqual(String minField, Query valueToCompare) {
        this.addConditionStatement(MIN, minField, EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) = valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minEqual(Query minField, String valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) = valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minEqual(Query minField, int valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) = valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minEqual(Query minField, long valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) = valueToCompare"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minEqual(Query minField, double valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MIN(minField.sqlValue) = (valueToCompare.sqlValue)"
     *
     * @param minField       Atributo a tener en cuenta para el m&iacute;nimo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder minEqual(Query minField, Query valueToCompare) {
        this.addConditionStatement(MIN, minField.getStatementAsString(), EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    //-----------------------------------

    /**
     * Crea una cl&aacute;usula "MAX(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllLess(String valueToCompare) {
        this.addConditionStatement(MAX, "*", LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllLess(int valueToCompare) {
        this.addConditionStatement(MAX, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllLess(long valueToCompare) {
        this.addConditionStatement(MAX, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllLess(double valueToCompare) {
        this.addConditionStatement(MAX, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &lt; (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllLess(Query valueToCompare) {
        this.addConditionStatement(MAX, "*", LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllLessOrEqual(String valueToCompare) {
        this.addConditionStatement(MAX, "*", LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllLessOrEqual(int valueToCompare) {
        this.addConditionStatement(MAX, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllLessOrEqual(long valueToCompare) {
        this.addConditionStatement(MAX, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllLessOrEqual(double valueToCompare) {
        this.addConditionStatement(MAX, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &lt;= (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllLessOrEqual(Query valueToCompare) {
        this.addConditionStatement(MAX, "*", LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllGreater(String valueToCompare) {
        this.addConditionStatement(MAX, "*", GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllGreater(int valueToCompare) {
        this.addConditionStatement(MAX, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllGreater(long valueToCompare) {
        this.addConditionStatement(MAX, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllGreater(double valueToCompare) {
        this.addConditionStatement(MAX, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &gt; (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllGreater(Query valueToCompare) {
        this.addConditionStatement(MAX, "*", GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllGreaterOrEqual(String valueToCompare) {
        this.addConditionStatement(MAX, "*", GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllGreaterOrEqual(int valueToCompare) {
        this.addConditionStatement(MAX, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllGreaterOrEqual(long valueToCompare) {
        this.addConditionStatement(MAX, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllGreaterOrEqual(double valueToCompare) {
        this.addConditionStatement(MAX, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) &gt;= (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllGreaterOrEqual(Query valueToCompare) {
        this.addConditionStatement(MAX, "*", GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllEqual(String valueToCompare) {
        this.addConditionStatement(MAX, "*", EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllEqual(int valueToCompare) {
        this.addConditionStatement(MAX, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllEqual(long valueToCompare) {
        this.addConditionStatement(MAX, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllEqual(double valueToCompare) {
        this.addConditionStatement(MAX, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxAllEqual(Query valueToCompare) {
        this.addConditionStatement(MAX, "*", EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &lt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLess(String maxField, String valueToCompare) {
        this.addConditionStatement(MAX, maxField, LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &lt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLess(String maxField, int valueToCompare) {
        this.addConditionStatement(MAX, maxField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &lt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLess(String maxField, long valueToCompare) {
        this.addConditionStatement(MAX, maxField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &lt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLess(String maxField, double valueToCompare) {
        this.addConditionStatement(MAX, maxField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &lt; (valueToCompare.sqlValue)"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLess(String maxField, Query valueToCompare) {
        this.addConditionStatement(MAX, maxField, LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &lt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLess(Query maxField, String valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &lt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLess(Query maxField, int valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &lt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLess(Query maxField, long valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &lt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLess(Query maxField, double valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &lt; (valueToCompare.sqlValue)"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLess(Query maxField, Query valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &lt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLessOrEqual(String maxField, String valueToCompare) {
        this.addConditionStatement(MAX, maxField, LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &lt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLessOrEqual(String maxField, int valueToCompare) {
        this.addConditionStatement(MAX, maxField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &lt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLessOrEqual(String maxField, long valueToCompare) {
        this.addConditionStatement(MAX, maxField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &lt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLessOrEqual(String maxField, double valueToCompare) {
        this.addConditionStatement(MAX, maxField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &lt;= (valueToCompare.sqlValue)"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLessOrEqual(String maxField, Query valueToCompare) {
        this.addConditionStatement(MAX, maxField, LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &lt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLessOrEqual(Query maxField, String valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &lt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLessOrEqual(Query maxField, int valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &lt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLessOrEqual(Query maxField, long valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &lt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLessOrEqual(Query maxField, double valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &lt;= (valueToCompare.sqlValue)"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxLessOrEqual(Query maxField, Query valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &gt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreater(String maxField, String valueToCompare) {
        this.addConditionStatement(MAX, maxField, GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &gt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreater(String maxField, int valueToCompare) {
        this.addConditionStatement(MAX, maxField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &gt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreater(String maxField, long valueToCompare) {
        this.addConditionStatement(MAX, maxField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &gt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreater(String maxField, double valueToCompare) {
        this.addConditionStatement(MAX, maxField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &gt; (valueToCompare.sqlValue)"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreater(String maxField, Query valueToCompare) {
        this.addConditionStatement(MAX, maxField, GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &gt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreater(Query maxField, String valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &gt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreater(Query maxField, int valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &gt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreater(Query maxField, long valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &gt; valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreater(Query maxField, double valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &gt; (valueToCompare.sqlValue)"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreater(Query maxField, Query valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &gt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreaterOrEqual(String maxField, String valueToCompare) {
        this.addConditionStatement(MAX, maxField, GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &gt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreaterOrEqual(String maxField, int valueToCompare) {
        this.addConditionStatement(MAX, maxField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &gt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreaterOrEqual(String maxField, long valueToCompare) {
        this.addConditionStatement(MAX, maxField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &gt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreaterOrEqual(String maxField, double valueToCompare) {
        this.addConditionStatement(MAX, maxField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) &gt;= (valueToCompare.sqlValue)"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreaterOrEqual(String maxField, Query valueToCompare) {
        this.addConditionStatement(MAX, maxField, GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &gt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreaterOrEqual(Query maxField, String valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &gt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreaterOrEqual(Query maxField, int valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &gt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreaterOrEqual(Query maxField, long valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &gt;= valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreaterOrEqual(Query maxField, double valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) &gt;= (valueToCompare.sqlValue)"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxGreaterOrEqual(Query maxField, Query valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) = valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxEqual(String maxField, String valueToCompare) {
        this.addConditionStatement(MAX, maxField, EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) = valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxEqual(String maxField, int valueToCompare) {
        this.addConditionStatement(MAX, maxField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) = valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxEqual(String maxField, long valueToCompare) {
        this.addConditionStatement(MAX, maxField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) = valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxEqual(String maxField, double valueToCompare) {
        this.addConditionStatement(MAX, maxField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField) = (valueToCompare.sqlValue)"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxEqual(String maxField, Query valueToCompare) {
        this.addConditionStatement(MAX, maxField, EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) = valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxEqual(Query maxField, String valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) = valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxEqual(Query maxField, int valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) = valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxEqual(Query maxField, long valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) = valueToCompare"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxEqual(Query maxField, double valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "MAX(maxField.sqlValue) = (valueToCompare.sqlValue)"
     *
     * @param maxField       Atributo a tener en cuenta para el m&aacute;ximo, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder maxEqual(Query maxField, Query valueToCompare) {
        this.addConditionStatement(MAX, maxField.getStatementAsString(), EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    //-----------------------------------

    /**
     * Crea una cl&aacute;usula "AVG(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllLess(String valueToCompare) {
        this.addConditionStatement(AVG, "*", LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllLess(int valueToCompare) {
        this.addConditionStatement(AVG, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllLess(long valueToCompare) {
        this.addConditionStatement(AVG, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &lt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllLess(double valueToCompare) {
        this.addConditionStatement(AVG, "*", LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &lt; (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllLess(Query valueToCompare) {
        this.addConditionStatement(AVG, "*", LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllLessOrEqual(String valueToCompare) {
        this.addConditionStatement(AVG, "*", LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllLessOrEqual(int valueToCompare) {
        this.addConditionStatement(AVG, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllLessOrEqual(long valueToCompare) {
        this.addConditionStatement(AVG, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &lt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllLessOrEqual(double valueToCompare) {
        this.addConditionStatement(AVG, "*", LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &lt;= (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllLessOrEqual(Query valueToCompare) {
        this.addConditionStatement(AVG, "*", LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllGreater(String valueToCompare) {
        this.addConditionStatement(AVG, "*", GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllGreater(int valueToCompare) {
        this.addConditionStatement(AVG, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllGreater(long valueToCompare) {
        this.addConditionStatement(AVG, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &gt; valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllGreater(double valueToCompare) {
        this.addConditionStatement(AVG, "*", GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &gt; (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllGreater(Query valueToCompare) {
        this.addConditionStatement(AVG, "*", GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllGreaterOrEqual(String valueToCompare) {
        this.addConditionStatement(AVG, "*", GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllGreaterOrEqual(int valueToCompare) {
        this.addConditionStatement(AVG, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllGreaterOrEqual(long valueToCompare) {
        this.addConditionStatement(AVG, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &gt;= valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllGreaterOrEqual(double valueToCompare) {
        this.addConditionStatement(AVG, "*", GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) &gt;= (valueToCompare.sqlValue)"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllGreaterOrEqual(Query valueToCompare) {
        this.addConditionStatement(AVG, "*", GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar. Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllEqual(String valueToCompare) {
        this.addConditionStatement(AVG, "*", EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllEqual(int valueToCompare) {
        this.addConditionStatement(AVG, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllEqual(long valueToCompare) {
        this.addConditionStatement(AVG, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllEqual(double valueToCompare) {
        this.addConditionStatement(AVG, "*", EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(*) = valueToCompare"
     *
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgAllEqual(Query valueToCompare) {
        this.addConditionStatement(AVG, "*", EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &lt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLess(String avgField, String valueToCompare) {
        this.addConditionStatement(AVG, avgField, LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &lt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLess(String avgField, int valueToCompare) {
        this.addConditionStatement(AVG, avgField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &lt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLess(String avgField, long valueToCompare) {
        this.addConditionStatement(AVG, avgField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &lt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLess(String avgField, double valueToCompare) {
        this.addConditionStatement(AVG, avgField, LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &lt; (valueToCompare.sqlValue)"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLess(String avgField, Query valueToCompare) {
        this.addConditionStatement(AVG, avgField, LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &lt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLess(Query avgField, String valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), LESS_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &lt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLess(Query avgField, int valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &lt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLess(Query avgField, long valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &lt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLess(Query avgField, double valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), LESS_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &lt; (valueToCompare.sqlValue)"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLess(Query avgField, Query valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), LESS_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &lt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLessOrEqual(String avgField, String valueToCompare) {
        this.addConditionStatement(AVG, avgField, LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &lt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLessOrEqual(String avgField, int valueToCompare) {
        this.addConditionStatement(AVG, avgField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &lt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLessOrEqual(String avgField, long valueToCompare) {
        this.addConditionStatement(AVG, avgField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &lt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLessOrEqual(String avgField, double valueToCompare) {
        this.addConditionStatement(AVG, avgField, LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &lt;= (valueToCompare.sqlValue)"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLessOrEqual(String avgField, Query valueToCompare) {
        this.addConditionStatement(AVG, avgField, LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &lt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLessOrEqual(Query avgField, String valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), LESS_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &lt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLessOrEqual(Query avgField, int valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &lt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLessOrEqual(Query avgField, long valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &lt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLessOrEqual(Query avgField, double valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), LESS_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &lt;= (valueToCompare.sqlValue)"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgLessOrEqual(Query avgField, Query valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), LESS_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &gt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreater(String avgField, String valueToCompare) {
        this.addConditionStatement(AVG, avgField, GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &gt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreater(String avgField, int valueToCompare) {
        this.addConditionStatement(AVG, avgField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &gt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreater(String avgField, long valueToCompare) {
        this.addConditionStatement(AVG, avgField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &gt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreater(String avgField, double valueToCompare) {
        this.addConditionStatement(AVG, avgField, GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &gt; (valueToCompare.sqlValue)"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreater(String avgField, Query valueToCompare) {
        this.addConditionStatement(AVG, avgField, GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &gt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreater(Query avgField, String valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), GREATER_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &gt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreater(Query avgField, int valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &gt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreater(Query avgField, long valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &gt; valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreater(Query avgField, double valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), GREATER_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &gt; (valueToCompare.sqlValue)"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreater(Query avgField, Query valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), GREATER_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &gt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreaterOrEqual(String avgField, String valueToCompare) {
        this.addConditionStatement(AVG, avgField, GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &gt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreaterOrEqual(String avgField, int valueToCompare) {
        this.addConditionStatement(AVG, avgField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &gt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreaterOrEqual(String avgField, long valueToCompare) {
        this.addConditionStatement(AVG, avgField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &gt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreaterOrEqual(String avgField, double valueToCompare) {
        this.addConditionStatement(AVG, avgField, GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) &gt;= (valueToCompare.sqlValue)"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreaterOrEqual(String avgField, Query valueToCompare) {
        this.addConditionStatement(AVG, avgField, GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &gt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreaterOrEqual(Query avgField, String valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), GREATER_EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &gt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreaterOrEqual(Query avgField, int valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &gt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreaterOrEqual(Query avgField, long valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &gt;= valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreaterOrEqual(Query avgField, double valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), GREATER_EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) &gt;= (valueToCompare.sqlValue)"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgGreaterOrEqual(Query avgField, Query valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), GREATER_EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) = valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgEqual(String avgField, String valueToCompare) {
        this.addConditionStatement(AVG, avgField, EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) = valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgEqual(String avgField, int valueToCompare) {
        this.addConditionStatement(AVG, avgField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) = valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgEqual(String avgField, long valueToCompare) {
        this.addConditionStatement(AVG, avgField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) = valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgEqual(String avgField, double valueToCompare) {
        this.addConditionStatement(AVG, avgField, EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField) = (valueToCompare.sqlValue)"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio.
     * @param valueToCompare Valor a comparar, resultado de la SubQuery
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgEqual(String avgField, Query valueToCompare) {
        this.addConditionStatement(AVG, avgField, EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) = valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgEqual(Query avgField, String valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), EQUAL_OPERATOR, valueToCompare);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) = valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.  Si es un TEXTO, debe enviarse 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgEqual(Query avgField, int valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) = valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgEqual(Query avgField, long valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) = valueToCompare"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgEqual(Query avgField, double valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), EQUAL_OPERATOR, String.valueOf(valueToCompare));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "AVG(avgField.sqlValue) = (valueToCompare.sqlValue)"
     *
     * @param avgField       Atributo a tener en cuenta para el promedio, resultado de SubQuery.
     * @param valueToCompare Valor a comparar, resultado de SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder avgEqual(Query avgField, Query valueToCompare) {
        this.addConditionStatement(AVG, avgField.getStatementAsString(), EQUAL_OPERATOR, valueToCompare.getStatementAsString());
        return this;
    }

}
