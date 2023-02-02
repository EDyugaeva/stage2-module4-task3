package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

import static com.mjc.stage2.entity.TextComponentType.WORD;

public class WordParser extends AbstractTextParser {
    public WordParser() {
        super();
    }

    public WordParser(AbstractTextParser nextParser) {
        super(nextParser);
    }

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            abstractTextComponent.add(new SymbolLeaf(TextComponentType.WORD,aChar));
        }
    }

    @Override
    protected void setNextParser(AbstractTextParser nextParser) {
        super.setNextParser(nextParser);
    }

    // Write your code here!

}
