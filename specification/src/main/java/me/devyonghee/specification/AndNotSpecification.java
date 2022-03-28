package me.devyonghee.specification;

public class AndNotSpecification<T> extends CompositeSpecification<T> {

    private final Specification<? super T> leftCondition;
    private final Specification<? super T> rightCondition;

    public AndNotSpecification(Specification<? super T> leftCondition, Specification<? super T> rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean isSatisfiedBy(T candidate) {
        return leftCondition.isSatisfiedBy(candidate) && !rightCondition.isSatisfiedBy(candidate);
    }

}
