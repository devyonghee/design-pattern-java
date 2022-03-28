package me.devyonghee.specification;

interface Specification<T> {

    Specification<T> and(Specification<? super T> other);

    Specification<T> andNot(Specification<? super T> other);

    Specification<T> or(Specification<? super T> other);

    Specification<T> orNot(Specification<? super T> other);

    Specification<T> not();

    boolean isSatisfiedBy(T candidate);
}
