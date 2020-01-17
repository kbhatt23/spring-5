package com.configAnnotation.bean;

//this interfaqce will be used to create beans without even creating @component
@FunctionalInterface
public interface Bounceable {
void bounce();
}
