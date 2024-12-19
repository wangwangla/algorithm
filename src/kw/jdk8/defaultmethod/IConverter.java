package kw.jdk8.defaultmethod;

@FunctionalInterface
public interface IConverter<F, T> {

    T convert(F from);

}