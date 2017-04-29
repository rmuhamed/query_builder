package com.dbhelper.query.builder;

import com.dbhelper.query.common.SQLStatement;

/**
 * Created by quares on 06/04/2017.
 */

public interface IBuilder<T extends SQLStatement> {

    T build();

}
