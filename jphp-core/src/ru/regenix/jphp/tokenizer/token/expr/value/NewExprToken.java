package ru.regenix.jphp.tokenizer.token.expr.value;

import ru.regenix.jphp.tokenizer.TokenMeta;
import ru.regenix.jphp.tokenizer.TokenType;
import ru.regenix.jphp.tokenizer.token.Token;
import ru.regenix.jphp.tokenizer.token.expr.ValueExprToken;
import ru.regenix.jphp.tokenizer.token.stmt.ExprStmtToken;

import java.util.List;

public class NewExprToken extends ValueExprToken implements CallableExprToken {
    private Token name;
    private List<ExprStmtToken> parameters;

    public NewExprToken(TokenMeta meta) {
        super(meta, TokenType.T_NEW);
    }

    public Token getName() {
        return name;
    }

    public void setName(FulledNameToken name) {
        this.name = name;
    }

    public void setName(VariableExprToken name){
        this.name = name;
    }

    public void setName(StaticExprToken name){
        this.name = name;
    }

    public boolean isDynamic(){
        return name instanceof VariableExprToken;
    }

    public List<ExprStmtToken> getParameters() {
        return parameters;
    }

    public void setParameters(List<ExprStmtToken> parameters) {
        this.parameters = parameters;
    }
}