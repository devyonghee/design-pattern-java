package me.devyonghee.specification;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("specification 패턴")
class SpecificationTest {

    private static final CompositeSpecification<Boolean> similarity = new CompositeSpecification<Boolean>() {
        @Override
        public boolean isSatisfiedBy(Boolean is) {
            return is;
        }
    };

    private static final CompositeSpecification<Boolean> opposite = new CompositeSpecification<Boolean>() {
        @Override
        public boolean isSatisfiedBy(Boolean is) {
            return !is;
        }
    };

    @Test
    @DisplayName("and 모두가 참이면 참")
    void and_allTrue_true() {
        assertThat(similarity.and(similarity)
                .isSatisfiedBy(true))
                .isTrue();
    }

    @Test
    @DisplayName("and 하나라도 거짓이면 거짓")
    void and_oneFalse_false() {
        assertThat(similarity.and(opposite)
                .isSatisfiedBy(true))
                .isFalse();
    }

    @Test
    @DisplayName("andNot 비교 대상이 참이면 거짓")
    void andNot_allTrue_false() {
        assertThat(similarity.andNot(similarity)
                .isSatisfiedBy(true))
                .isFalse();
    }

    @Test
    @DisplayName("andNot 비교 대상이 거짓이면 참")
    void andNot_oneFalse_true() {
        assertThat(similarity.andNot(opposite)
                .isSatisfiedBy(true))
                .isTrue();
    }

    @Test
    @DisplayName("or 하나라도 참이면 참")
    void or_oneTrue_true() {
        assertThat(similarity.or(opposite)
                .isSatisfiedBy(true))
                .isTrue();
    }

    @Test
    @DisplayName("or 모두가 거짓이면 거짓")
    void or_allFalse_false() {
        assertThat(similarity.or(opposite)
                .isSatisfiedBy(true))
                .isTrue();
    }

    @Test
    @DisplayName("orNot 비교 대상이 거짓이면 참")
    void orNot_allFalse_true() {
        assertThat(similarity.orNot(similarity)
                .isSatisfiedBy(false))
                .isTrue();
    }

    @Test
    @DisplayName("orNot 비교 대상이 참이면 거짓")
    void orNot_oneTrue_false() {
        assertThat(similarity.orNot(opposite)
                .isSatisfiedBy(false))
                .isFalse();
    }

    @Test
    @DisplayName("not 반대")
    void not() {
        assertThat(similarity.not()
                .isSatisfiedBy(false))
                .isTrue();
    }
}
