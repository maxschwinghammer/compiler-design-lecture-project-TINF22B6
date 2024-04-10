package com.auberer.compilerdesignlectureproject.lexer;

import com.auberer.compilerdesignlectureproject.lexer.statemachine.StateMachine;

public class IdentifierStateMachine extends StateMachine {

    @Override
    public void init() {

    }

    @Override
    public TokenType getTokenType() {
        return TokenType.TOK_IDENTIFIER;
    }
}
