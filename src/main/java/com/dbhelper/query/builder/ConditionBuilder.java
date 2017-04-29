package com.dbhelper.query.builder;

import com.dbhelper.query.common.Condition;
import com.dbhelper.query.common.Query;
import com.dbhelper.query.exception.QueryBuilderException;

/**
 * Created by quares on 28/03/2017.
 */

public class ConditionBuilder extends AbstractBuilder<Condition> {

    static final String EQUAL_OPERATOR = "=";
    static final String LESS_OPERATOR = "<";
    static final String LESS_EQUAL_OPERATOR = "<=";
    static final String GREATER_OPERATOR = ">";
    static final String GREATER_EQUAL_OPERATOR = ">=";

    private int groupsOpened = 0;
    boolean orAndCalled = false;

    String condition = "";

    /**
     * Inserta un par&eacute;ntesis izquierda "(" a la condici&oacute;n.
     *
     * @return ConditionBuilder
     */
    public ConditionBuilder beginGroup() {
        this.groupsOpened++;
        this.condition = String.format("%s (", this.condition);
        return this;
    }

    /**
     * Inserta un par&eacute;ntesis derecho ")" a la condici&oacute;n.
     *
     * @return ConditionBuilder
     */
    public ConditionBuilder endGroup() {
        this.groupsOpened--;
        this.condition = String.format("%s) ", this.condition);
        return this;
    }

    //---------------------------------

    /**
     * Crea una cl&aacute;usula "FIELD = VALUETOCOMPARE".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en String contra el que se va a comprar. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder equals(String field, String valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s = %s", this.condition, field, valueToCompare);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "FIELD = VALUETOCOMPARE".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en int contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder equals(String field, int valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s = %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "FIELD = VALUETOCOMPARE".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en long contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder equals(String field, long valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s = %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "FIELD = VALUETOCOMPARE".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en double contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder equals(String field, double valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s = %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) = VALUETOCOMPARE".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en String contra el que se va a comprar. Si es un TEXTO, se lo debe enviar como 'TEXTO'
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder equals(Query field, String valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s (%s) = %s", this.condition, field.getStatementAsString(), valueToCompare);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) = VALUETOCOMPARE".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en int contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder equals(Query field, int valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s (%s) = %s", this.condition, field.getStatementAsString(), valueToCompare);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) = VALUETOCOMPARE".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en long contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder equals(Query field, long valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s (%s) = %s", this.condition, field.getStatementAsString(), valueToCompare);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) = VALUETOCOMPARE".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en double contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder equals(Query field, double valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s (%s) = %s", this.condition, field.getStatementAsString(), valueToCompare);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field = (valueToCompare.sqlValue)".
     *
     * @param field          String que se va a comparar.
     * @param valueToCompare SubQuery de la cual se va a obtener un resultado para compararlo con field.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder equals(String field, Query valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s = (%s)", this.condition, field, valueToCompare.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) = (valueToCompare.sqlValue)".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare SubQuery de la cual se va a obtener un resultado para compararlo con field.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder equals(Query field, Query valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s (%s) = (%s)", this.condition, field.getStatementAsString(), valueToCompare.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    //-----------------------------------

    /**
     * Crea una cl&aacute;usula "field &lt; valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en String contra el que se va a comprar. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder less(String field, String valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s < %s", this.condition, field, valueToCompare);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &lt; valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en int contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder less(String field, int valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s < %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &lt; valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en long contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder less(String field, long valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s < %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &lt; valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en double contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder less(String field, double valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s < %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &lt; valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en String contra el que se va a comprar. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder less(Query field, String valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s < %s", this.condition, field.getStatementAsString(), valueToCompare);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &lt; valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en int contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder less(Query field, int valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s < %s", this.condition, field.getStatementAsString(), String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &lt; valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en long contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder less(Query field, long valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s < %s", this.condition, field.getStatementAsString(), String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &lt; valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en double contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder less(Query field, double valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s < %s", this.condition, field.getStatementAsString(), String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &lt; (valueToCompare.sqlValue)".
     *
     * @param field          String que se va a comparar.
     * @param valueToCompare SubQuery de la cual se va a obtener un resultado para compararlo con field.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder less(String field, Query valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s < %s", this.condition, field, valueToCompare.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &lt; (valueToCompare.sqlValue)".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare SubQuery de la cual se va a obtener un resultado para compararlo con field.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder less(Query field, Query valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s < %s", this.condition, field.getStatementAsString(), valueToCompare.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    //-----------------------------------

    /**
     * Crea una cl&aacute;usula "field &lt;= valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en String contra el que se va a comprar. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder lessOrEqual(String field, String valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s <= %s", this.condition, field, valueToCompare);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &lt;= valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en int contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder lessOrEqual(String field, int valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s <= %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &lt;= valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en long contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder lessOrEqual(String field, long valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s <= %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &lt;= valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en doubele contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder lessOrEqual(String field, double valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s <= %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &lt;= valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en String contra el que se va a comprar. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder lessOrEqual(Query field, String valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s <= %s", this.condition, field.getStatementAsString(), valueToCompare);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &lt;= valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en int contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder lessOrEqual(Query field, int valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s <= %s", this.condition, field.getStatementAsString(), String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &lt;= valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en long contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder lessOrEqual(Query field, long valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s <= %s", this.condition, field.getStatementAsString(), String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &lt;= valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en double contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder lessOrEqual(Query field, double valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s <= %s", this.condition, field.getStatementAsString(), String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &lt;= (valueToCompare.sqlValue)".
     *
     * @param field          String que se va a comparar.
     * @param valueToCompare SubQuery de la cual se va a obtener un resultado para compararlo con field.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder lessOrEqual(String field, Query valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s <= %s", this.condition, field, valueToCompare.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &lt;= (valueToCompare.sqlValue)".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare SubQuery de la cual se va a obtener un resultado para compararlo con field.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder lessOrEqual(Query field, Query valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s <= %s", this.condition, field.getStatementAsString(), valueToCompare.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    //-----------------------------------

    /**
     * Crea una cl&aacute;usula "field &gt; valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en String contra el que se va a comprar. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greater(String field, String valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s > %s", this.condition, field, valueToCompare);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &gt; valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en int contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greater(String field, int valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s > %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &gt; valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en long contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greater(String field, long valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s > %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &gt; valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en double contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greater(String field, double valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s > %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &gt; valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en String contra el que se va a comprar. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greater(Query field, String valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s > %s", this.condition, field.getStatementAsString(), valueToCompare);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &gt; valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en int contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greater(Query field, int valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s > %s", this.condition, field.getStatementAsString(), String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &gt; valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en long contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greater(Query field, long valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s > %s", this.condition, field.getStatementAsString(), String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &gt; valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en double contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greater(Query field, double valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s > %s", this.condition, field.getStatementAsString(), String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &gt; (valueToCompare.sqlValue)".
     *
     * @param field          String que se va a comparar.
     * @param valueToCompare SubQuery de la cual se va a obtener un resultado para compararlo con field.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greater(String field, Query valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s > %s", this.condition, field, valueToCompare.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &gt; (valueToCompare.sqlValue)".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare SubQuery de la cual se va a obtener un resultado para compararlo con field.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greater(Query field, Query valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s > %s", this.condition, field.getStatementAsString(), valueToCompare.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    //-----------------------------------

    /**
     * Crea una cl&aacute;usula "field &gt;= valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en String contra el que se va a comprar. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greaterOrEqual(String field, String valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s >= %s", this.condition, field, valueToCompare);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &gt;= valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en int contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greaterOrEqual(String field, int valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s >= %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &gt;= valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en long contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greaterOrEqual(String field, long valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s >= %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &gt;= valueToCompare".
     *
     * @param field          El atributo al que se va a comparar.
     * @param valueToCompare El valor en double contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greaterOrEqual(String field, double valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s >= %s", this.condition, field, String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &gt;= valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en String contra el que se va a comprar. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greaterOrEqual(Query field, String valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s >= %s", this.condition, field.getStatementAsString(), valueToCompare);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &gt;= valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en int contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greaterOrEqual(Query field, int valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s >= %s", this.condition, field.getStatementAsString(), String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &gt;= valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en long contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greaterOrEqual(Query field, long valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s >= %s", this.condition, field.getStatementAsString(), String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &gt;= valueToCompare".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare El valor en double contra el que se va a comprar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greaterOrEqual(Query field, double valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s >= %s", this.condition, field.getStatementAsString(), String.valueOf(valueToCompare));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field &gt;= (valueToCompare.sqlValue)".
     *
     * @param field          String que se va a comparar.
     * @param valueToCompare SubQuery de la cual se va a obtener un resultado para compararlo con field.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greaterOrEqual(String field, Query valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s >= %s", this.condition, field, valueToCompare.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) &gt;= (valueToCompare.sqlValue)".
     *
     * @param field          SubQuery que se va a comparar.
     * @param valueToCompare SubQuery de la cual se va a obtener un resultado para compararlo con field.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder greaterOrEqual(Query field, Query valueToCompare) {
        this.checkParams(field, valueToCompare);
        this.condition = String.format("%s %s >= %s", this.condition, field.getStatementAsString(), valueToCompare.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    //-----------------------------------

    /**
     * Crea una cl&aacute;usula "field BETWEEN firstValue AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @param secondValue L&iacute;mite superior del rango. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(String field, String firstValue, String secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s BETWEEN %s AND %s", this.condition, field, firstValue, secondValue);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field BETWEEN firstValue AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(String field, int firstValue, int secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s BETWEEN %s AND %s", this.condition, field, String.valueOf(firstValue), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field BETWEEN firstValue AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(String field, long firstValue, long secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s BETWEEN %s AND %s", this.condition, field, String.valueOf(firstValue), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field BETWEEN firstValue AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(String field, double firstValue, double secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s BETWEEN %s AND %s", this.condition, field, String.valueOf(firstValue), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) BETWEEN firstValue AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @param secondValue L&iacute;mite superior del rango. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(Query field, String firstValue, String secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) BETWEEN %s AND %s", this.condition, field.getStatementAsString(), firstValue, secondValue);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) BETWEEN firstValue AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(Query field, int firstValue, int secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) BETWEEN %s AND %s", this.condition, field.getStatementAsString(), String.valueOf(firstValue), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) BETWEEN firstValue AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(Query field, long firstValue, long secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) BETWEEN %s AND %s", this.condition, field.getStatementAsString(), String.valueOf(firstValue), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) BETWEEN firstValue AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(Query field, double firstValue, double secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) BETWEEN %s AND %s", this.condition, field.getStatementAsString(), String.valueOf(firstValue), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(Query field, Query firstValue, String secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) BETWEEN (%s) AND %s", this.condition, field.getStatementAsString(), firstValue.getStatementAsString(), secondValue);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(Query field, Query firstValue, int secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) BETWEEN (%s) AND %s", this.condition, field.getStatementAsString(), firstValue.getStatementAsString(), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(Query field, Query firstValue, long secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) BETWEEN (%s) AND %s", this.condition, field.getStatementAsString(), firstValue.getStatementAsString(), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(Query field, Query firstValue, double secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) BETWEEN (%s) AND %s", this.condition, field.getStatementAsString(), firstValue.getStatementAsString(), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) BETWEEN (firstValue.sqlValue) AND (secondValue.sqlValue)".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango, valor que devuelve la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(Query field, Query firstValue, Query secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) BETWEEN (%s) AND (%s)", this.condition, field.getStatementAsString(), firstValue.getStatementAsString(), secondValue.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field BETWEEN (firstValue.sqlValue) AND (secondValue.sqlValue)".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango, valor que devuelve la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(String field, Query firstValue, Query secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s BETWEEN (%s) AND (%s)", this.condition, field, firstValue.getStatementAsString(), secondValue.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field BETWEEN firstValue AND (secondValue.sqlValue)".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @param secondValue L&iacute;mite superior del rango, valor que devuelve la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(String field, String firstValue, Query secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s BETWEEN %s AND (%s)", this.condition, field, firstValue, secondValue.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field BETWEEN sqlValue AND (secondValue.sqlValue)".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango, valor que devuelve la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(String field, int firstValue, Query secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s BETWEEN %s AND (%s)", this.condition, field, String.valueOf(firstValue), secondValue.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field BETWEEN sqlValue AND (secondValue.sqlValue)".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango, valor que devuelve la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(String field, long firstValue, Query secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s BETWEEN %s AND (%s)", this.condition, field, String.valueOf(firstValue), secondValue.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field BETWEEN sqlValue AND (secondValue.sqlValue)".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango, valor que devuelve la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(String field, double firstValue, Query secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s BETWEEN %s AND (%s)", this.condition, field, String.valueOf(firstValue), secondValue.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(String field, Query firstValue, String secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s BETWEEN (%s) AND %s)", this.condition, field, firstValue.getStatementAsString(), secondValue);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(String field, Query firstValue, int secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s BETWEEN (%s) AND %s)", this.condition, field, firstValue.getStatementAsString(), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(String field, Query firstValue, long secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s BETWEEN (%s) AND %s)", this.condition, field, firstValue.getStatementAsString(), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder between(String field, Query firstValue, double secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s BETWEEN (%s) AND %s)", this.condition, field, firstValue.getStatementAsString(), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT BETWEEN firstValue AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @param secondValue L&iacute;mite superior del rango. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(String field, String firstValue, String secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s NOT BETWEEN %s AND %s", this.condition, field, firstValue, secondValue);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT BETWEEN firstValue AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(String field, int firstValue, int secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s NOT BETWEEN %s AND %s", this.condition, field, String.valueOf(firstValue), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT BETWEEN firstValue AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(String field, long firstValue, long secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s NOT BETWEEN %s AND %s", this.condition, field, String.valueOf(firstValue), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT BETWEEN firstValue AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(String field, double firstValue, double secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s NOT BETWEEN %s AND %s", this.condition, field, String.valueOf(firstValue), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT BETWEEN firstValue AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @param secondValue L&iacute;mite superior del rango. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(Query field, String firstValue, String secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) NOT BETWEEN %s AND %s", this.condition, field.getStatementAsString(), firstValue, secondValue);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT BETWEEN firstValue AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(Query field, int firstValue, int secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) NOT BETWEEN %s AND %s", this.condition, field.getStatementAsString(), String.valueOf(firstValue), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT BETWEEN firstValue AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(Query field, long firstValue, long secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) NOT BETWEEN %s AND %s", this.condition, field.getStatementAsString(), String.valueOf(firstValue), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT BETWEEN firstValue AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(Query field, double firstValue, double secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) NOT BETWEEN %s AND %s", this.condition, field.getStatementAsString(), String.valueOf(firstValue), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(Query field, Query firstValue, String secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) NOT BETWEEN (%s) AND %s", this.condition, field.getStatementAsString(), firstValue.getStatementAsString(), secondValue);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(Query field, Query firstValue, int secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) NOT BETWEEN (%s) AND %s", this.condition, field.getStatementAsString(), firstValue.getStatementAsString(), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(Query field, Query firstValue, long secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) NOT BETWEEN (%s) AND %s", this.condition, field.getStatementAsString(), firstValue.getStatementAsString(), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(Query field, Query firstValue, double secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) NOT BETWEEN (%s) AND %s", this.condition, field.getStatementAsString(), firstValue.getStatementAsString(), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT BETWEEN (firstValue.sqlValue) AND (secondValue.sqlValue)".
     *
     * @param field       SubQuery que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango, valor que devuelve la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(Query field, Query firstValue, Query secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s (%s) NOT BETWEEN (%s) AND (%s)", this.condition, field.getStatementAsString(), firstValue.getStatementAsString(), secondValue.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT BETWEEN (firstValue.sqlValue) AND (secondValue.sqlValue)".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango, valor que devuelve la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(String field, Query firstValue, Query secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s NOT BETWEEN (%s) AND (%s)", this.condition, field, firstValue.getStatementAsString(), secondValue.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT BETWEEN firstValue AND (secondValue.sqlValue)".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @param secondValue L&iacute;mite superior del rango, valor que devuelve la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(String field, String firstValue, Query secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s NOT BETWEEN \'%s\' AND (%s)", this.condition, field, firstValue, secondValue.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT BETWEEN sqlValue AND (secondValue.sqlValue)".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango, valor que devuelve la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(String field, int firstValue, Query secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s NOT BETWEEN %s AND (%s)", this.condition, field, String.valueOf(firstValue), secondValue.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT BETWEEN sqlValue AND (secondValue.sqlValue)".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango, valor que devuelve la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(String field, long firstValue, Query secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s NOT BETWEEN %s AND (%s)", this.condition, field, String.valueOf(firstValue), secondValue.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT BETWEEN sqlValue AND (secondValue.sqlValue)".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango.
     * @param secondValue L&iacute;mite superior del rango, valor que devuelve la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(String field, double firstValue, Query secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s NOT BETWEEN %s AND (%s)", this.condition, field, String.valueOf(firstValue), secondValue.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(String field, Query firstValue, String secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s NOT BETWEEN (%s) AND %s)", this.condition, field, firstValue.getStatementAsString(), secondValue);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(String field, Query firstValue, int secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s NOT BETWEEN (%s) AND %s)", this.condition, field, firstValue.getStatementAsString(), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(String field, Query firstValue, long secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s NOT BETWEEN (%s) AND %s)", this.condition, field, firstValue.getStatementAsString(), secondValue);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT BETWEEN (firstValue.sqlValue) AND secondValue".
     *
     * @param field       Atributo que se va a comparar.
     * @param firstValue  L&iacute;mite inferior del rango, valor que devuelve la SubQuery.
     * @param secondValue L&iacute;mite superior del rango.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notBetween(String field, Query firstValue, double secondValue) {
        this.checkParams(field, firstValue, secondValue);
        this.condition = String.format("%s %s NOT BETWEEN (%s) AND %s)", this.condition, field, firstValue.getStatementAsString(), String.valueOf(secondValue));
        this.orAndCalled = false;
        return this;
    }

    //-------------

    /**
     * Crea una cl&aacute;usula "field LIKE valueToCompare".
     *
     * @param field El atributo al que se va a comparar.
     * @param like  El valor en String contra el que se va a comparar. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder like(String field, String like) {
        this.checkParams(field, like);
        this.condition = String.format("%s %s LIKE %s", this.condition, field, like);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) LIKE valueToCompare".
     *
     * @param field SubQuery que se va a comparar.
     * @param like  El valor en String contra el que se va a comparar. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder like(Query field, String like) {
        this.checkParams(field, like);
        this.condition = String.format("%s (%s) LIKE %s", this.condition, field.getStatementAsString(), like);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field LIKE valueToCompare".
     *
     * @param field El atributo al que se va a comparar.
     * @param like  El valor en int contra el que se va a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder like(String field, int like) {
        this.checkParams(field, like);
        this.condition = String.format("%s %s LIKE %s", this.condition, field, String.valueOf(like));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) LIKE valueToCompare".
     *
     * @param field SubQuery que se va a comparar.
     * @param like  El valor en int contra el que se va a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder like(Query field, int like) {
        this.checkParams(field, like);
        this.condition = String.format("%s (%s) LIKE %s", this.condition, field.getStatementAsString(), String.valueOf(like));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field LIKE valueToCompare".
     *
     * @param field El atributo al que se va a comparar.
     * @param like  El valor en long contra el que se va a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder like(String field, long like) {
        this.checkParams(field, like);
        this.condition = String.format("%s %s LIKE %s", this.condition, field, String.valueOf(like));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) LIKE valueToCompare".
     *
     * @param field SubQuery que se va a comparar.
     * @param like  El valor en long contra el que se va a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder like(Query field, long like) {
        this.checkParams(field, like);
        this.condition = String.format("%s (%s) LIKE %s", this.condition, field.getStatementAsString(), String.valueOf(like));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field LIKE valueToCompare".
     *
     * @param field El atributo al que se va a comparar.
     * @param like  El valor en double contra el que se va a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder like(String field, double like) {
        this.checkParams(field, like);
        this.condition = String.format("%s %s LIKE %s", this.condition, field, String.valueOf(like));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) LIKE valueToCompare".
     *
     * @param field SubQuery que se va a comparar.
     * @param like  El valor en double contra el que se va a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder like(Query field, double like) {
        this.checkParams(field, like);
        this.condition = String.format("%s (%s) LIKE %s", this.condition, field.getStatementAsString(), String.valueOf(like));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field LIKE (valueToCompare.sqlValue)".
     *
     * @param field Atributo que se va a comparar.
     * @param like  El valor contra el que se va a comprar, que va a ser el resultado de la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder like(String field, Query like) {
        this.checkParams(field, like);
        this.condition = String.format("%s %s LIKE (%s)", this.condition, field, like.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) LIKE (valueToCompare.sqlValue)".
     *
     * @param field SubQuery que se va a comparar.
     * @param like  El valor contra el que se va a comprar, que va a ser el resultado de la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder like(Query field, Query like) {
        this.checkParams(field, like);
        this.condition = String.format("%s (%s) LIKE (%s)", this.condition, field.getStatementAsString(), like.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT LIKE valueToCompare".
     *
     * @param field El atributo al que se va a comparar.
     * @param like  El valor en String contra el que se va a comparar. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notLike(String field, String like) {
        this.checkParams(field, like);
        this.condition = String.format("%s %s NOT LIKE %s", this.condition, field, like);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT LIKE valueToCompare".
     *
     * @param field SubQuery que se va a comparar.
     * @param like  El valor en String contra el que se va a comparar. Si es un TEXTO, se lo debe enviar como 'TEXTO'.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notLike(Query field, String like) {
        this.checkParams(field, like);
        this.condition = String.format("%s (%s) NOT LIKE %s", this.condition, field.getStatementAsString(), like);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT LIKE valueToCompare".
     *
     * @param field El atributo al que se va a comparar.
     * @param like  El valor en int contra el que se va a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notLike(String field, int like) {
        this.checkParams(field, like);
        this.condition = String.format("%s %s NOT LIKE %s", this.condition, field, String.valueOf(like));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT LIKE valueToCompare".
     *
     * @param field SubQuery que se va a comparar.
     * @param like  El valor en int contra el que se va a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notLike(Query field, int like) {
        this.checkParams(field, like);
        this.condition = String.format("%s (%s) NOT LIKE %s", this.condition, field.getStatementAsString(), String.valueOf(like));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT LIKE valueToCompare".
     *
     * @param field El atributo al que se va a comparar.
     * @param like  El valor en long contra el que se va a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notLike(String field, long like) {
        this.checkParams(field, like);
        this.condition = String.format("%s %s NOT LIKE %s", this.condition, field, String.valueOf(like));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT LIKE valueToCompare".
     *
     * @param field SubQuery que se va a comparar.
     * @param like  El valor en long contra el que se va a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notLike(Query field, long like) {
        this.checkParams(field, like);
        this.condition = String.format("%s (%s) NOT LIKE %s", this.condition, field.getStatementAsString(), String.valueOf(like));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT LIKE valueToCompare".
     *
     * @param field El atributo al que se va a comparar.
     * @param like  El valor en double contra el que se va a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notLike(String field, double like) {
        this.checkParams(field, like);
        this.condition = String.format("%s %s NOT LIKE %s", this.condition, field, String.valueOf(like));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT LIKE valueToCompare".
     *
     * @param field SubQuery que se va a comparar.
     * @param like  El valor en double contra el que se va a comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notLike(Query field, double like) {
        this.checkParams(field, like);
        this.condition = String.format("%s (%s) NOT LIKE %s", this.condition, field.getStatementAsString(), String.valueOf(like));
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT LIKE (valueToCompare.sqlValue)".
     *
     * @param field Atributo que se va a comparar.
     * @param like  El valor contra el que se va a comprar, que va a ser el resultado de la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notLike(String field, Query like) {
        this.checkParams(field, like);
        this.condition = String.format("%s %s NOT LIKE (%s)", this.condition, field, like.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT LIKE (valueToCompare.sqlValue)".
     *
     * @param field SubQuery que se va a comparar.
     * @param like  El valor contra el que se va a comprar, que va a ser el resultado de la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notLike(Query field, Query like) {
        this.checkParams(field, like);
        this.condition = String.format("%s (%s) NOT LIKE (%s)", this.condition, field.getStatementAsString(), like.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    //----------------

    /**
     * Crea una cl&aacute;usula "field IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar.
     * @param inParams Valores que se van a utilizar para comparar. Si son TEXTO, se los debe enviar como 'TEXTO1', 'TEXTO2', etc.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder in(String field, String... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("%s IN (", field);
        for (String param : inParams) {
            inStatement = String.format("%s %s,", inStatement, param);
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar, resultado de la SubQuery.
     * @param inParams Valores que se van a utilizar para comparar. Si son TEXTO, se los debe enviar como 'TEXTO1', 'TEXTO2', etc.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder in(Query field, String... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("(%s) IN (", field.getStatementAsString());
        for (String param : inParams) {
            inStatement = String.format("%s %s,", inStatement, param);
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar.
     * @param inParams Valores que se van a utilizar para comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder in(String field, int... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("%s IN (", field);
        for (int param : inParams) {
            inStatement = String.format("%s %s,", inStatement, String.valueOf(param));
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar, resultado de la SubQuery.
     * @param inParams Valores que se van a utilizar para comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder in(Query field, int... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("(%s) IN (", field.getStatementAsString());
        for (int param : inParams) {
            inStatement = String.format("%s %s,", inStatement, String.valueOf(param));
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar.
     * @param inParams Valores que se van a utilizar para comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder in(String field, long... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("%s IN (", field);
        for (long param : inParams) {
            inStatement = String.format("%s %s,", inStatement, String.valueOf(param));
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar, resultado de la SubQuery.
     * @param inParams Valores que se van a utilizar para comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder in(Query field, long... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("(%s) IN (", field.getStatementAsString());
        for (long param : inParams) {
            inStatement = String.format("%s %s,", inStatement, String.valueOf(param));
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar.
     * @param inParams Valores que se van a utilizar para comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder in(String field, double... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("%s IN (", field);
        for (double param : inParams) {
            inStatement = String.format("%s %s,", inStatement, String.valueOf(param));
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar, resultado de la SubQuery.
     * @param inParams Valores que se van a utilizar para comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder in(Query field, double... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("(%s) IN (", field.getStatementAsString());
        for (double param : inParams) {
            inStatement = String.format("%s %s,", inStatement, String.valueOf(param));
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) IN (inParams.sqlValue)".
     *
     * @param field    Atributo que se va a comparar, resultado de la SubQuery.
     * @param inParams Valores que se van a utilizar para comparar, resultado de la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder in(Query field, Query inParams) {
        this.checkParams(field, inParams);
        String inStatement = String.format("%s IN (%s)", field.getStatementAsString(), inParams.getStatementAsString());
        this.condition = String.format("%s %s", this.condition, inStatement);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar.
     * @param inParams Valores que se van a utilizar para comparar. Si son TEXTO, se los debe enviar como 'TEXTO1', 'TEXTO2', etc.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notIn(String field, String... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("%s NOT IN (", field);
        for (String param : inParams) {
            inStatement = String.format("%s %s,", inStatement, param);
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar, resultado de la SubQuery.
     * @param inParams Valores que se van a utilizar para comparar. Si son TEXTO, se los debe enviar como 'TEXTO1', 'TEXTO2', etc.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notIn(Query field, String... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("(%s) NOT IN (", field.getStatementAsString());
        for (String param : inParams) {
            inStatement = String.format("%s %s,", inStatement, param);
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar.
     * @param inParams Valores que se van a utilizar para comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notIn(String field, int... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("%s NOT IN (", field);
        for (int param : inParams) {
            inStatement = String.format("%s %s,", inStatement, String.valueOf(param));
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar, resultado de la SubQuery.
     * @param inParams Valores que se van a utilizar para comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notIn(Query field, int... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("(%s) NOT IN (", field.getStatementAsString());
        for (int param : inParams) {
            inStatement = String.format("%s %s,", inStatement, String.valueOf(param));
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar.
     * @param inParams Valores que se van a utilizar para comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notIn(String field, long... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("%s NOT IN (", field);
        for (long param : inParams) {
            inStatement = String.format("%s %s,", inStatement, String.valueOf(param));
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar, resultado de la SubQuery.
     * @param inParams Valores que se van a utilizar para comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notIn(Query field, long... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("(%s) NOT IN (", field.getStatementAsString());
        for (long param : inParams) {
            inStatement = String.format("%s %s,", inStatement, String.valueOf(param));
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "field NOT IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar.
     * @param inParams Valores que se van a utilizar para comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notIn(String field, double... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("%s NOT IN (", field);
        for (double param : inParams) {
            inStatement = String.format("%s %s,", inStatement, String.valueOf(param));
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT IN (inParams[0], inParams[1], ..., inParams[n])".
     *
     * @param field    Atributo que se va a comparar, resultado de la SubQuery.
     * @param inParams Valores que se van a utilizar para comparar.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notIn(Query field, double... inParams) {
        this.checkParams(field, inParams);

        String inStatement = String.format("(%s) NOT IN (", field.getStatementAsString());
        for (double param : inParams) {
            inStatement = String.format("%s %s,", inStatement, String.valueOf(param));
        }
        inStatement = String.format("%s", inStatement.substring(0, inStatement.length() - 1));
        inStatement = inStatement.concat(")");

        this.condition = String.format("%s %s", this.condition, inStatement);

        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "(field.sqlValue) NOT IN (inParams.sqlValue)".
     *
     * @param field    Atributo que se va a comparar, resultado de la SubQuery.
     * @param inParams Valores que se van a utilizar para comparar, resultado de la SubQuery.
     * @return ConditionBuilder
     * @throws QueryBuilderException Los par&aacute;metros no pueden ser nulos.
     */
    public ConditionBuilder notIn(Query field, Query inParams) {
        this.checkParams(field, inParams);
        String inStatement = String.format("%s NOT IN (%s)", field.getStatementAsString(), inParams.getStatementAsString());
        this.condition = String.format("%s %s", this.condition, inStatement);
        this.orAndCalled = false;
        return this;
    }

    //----------------

    /**
     * Crea una cl&aacute;usula "EXISTS (field.sqlValue)".
     *
     * @param query SubQuery para verificar existencia.
     * @return ConditionBuilder
     * @throws QueryBuilderException El par&aacute;metro no puede ser nulo.
     */
    public ConditionBuilder exists(Query query) {
        this.checkParams(query);
        this.condition = String.format("%s EXISTS(%s)", this.condition, query.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "NOT EXISTS (field.sqlValue)".
     *
     * @param query SubQuery para verificar no existencia.
     * @return ConditionBuilder
     * @throws QueryBuilderException El par&aacute;metro no puede ser nulo.
     */
    public ConditionBuilder notExists(Query query) {
        this.checkParams(query);
        this.condition = String.format("%s NOT EXISTS(%s)", this.condition, query.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    //----------------

    /**
     * Crea una cl&aacute;usula "IS NULL field".
     *
     * @param field Atributo a verificar.
     * @return ConditionBuilder
     * @throws QueryBuilderException El par&aacute;metro no puede ser nulo.
     */
    public ConditionBuilder isNull(String field) {
        this.checkParams(field);
        this.condition = String.format("%s %s IS NULL", this.condition, field);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "IS NULL (field.sqlValue)".
     *
     * @param field SubQuery, su resultado es el atributo a verificar.
     * @return ConditionBuilder
     * @throws QueryBuilderException El par&aacute;metro no puede ser nulo.
     */
    public ConditionBuilder isNull(Query field) {
        this.checkParams(field);
        this.condition = String.format("%s (%s) IS NULL", this.condition, field.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "IS NOT NULL (field.sqlValue)".
     *
     * @param field Atributo a verificar.
     * @return ConditionBuilder
     * @throws QueryBuilderException El par&aacute;metro no puede ser nulo.
     */
    public ConditionBuilder isNotNull(String field) {
        this.checkParams(field);
        this.condition = String.format("%s %s IS NOT NULL", this.condition, field);
        this.orAndCalled = false;
        return this;
    }

    /**
     * Crea una cl&aacute;usula "IS NOT NULL (field.sqlValue)".
     *
     * @param field SubQuery, su resultado es el atributo a verificar.
     * @return ConditionBuilder
     * @throws QueryBuilderException El par&aacute;metro no puede ser nulo.
     */
    public ConditionBuilder isNotNull(Query field) {
        this.checkParams(field);
        this.condition = String.format("%s (%s) IS NOT NULL", this.condition, field.getStatementAsString());
        this.orAndCalled = false;
        return this;
    }

    //----------------

    /**
     * Agrega "AND" a la condici&oacute;n
     *
     * @return ConditionBuilder
     */
    public ConditionBuilder and() {
        this.checkIfCanCallAndOrOr();
        this.orAndCalled = true;
        this.condition = String.format("%s AND ", this.condition);
        return this;
    }

    /**
     * Agrega "OR" a la condici&oacute;n
     *
     * @return ConditionBuilder
     */
    public ConditionBuilder or() {
        this.checkIfCanCallAndOrOr();
        this.orAndCalled = true;
        this.condition = String.format("%s OR ", this.condition);
        return this;
    }

    /**
     * @return Condition
     */
    @Override
    public Condition build() {
        if (this.condition.trim().length() == 0) {
            throw new QueryBuilderException("Condition cannot be Empty");
        }
        if (this.groupsOpened > 0) {
            throw new QueryBuilderException(String.format("%s groups not closed", String.valueOf(this.groupsOpened)));
        }
        if (this.orAndCalled) {
            throw new QueryBuilderException("AND or OR statement not completed");
        }

        Condition condition = new Condition();
        condition.setConditionString(this.condition);

        return condition;
    }

    private void checkIfCanCallAndOrOr() {
        if (this.orAndCalled) {
            throw new QueryBuilderException("Cannot call AND or OR. First, complete the previous AND or OR statement");
        }
    }

}
