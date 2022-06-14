package com.example.model;

import io.sundr.builder.annotations.Buildable;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@Buildable(editableEnabled = false, lazyCollectionInitEnabled = false, builderPackage = Constants.K8S_PACKAGE)
@EqualsAndHashCode
@ToString
public class MySpec {
    
    private String name;
    private String alias;

    public String getName() {
        return name;
    }

    public MySpec setName(String name) {
        this.name = name;
        return this;
    }

    public String getAlias() {
        return alias;
    }

    public MySpec setAlias(String alias) {
        this.alias = alias;
        return this;
    }
}
