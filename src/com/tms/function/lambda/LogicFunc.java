package com.tms.function.lambda;

@FunctionalInterface
public interface LogicFunc<T> {
    T chosenLogicOperation (T t);
}
