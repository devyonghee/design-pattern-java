package me.devyonghee.chainofresponsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThatIllegalStateException;
import static org.mockito.Mockito.*;

@DisplayName("책임 연쇄 패턴")
class HandlerTest {

    private Handler handler;
    private PrintStream printer;

    @BeforeEach
    void setUp() {
        printer = mock(PrintStream.class);
        System.setOut(printer);

        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        handler = handler1;
    }

    @ParameterizedTest
    @ValueSource(strings = {"concrete1", "concrete2"})
    void handle(String request) {
        //when
        handler.handle(request);
        //then
        verify(printer, only()).println(endsWith(request));
    }

    @Test
    @DisplayName("처리 handler 가 없는 경우 예외 발생")
    void handle_notExistsHandle_thrownIllegalStateException() {
        assertThatIllegalStateException()
                .isThrownBy(() -> handler.handle("notExists"));
    }
}
