import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack sut;

    @BeforeEach
    void setUp() {
        sut = new Stack();
    }

    @Test
    void GivenSUT_WhenStackIsEmpty_ThenSizeReturns0()
    {
        var expectedSize = 0;

        var actualSize = sut.size();

        assertEquals(expectedSize, actualSize);
    }

    @AfterEach
    void tearDown() {
    }
}