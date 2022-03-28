package me.devyonghee.specification;

public class NotSpecification<T> extends CompositeSpecification<T> {

    private final Specification<? super T> condition;

    public NotSpecification(Specification<? super T> condition) {
        this.condition = condition;
    }

    @Override
    public boolean isSatisfiedBy(T candidate) {
        return !condition.isSatisfiedBy(candidate);
    }

}
