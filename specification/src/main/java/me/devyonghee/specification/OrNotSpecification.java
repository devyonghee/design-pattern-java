package me.devyonghee.specification;

public class OrNotSpecification extends AbstractSpecification {

    private final Specification leftCondition;
    private final Specification rightCondition;

    public OrNotSpecification(Specification leftCondition, Specification rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return !leftCondition.isSatisfiedBy(candidate) || !rightCondition.isSatisfiedBy(candidate);
    }

}
