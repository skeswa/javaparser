package com.github.javaparser.ast.expr;

import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;

/**
 * @author Sandile Keswa
 */
public class TagAttrExpr extends Expression {

    private String name;

    private String valueStr;

    private ExpressionStmt valueExpr;

    public TagAttrExpr() {
    }

    public TagAttrExpr(final int beginLine, final int beginColumn, final int endLine, final int endColumn,
                       final String name, final String valueStr) {
        super(beginLine, beginColumn, endLine, endColumn);
        setName(name);
        setValueStr(valueStr);
    }

    public TagAttrExpr(final int beginLine, final int beginColumn, final int endLine, final int endColumn,
                       final String name, final ExpressionStmt valueExpr) {
        super(beginLine, beginColumn, endLine, endColumn);
        setName(name);
        setValueExpr(valueExpr);
    }


    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        // TODO(skeswa): implement this
        // return v.visit(this, arg);
        return null;
    }

    @Override
    public <A> void accept(VoidVisitor<A> v, A arg) {
        // TODO(skeswa): implement this
        // v.visit(this, arg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValueStr() {
        return valueStr;
    }

    public void setValueStr(String valueStr) {
        this.valueStr = valueStr;
    }

    public ExpressionStmt getValueExpr() {
        return valueExpr;
    }

    public void setValueExpr(ExpressionStmt valueExpr) {
        this.valueExpr = valueExpr;
    }
}
