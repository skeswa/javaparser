package com.github.javaparser.ast.stmt;

import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;

/**
 * @author Sandile Keswa
 */
public class TagCloseStmt extends Statement {

    private NameExpr name;

    public TagCloseStmt(final int beginLine, final int beginColumn, final int endLine, final int endColumn,
                       final NameExpr name) {
        super(beginLine, beginColumn, endLine, endColumn);
        setName(name);
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

    public NameExpr getName() {
        return name;
    }

    public void setName(NameExpr name) {
        this.name = name;
    }
}
