package me.devyonghee.specification;

public class NotSpecification extends AbstractSpecification {

    private final Specification condition;

    public NotSpecification(Specification condition) {
        this.condition = condition;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return !condition.isSatisfiedBy(candidate);
    }

}
