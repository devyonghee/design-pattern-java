package me.devyonghee.specification;

interface Specification {

    Specification and(Specification other);

    Specification andNot(Specification other);

    Specification or(Specification other);

    Specification orNot(Specification other);

    Specification not();

    boolean isSatisfiedBy(Object candidate);
}
