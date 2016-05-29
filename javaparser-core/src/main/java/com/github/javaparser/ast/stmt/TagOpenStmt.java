package com.github.javaparser.ast.stmt;

import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.TagAttrExpr;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;

import java.util.List;

/**
 * @author Sandile Keswa
 */
public class TagOpenStmt extends Statement {

    private NameExpr name;

    private List<TagAttrExpr> attributes;

    private boolean selfClosing;

    public TagOpenStmt() {}

    public TagOpenStmt(final int beginLine, final int beginColumn, final int endLine, final int endColumn,
                       final NameExpr name, final List<TagAttrExpr> attributes, boolean selfClosing) {
        super(beginLine, beginColumn, endLine, endColumn);
        setName(name);
        setAttributes(attributes);
        setSelfClosing(selfClosing);
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

    public List<TagAttrExpr> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<TagAttrExpr> attributes) {
        this.attributes = attributes;
    }

    public boolean isSelfClosing() {
        return selfClosing;
    }

    public void setSelfClosing(boolean selfClosing) {
        this.selfClosing = selfClosing;
    }
}
