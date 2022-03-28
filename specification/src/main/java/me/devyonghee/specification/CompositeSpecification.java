package me.devyonghee.specification;

public abstract class CompositeSpecification<T> implements Specification<T> {

    @Override
    public Specification<T> and(Specification<? super T> other) {
        return new AndSpecification<>(this, other);
    }

    @Override
    public Specification<T> andNot(Specification<? super T> other) {
        return new AndNotSpecification<>(this, other);
    }

    @Override
    public Specification<T> or(Specification<? super T> other) {
        return new OrSpecification<>(this, other);
    }

    @Override
    public Specification<T> orNot(Specification<? super T> other) {
        return new OrNotSpecification<>(this, other);
    }

    @Override
    public Specification<T> not() {
        return new NotSpecification<>(this);
    }

    public abstract boolean isSatisfiedBy(T candidate);
}
