package com.yaodela.gen;

import java.sql.Types;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;
/**
 * 重写它的数据类型对应关系  不要它默认的包装数据类型 因为包装类型默认值都是null 对插入时不方便
 * @author Mr.X<br/>
 * 2018年9月15日<br/>
 * E-mail:342266230@qq.com
 */
public class MyJavaTypeResolverDefaultImpl extends JavaTypeResolverDefaultImpl {
	public MyJavaTypeResolverDefaultImpl() {
		super();
		//把数据库的 TINYINT 映射成 Integer
        super.typeMap.put(Types.TINYINT, new JdbcTypeInformation("TINYINT", new FullyQualifiedJavaType(int.class.getName())));
        super.typeMap.put(Types.INTEGER, new JdbcTypeInformation("INTEGER", new FullyQualifiedJavaType(int.class.getName())));
        super.typeMap.put(Types.SMALLINT, new JdbcTypeInformation("SMALLINT", new FullyQualifiedJavaType(int.class.getName())));
        super.typeMap.put(Types.BIGINT, new JdbcTypeInformation("BIGINT", new FullyQualifiedJavaType(long.class.getName())));
        super.typeMap.put(Types.DOUBLE, new JdbcTypeInformation("BIGDECIMAL", new FullyQualifiedJavaType(double.class.getName())));
        super.typeMap.put(Types.FLOAT, new JdbcTypeInformation("FLOAT", new FullyQualifiedJavaType(float.class.getName())));
	}
}
