package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent {

    private char value;

    public SymbolLeaf(TextComponentType componentType, char value) {
        super(componentType);
        this.value = value;
    }

    @Override
    public String operation() {
        return String.valueOf(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("Leaf does not support adding");

    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("Leaf does not support removing");

    }

    @Override
    public int getSize() {
        return 1;
    }

    // Write your code here!
}
