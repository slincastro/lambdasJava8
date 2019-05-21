package com.example.lambdaTests.topics;

public class StringCombiner {

    private final String prefix;
    private final String delimiter;
    private final String suffix;
    private final StringBuilder builder;

    public StringCombiner(String prefix, String delimiter, String suffix) {
        this.prefix = prefix;
        this.delimiter = delimiter;
        this.suffix = suffix;
        builder = new StringBuilder();
    }

    public StringCombiner add(String element) {
        if(!this.areAtStart()) {
            this.builder.append(delimiter);
        }
        this.builder.append(element);

        return this;
    }

    @Override
    public String toString() {
        return prefix + builder.toString() + suffix;
    }

    public StringCombiner merge(StringCombiner other){
        builder.append(other.builder);
        return this;
    }

    private boolean areAtStart() {
        return builder.length() == 0;
    }
}
