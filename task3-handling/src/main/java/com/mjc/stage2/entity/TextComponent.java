package com.mjc.stage2.entity;

import com.mjc.stage2.parser.AbstractTextParser;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent {
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;

    public TextComponent(TextComponentType componentType) {
        super(componentType);
        this.size = 0;
    }

    @Override
    public String operation() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(componentList.get(i).operation());
        }

        return sb.toString();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
        size++;
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        componentList.remove(textComponent);
        size--;

    }

    @Override
    public int getSize() {
        return size;
    }
// Write your code here!
}
