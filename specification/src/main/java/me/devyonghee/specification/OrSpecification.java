package me.devyonghee.specification;

public class OrSpecification extends AbstractSpecification {

    private final Specification leftCondition;
    private final Specification rightCondition;

    public OrSpecification(Specification leftCondition, Specification rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return leftCondition.isSatisfiedBy(candidate) || rightCondition.isSatisfiedBy(candidate);
    }

}
