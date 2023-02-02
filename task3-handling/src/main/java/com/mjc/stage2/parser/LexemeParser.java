package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

import javax.swing.text.html.parser.Parser;

public class LexemeParser extends AbstractTextParser{
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";


    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            abstractTextComponent.add(new SymbolLeaf(TextComponentType.WORD,aChar));
        }
    }

    // Write your code here!

}
