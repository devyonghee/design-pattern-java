package me.devyonghee.specification;

public abstract class AbstractSpecification implements Specification {

    @Override
    public Specification and(Specification other) {
        return new AndSpecification(this, other);
    }

    @Override
    public Specification andNot(Specification other) {
        return new AndNotSpecification(this, other);
    }

    @Override
    public Specification or(Specification other) {
        return new OrSpecification(this, other);
    }

    @Override
    public Specification orNot(Specification other) {
        return new OrNotSpecification(this, other);
    }

    @Override
    public Specification not() {
        return new NotSpecification(this);
    }

    @Override
    public abstract boolean isSatisfiedBy(Object candidate);
}
