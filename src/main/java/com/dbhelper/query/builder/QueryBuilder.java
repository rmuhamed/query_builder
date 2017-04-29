package com.dbhelper.query.builder;

import com.dbhelper.query.common.CaseQuery;
import com.dbhelper.query.common.Condition;
import com.dbhelper.query.common.Query;
import com.dbhelper.query.exception.QueryBuilderException;

/**
 * Created by quares on 28/03/2017.
 */

public class QueryBuilder extends AbstractBuilder<Query> {

    private Query query;

    private boolean selectCalled = false;
    private boolean fromCalled = false;
    private boolean whereCalled = false;
    private boolean joinsCalled = false;
    private boolean groupByCalled = false;
    private boolean havingCalled = false;
    private boolean orderByCalled = false;

    public QueryBuilder() {
        this.query = new Query();
    }

    /**
     * Crea una cl&aacute;usula "SELECT *".
     *
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder selectAll() {
        this.checkIfCanCallSelect();
        this.selectCalled = true;
        this.query.addSelectField("*");
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT DISTINCT(field)".
     *
     * @param field Atributo a tener en cuenta en DISTINCT.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder distinct(String field) {
        this.checkIfCanCallSelect();
        this.checkParams(field);
        this.selectCalled = true;
        this.query.addSelectField(String.format("%s %s", "DISTINCT", field));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT fields[0], fields[1], ..., fields[n]".
     *
     * @param fields Atributos a seleccionar.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder select(String... fields) {
        this.checkIfCanCallSelect();
        this.checkParams(fields);
        this.selectCalled = true;
        for (String field : fields) {
            this.query.addSelectField(field);
        }
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT (subQuery.sql) AS 'fieldAs'".
     *
     * @param subQuery subQuery dentro del SELECT.
     * @param fieldAs  Alias del resultado de la SubQuery.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder select(String fieldAs, Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(fieldAs, subQuery);
        this.selectCalled = true;
        this.query.addSelectField(String.format("(%s) AS \"%s\"", subQuery.getStatementAsString(), fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT (caseQuery.sql) AS 'fieldAs'".
     *
     * @param caseQuery cl&aacute;usula CASE dentro del SELECT.
     * @param fieldAs   Alias del resultado del CASE.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder select(String fieldAs, CaseQuery caseQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(fieldAs, caseQuery);
        this.selectCalled = true;
        this.query.addSelectField(String.format("%s AS \"%s\"", caseQuery.getStatementAsString(), fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT field AS 'fieldAs'".
     *
     * @param field   Atributo a seleccionar.
     * @param fieldAs Alias del atributo.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder select(String fieldAs, String field) {
        this.checkIfCanCallSelect();
        this.checkParams(fieldAs, field);
        this.selectCalled = true;
        this.query.addSelectField(String.format("%s AS \"%s\"", field, fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT COUNT(*)".
     *
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder countAll() {
        this.checkIfCanCallSelect();
        this.selectCalled = true;
        this.query.addSelectField("COUNT(*)");
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT COUNT(*) AS 'fieldAs'".
     *
     * @param fieldAs Alias del resultado de COUNT
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder countAll(String fieldAs) {
        this.checkIfCanCallSelect();
        this.selectCalled = true;
        this.query.addSelectField(String.format("COUNT(*) AS \"%s\"", fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT COUNT(fields[0], fields[1], ..., fields[2])".
     *
     * @param fields Atributos a seleccionar.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder count(String... fields) {
        this.checkIfCanCallSelect();
        this.checkParams(fields);
        this.selectCalled = true;
        String countFieldsString = "COUNT(";
        for (int i = 0; i < fields.length; i++) {
            countFieldsString = countFieldsString.concat(fields[i]);
            if (i + 1 < fields.length) {
                countFieldsString = countFieldsString.concat(",");
            }
        }
        countFieldsString = countFieldsString.concat(")");
        this.query.addSelectField(countFieldsString);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT COUNT(fields[0], fields[1], ..., fields[2])" AS 'fieldAs'".
     *
     * @param fieldAs Alias del resultado de COUNT
     * @param fields  Atributos a seleccionar.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder count(String fieldAs, String... fields) {
        this.checkIfCanCallSelect();
        this.checkParams(fields, fieldAs);
        this.selectCalled = true;
        String countFieldsString = "COUNT(";
        for (int i = 0; i < fields.length; i++) {
            countFieldsString = countFieldsString.concat(fields[i]);
            if (i + 1 < fields.length) {
                countFieldsString = countFieldsString.concat(",");
            }
        }
        countFieldsString = countFieldsString.concat(")");
        countFieldsString = String.format("%s AS \"%s\"", countFieldsString, fieldAs);
        this.query.addSelectField(countFieldsString);
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT COUNT(subQuery.sqlValue)".
     *
     * @param subQuery SubQuery, se van a contar sus resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder count(Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery);
        this.selectCalled = true;
        this.query.addSelectField(String.format("COUNT(%s)", subQuery.getStatementAsString()));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT COUNT(subQuery.sqlValue) AS 'fieldAs'".
     *
     * @param fieldAs  Alias del resultado del COUNT
     * @param subQuery SubQuery, se van a contar sus resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder count(String fieldAs, Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery, fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("COUNT(%s) AS \"%s\"", subQuery.getStatementAsString(), fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT SUM(*)".
     *
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder sumAll() {
        this.checkIfCanCallSelect();
        this.selectCalled = true;
        this.query.addSelectField("SUM(*)");
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT SUM(*) AS 'fieldAs'".
     *
     * @param fieldAs Alias del resultado del SUM.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder sumAll(String fieldAs) {
        this.checkIfCanCallSelect();
        this.selectCalled = true;
        this.query.addSelectField(String.format("SUM(*) AS \"%s\"", fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT SUM(field)".
     *
     * @param field Atributo a sumar.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder sum(String field) {
        this.checkIfCanCallSelect();
        this.checkParams(field);
        this.selectCalled = true;
        this.query.addSelectField(String.format("SUM(%s)", field));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT SUM(field) AS 'fieldAs'".
     *
     * @param fieldAs Alias del resultado de SUM.
     * @param field   Atributo a sumar.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder sum(String fieldAs, String field) {
        this.checkIfCanCallSelect();
        this.checkParams(field, fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("SUM(%s) AS \"%s\"", field, fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT SUM(subQuery.sqlValue)".
     *
     * @param subQuery SubQuery, se van a sumar sus resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder sum(Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery);
        this.selectCalled = true;
        this.query.addSelectField(String.format("SUM(%s)", subQuery.getStatementAsString()));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT SUM(subQuery.sqlValue) AS 'fieldAs'".
     *
     * @param fieldAs  Alias del resultado del SUM
     * @param subQuery SubQuery, se van a sumar sus resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder sum(String fieldAs, Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery, fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("SUM(%s) AS \"%s\"", subQuery.getStatementAsString(), fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT TOTAL(*)".
     *
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder totalAll() {
        this.checkIfCanCallSelect();
        this.selectCalled = true;
        this.query.addSelectField("TOTAL(*)");
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT TOTAL(*) AS 'fieldAs'".
     *
     * @param fieldAs Alias del resultado del TOTAL.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder totalAll(String fieldAs) {
        this.checkIfCanCallSelect();
        this.selectCalled = true;
        this.query.addSelectField(String.format("TOTAL(*) AS \"%s\"", fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT TOTAL(field)".
     *
     * @param field Atributo a sumar.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder total(String field) {
        this.checkIfCanCallSelect();
        this.checkParams(field);
        this.selectCalled = true;
        this.query.addSelectField(String.format("TOTAL(%s)", field));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT TOTAL(field) AS 'fieldAs'".
     *
     * @param fieldAs Alias del resultado de SUM.
     * @param field   Atributo a sumar.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder total(String fieldAs, String field) {
        this.checkIfCanCallSelect();
        this.checkParams(field, fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("TOTAL(%s) AS \"%s\"", field, fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT TOTAL(subQuery.sqlValue)".
     *
     * @param subQuery SubQuery, se van a sumar sus resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder total(Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery);
        this.selectCalled = true;
        this.query.addSelectField(String.format("TOTAL(%s)", subQuery.getStatementAsString()));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT TOTAL(subQuery.sqlValue) AS 'fieldAs'".
     *
     * @param fieldAs  Alias del resultado del TOTAL
     * @param subQuery SubQuery, se van a sumar sus resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder total(String fieldAs, Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery, fieldAs);
        this.checkParams(fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("TOTAL(%s) AS \"%s\"", subQuery.getStatementAsString(), fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT MIN(field)".
     *
     * @param field Atributo a contabilizar para obtener el m&iacute;nimo.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder min(String field) {
        this.checkIfCanCallSelect();
        this.checkParams(field);
        this.selectCalled = true;
        this.query.addSelectField(String.format("MIN(%s)", field));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT MIN(field) AS 'fieldAs'".
     *
     * @param fieldAs Alias del resultado de MIN.
     * @param field   Atributo a contabilizar para obtener el m&iacute;nimo.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder min(String fieldAs, String field) {
        this.checkIfCanCallSelect();
        this.checkParams(field, fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("MIN(%s) AS \"%s\"", field, fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT MIN(subQuery.sqlValue)".
     *
     * @param subQuery SubQuery, se van a contabilizar sus resultados para obtener el m&iacute;nimo.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder min(Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery);
        this.selectCalled = true;
        this.query.addSelectField(String.format("MIN(%s)", subQuery.getStatementAsString()));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT MIN(subQuery.sqlValue) AS 'fieldAs'".
     *
     * @param fieldAs  Alias del resultado del MIN
     * @param subQuery SubQuery, se van a contabilizar sus resultados para obtener el m&iacute;nimo.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder min(String fieldAs, Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery, fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("MIN(%s) AS \"%s\"", subQuery.getStatementAsString(), fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT MAX(field)".
     *
     * @param field Atributo a contabilizar para obtener el m&aacute;ximo.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder max(String field) {
        this.checkIfCanCallSelect();
        this.checkParams(field);
        this.selectCalled = true;
        this.query.addSelectField(String.format("MAX(%s)", field));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT MAX(field) AS 'fieldAs'".
     *
     * @param fieldAs Alias del resultado de MAX.
     * @param field   Atributo a contabilizar para obtener el m&aacute;ximo.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder max(String fieldAs, String field) {
        this.checkIfCanCallSelect();
        this.checkParams(field, fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("MAX(%s) AS \"%s\"", field, fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT MAX(subQuery.sqlValue)".
     *
     * @param subQuery SubQuery, se van a contabilizar sus resultados para obtener el m&aacute;ximo.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder max(Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery);
        this.selectCalled = true;
        this.query.addSelectField(String.format("MAX(%s)", subQuery.getStatementAsString()));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT MAX(subQuery.sqlValue) AS 'fieldAs'".
     *
     * @param fieldAs  Alias del resultado del MAX
     * @param subQuery SubQuery, se van a contabilizar sus resultados para obtener el m&aacute;ximo.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder max(String fieldAs, Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery, fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("MAX(%s) AS \"%s\"", subQuery.getStatementAsString(), fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT AVG(field)".
     *
     * @param field Atributo a contabilizar para obtener el promedio.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder avg(String field) {
        this.checkIfCanCallSelect();
        this.checkParams(field);
        this.selectCalled = true;
        this.query.addSelectField(String.format("AVG(%s)", field));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT AVG(field) AS 'fieldAs'".
     *
     * @param fieldAs Alias del resultado de AVG.
     * @param field   Atributo a contabilizar para obtener el promedio.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder avg(String fieldAs, String field) {
        this.checkIfCanCallSelect();
        this.checkParams(field, fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("AVG(%s) AS \"%s\"", field, fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT AVG(subQuery.sqlValue)".
     *
     * @param subQuery SubQuery, se van a contabilizar sus resultados para obtener el promedio.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder avg(Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery);
        this.selectCalled = true;
        this.query.addSelectField(String.format("AVG(%s)", subQuery.getStatementAsString()));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT AVG(subQuery.sqlValue) AS 'fieldAs'".
     *
     * @param fieldAs  Alias del resultado del AVG
     * @param subQuery SubQuery, se van a contabilizar sus resultados para obtener el promedio.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder avg(String fieldAs, Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery, fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("AVG(%s) AS \"%s\"", subQuery.getStatementAsString(), fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT GROUP_CONCAT(field)".
     *
     * @param field Atributo a agrupar.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder groupConcat(String field) {
        this.checkIfCanCallSelect();
        this.checkParams(field);
        this.selectCalled = true;
        this.query.addSelectField(String.format("GROUP_CONCAT(%s)", field));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT GROUP_CONCAT(subQuery.sqlValue)".
     *
     * @param subQuery Atributo a agrupar, resultado de SubQuery.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder groupConcat(Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery);
        this.selectCalled = true;
        this.query.addSelectField(String.format("GROUP_CONCAT(%s)", subQuery.getStatementAsString()));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT GROUP_CONCAT(field || 'separator')".
     *
     * @param separator caracter separador de resultados
     * @param field     Atributo a agrupar.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder groupConcat(String field, char separator) {
        this.checkIfCanCallSelect();
        this.checkParams(field);
        this.selectCalled = true;
        this.query.addSelectField(String.format("GROUP_CONCAT(%s || '%s')", field, String.valueOf(separator)));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT GROUP_CONCAT(field || 'separator')".
     *
     * @param separator caracter separador de resultados
     * @param subQuery  Atributo a agrupar, resultado de SubQuery.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder groupConcat(Query subQuery, char separator) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery);
        this.selectCalled = true;
        this.query.addSelectField(String.format("GROUP_CONCAT(%s || '%s')", subQuery.getStatementAsString(), String.valueOf(separator)));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT GROUP_CONCAT(subQuery.sqlValue) AS 'fieldAs'".
     *
     * @param fieldAs  Alias de la agrupaci&oacute;n.
     * @param subQuery Atributo a agrupar, resultado de SubQuery.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder groupConcat(String fieldAs, Query subQuery) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery, fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("GROUP_CONCAT(%s) AS \"%s\"", subQuery.getStatementAsString(), fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT GROUP_CONCAT(field) AS 'fieldAs'".
     *
     * @param fieldAs Alias de la agrupaci&oacute;n.
     * @param field   Atributo a agrupar.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder groupConcat(String fieldAs, String field) {
        this.checkIfCanCallSelect();
        this.checkParams(field, fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("GROUP_CONCAT(%s) AS \"%s\"", field, fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT GROUP_CONCAT(field || 'separator') AS 'fieldAs'".
     *
     * @param fieldAs   Alias de la agrupaci&oacute;n.
     * @param separator caracter separador de resultados
     * @param field     Atributo a agrupar.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder groupConcat(String fieldAs, String field, char separator) {
        this.checkIfCanCallSelect();
        this.checkParams(field, fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("GROUP_CONCAT(%s || '%s') AS \"%s\"", field, String.valueOf(separator), fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "SELECT GROUP_CONCAT(field || 'separator') AS 'fieldAs'".
     *
     * @param fieldAs   Alias de la agrupaci&oacute;n.
     * @param separator caracter separador de resultados
     * @param subQuery  Atributo a agrupar, resultado de SubQuery.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al SELECT.
     */
    public QueryBuilder groupConcat(String fieldAs, Query subQuery, char separator) {
        this.checkIfCanCallSelect();
        this.checkParams(subQuery, fieldAs);
        this.selectCalled = true;
        this.query.addSelectField(String.format("GROUP_CONCAT(%s || '%s') AS \"%s\"", subQuery.getStatementAsString(), String.valueOf(separator), fieldAs));
        return this;
    }

    /**
     * Crea una cl&aacute;usula "FROM table".
     *
     * @param table Tabla de la cual se van a obtener resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al FROM.
     */
    public QueryBuilder from(String table) {
        this.checkIfCanCallFrom();
        this.checkParams(table);
        this.fromCalled = true;

        this.query.setTable(table);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "FROM table AS 'tableAs'".
     *
     * @param tableAs Alias de la tabla.
     * @param table   Tabla de la cual se van a obtener resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al FROM.
     */
    public QueryBuilder from(String tableAs, String table) {
        this.checkIfCanCallFrom();
        this.checkParams(tableAs, table);
        this.fromCalled = true;

        String tableNameAs = String.format("%s AS \"%s\"", table, tableAs);
        this.query.setTable(tableNameAs);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "CROSS JOIN table".
     *
     * @param table Tabla de la cual se van a obtener resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al JOIN.
     */
    public QueryBuilder crossJoin(String table) {
        this.checkIfCanCallJoin();
        this.checkParams(table);
        this.joinsCalled = true;

        String tableNameAs = String.format("CROSS JOIN %s", table);
        this.query.addJoin(tableNameAs);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "CROSS JOIN (subQuery.sqlValue)".
     *
     * @param subQuery SubQuery que va a devolver como reusltado una tabla.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al JOIN.
     */
    public QueryBuilder crossJoin(Query subQuery) {
        this.checkIfCanCallJoin();
        this.checkParams(subQuery);
        this.joinsCalled = true;

        String tableNameAs = String.format("CROSS JOIN (%s)", subQuery.getStatementAsString());
        this.query.addJoin(tableNameAs);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "NATURAL JOIN table".
     *
     * @param table Tabla de la cual se van a obtener resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al JOIN.
     */
    public QueryBuilder naturalJoin(String table) {
        this.checkIfCanCallJoin();
        this.checkParams(table);
        this.joinsCalled = true;

        String tableNameAs = String.format("NATURAL JOIN %s", table);
        this.query.addJoin(tableNameAs);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "NATURAL JOIN (subQuery.sqlValue)".
     *
     * @param subQuery SubQuery que va a devolver como resultado una tabla.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al JOIN.
     */
    public QueryBuilder naturalJoin(Query subQuery) {
        this.checkIfCanCallJoin();
        this.checkParams(subQuery);
        this.joinsCalled = true;

        String tableNameAs = String.format("NATURAL JOIN (%s)", subQuery.getStatementAsString());
        this.query.addJoin(tableNameAs);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "INNER JOIN table ON (condition.sqlValue)".
     *
     * @param table     Tabla contra la que se hace JOIN.
     * @param condition Condici&oacute;n para hacer match de resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al JOIN.
     */
    public QueryBuilder innerJoin(String table, Condition condition) {
        this.checkIfCanCallJoin();
        this.checkParams(table, condition);
        this.joinsCalled = true;

        String tableNameAs = String.format("INNER JOIN (%s) ON (%s)", table, condition.getStatementAsString());
        this.query.addJoin(tableNameAs);

        return this;

    }

    /**
     * Crea una cl&aacute;usula "INNER JOIN (subQuery.sqlValue) ON (condition.sqlValue)".
     *
     * @param subQuery  SubQuery que va a devolver como resultado una tabla.
     * @param condition Condici&oacute;n para hacer match de resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al JOIN.
     */
    public QueryBuilder innerJoin(Query subQuery, Condition condition) {
        this.checkIfCanCallJoin();
        this.checkParams(subQuery, condition);
        this.joinsCalled = true;

        String tableNameAs = String.format("INNER JOIN (%s) ON (%s)", subQuery.getStatementAsString(), condition.getStatementAsString());
        this.query.addJoin(tableNameAs);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "INNER JOIN table AS 'tableAs' ON (condition.sqlValue)".
     *
     * @param tableAs   Alias de la tabla.
     * @param table     Tabla contra la que se hace JOIN.
     * @param condition Condici&oacute;n para hacer match de resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al JOIN.
     */
    public QueryBuilder innerJoin(String tableAs, String table, Condition condition) {
        this.checkIfCanCallJoin();
        this.checkParams(table, condition);
        this.joinsCalled = true;

        String tableNameAs = String.format("INNER JOIN (%s) AS \"%s\" ON (%s)", table, tableAs, condition.getStatementAsString());
        this.query.addJoin(tableNameAs);

        return this;

    }

    /**
     * Crea una cl&aacute;usula "INNER JOIN (subQuery.sqlValue) AS 'tableAs' ON (condition.sqlValue)".
     *
     * @param tableAs   Alias del resultado de la SubQuery.
     * @param subQuery  SubQuery que va a devolver como resultado una tabla.
     * @param condition Condici&oacute;n para hacer match de resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al JOIN.
     */
    public QueryBuilder innerJoin(String tableAs, Query subQuery, Condition condition) {
        this.checkIfCanCallJoin();
        this.checkParams(subQuery, condition);
        this.joinsCalled = true;

        String tableNameAs = String.format("INNER JOIN (%s) AS \"%s\" ON (%s)", subQuery.getStatementAsString(), tableAs, condition.getStatementAsString());
        this.query.addJoin(tableNameAs);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "LEFT OUTER JOIN table ON (condition.sqlValue)".
     *
     * @param table     Tabla contra la que se hace JOIN.
     * @param condition Condici&oacute;n para hacer match de resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al JOIN.
     */
    public QueryBuilder leftJoin(String table, Condition condition) {
        this.checkIfCanCallJoin();
        this.checkParams(table, condition);
        this.joinsCalled = true;

        String tableNameAs = String.format("LEFT OUTER JOIN (%s) ON (%s)", table, condition.getStatementAsString());
        this.query.addJoin(tableNameAs);

        return this;

    }

    /**
     * Crea una cl&aacute;usula "LEFT OUTER JOIN (subQuery.sqlValue) ON (condition.sqlValue)".
     *
     * @param subQuery  SubQuery que va a devolver como resultado una tabla.
     * @param condition Condici&oacute;n para hacer match de resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al JOIN.
     */
    public QueryBuilder leftJoin(Query subQuery, Condition condition) {
        this.checkIfCanCallJoin();
        this.checkParams(subQuery, condition);
        this.joinsCalled = true;

        String tableNameAs = String.format("LEFT OUTER JOIN (%s) ON (%s)", subQuery.getStatementAsString(), condition.getStatementAsString());
        this.query.addJoin(tableNameAs);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "LEFT OUTER JOIN table AS 'tableAs' ON (condition.sqlValue)".
     *
     * @param tableAs   Alias de la tabla.
     * @param table     Tabla contra la que se hace JOIN.
     * @param condition Condici&oacute;n para hacer match de resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al JOIN.
     */
    public QueryBuilder leftJoin(String tableAs, String table, Condition condition) {
        this.checkIfCanCallJoin();
        this.checkParams(table, condition);
        this.joinsCalled = true;

        String tableNameAs = String.format("LEFT OUTER JOIN (%s) AS \"%s\" ON (%s)", table, tableAs, condition.getStatementAsString());
        this.query.addJoin(tableNameAs);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "LEFT OUTER JOIN (subQuery.sqlValue) AS 'tableAs' ON (condition.sqlValue)".
     *
     * @param tableAs   Alias del resultado de la SubQuery.
     * @param subQuery  SubQuery que va a devolver como resultado una tabla.
     * @param condition Condici&oacute;n para hacer match de resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al JOIN.
     */
    public QueryBuilder leftJoin(String tableAs, Query subQuery, Condition condition) {
        this.checkIfCanCallJoin();
        this.checkParams(subQuery, condition);
        this.joinsCalled = true;

        String tableNameAs = String.format("LEFT OUTER JOIN (%s) AS \"%s\" ON (%s)", subQuery.getStatementAsString(), tableAs, condition.getStatementAsString());
        this.query.addJoin(tableNameAs);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "WHERE (condition.sqlValue)".
     *
     * @param condition Condici&oacute;n para filtrar resultados.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al WHERE.
     */
    public QueryBuilder where(Condition condition) {
        this.checkIfCanCallWhere();
        this.checkParams(condition);
        this.whereCalled = true;

        String whereClase = String.format("(%s)", condition.getStatementAsString());
        this.query.addWhereClause(whereClase);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "GROUP BY (params[0], params[1], ..., params[n])".
     *
     * @param params Par&aacute;metros para agrupar el resultado de la consulta.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al GROUP BY.
     */
    public QueryBuilder groupBy(String... params) {
        this.checkIfCanCallGroupBy();
        this.checkParams(params);
        this.groupByCalled = true;

        for (String param : params) {
            this.query.addGroupByField(param);
        }

        return this;
    }

    /**
     * Crea una cl&aacute;usula "HAVING (condition.sqlValue)".
     *
     * @param condition Condici&oacute;n para filtrar resultados. Se debe armar con AggregateConditionBuilder. Para una condici&oacute;n com&uacute;n, sin funciones sumarizadas, utilizar el m&eacute;todo where().
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al HAVING.
     */
    public QueryBuilder having(Condition condition) {
        this.checkIfCanCallHaving();
        this.checkParams(condition);
        this.havingCalled = true;

        String havingClase = String.format("HAVING (%s)", condition.getStatementAsString());
        this.query.addHavingClause(havingClase);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "ORDER BY param ASC".
     *
     * @param param Par&aacute;metro para order el resultado de la consulta.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al ORDER BY.
     */
    public QueryBuilder orderAscBy(String param) {
        this.checkIfCanCallOrder();
        this.checkParams(param);

        String orderStatement = String.format("%s ASC", param);
        this.query.addOrderByField(orderStatement);

        return this;
    }

    /**
     * Crea una cl&aacute;usula "ORDER BY param DESC".
     *
     * @param param Par&aacute;metro para order el resultado de la consulta.
     * @return QueryBuilder
     * @throws QueryBuilderException No se puede llamar al ORDER BY.
     */
    public QueryBuilder orderDescBy(String param) {
        this.checkIfCanCallOrder();
        this.checkParams(param);

        String orderStatement = String.format("%s DESC", param);
        this.query.addOrderByField(orderStatement);

        return this;
    }

    //Validations
    private void checkIfCanCallSelect() {
        if (this.fromCalled || this.joinsCalled || this.whereCalled || this.groupByCalled
                || this.havingCalled || this.orderByCalled) {
            throw new QueryBuilderException("Cannot call SELECT");
        }
    }

    private void checkIfCanCallFrom() {
        if (!this.selectCalled || this.fromCalled || this.joinsCalled || this.whereCalled || this.groupByCalled
                || this.havingCalled || this.orderByCalled) {
            throw new QueryBuilderException("Cannot call FROM");
        }
    }

    private void checkIfCanCallJoin() {
        if (!this.selectCalled || !this.fromCalled || this.whereCalled || this.groupByCalled
                || this.havingCalled || this.orderByCalled) {
            throw new QueryBuilderException("Cannot call FROM");
        }
    }

    private void checkIfCanCallWhere() {
        if (!this.selectCalled || !this.fromCalled || this.whereCalled || this.groupByCalled
                || this.havingCalled || this.orderByCalled) {
            throw new QueryBuilderException("Cannot call WHERE");
        }
    }

    private void checkIfCanCallGroupBy() {
        if (!this.selectCalled || !this.fromCalled || this.groupByCalled
                || this.havingCalled || this.orderByCalled) {
            throw new QueryBuilderException("Cannot call GROUP BY");
        }
    }

    private void checkIfCanCallHaving() {
        if (!this.selectCalled || !this.fromCalled || !this.groupByCalled
                || this.havingCalled || this.orderByCalled) {
            throw new QueryBuilderException("Cannot call HAVING");
        }
    }

    private void checkIfCanCallOrder() {
        if (!this.selectCalled || !this.fromCalled) {
            throw new QueryBuilderException("Cannot call ORDER BY");
        }
    }

    /**
     * @return Query
     */
    @Override
    public Query build() {
        if (!this.selectCalled || !this.fromCalled) {
            throw new QueryBuilderException("SELECT and FROM statements must be called");
        }
        return this.query;
    }
}
