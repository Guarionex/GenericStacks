import br.com.fidias.chance4j.Chance;
import br.com.fidias.chance4j.ChanceException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack _sut;
    private Chance _chance;

    @BeforeEach
    void setUp() {
        _sut = new Stack();
        _chance = new Chance();
    }

    @Test
    void GivenSUT_WhenStackIsEmpty_ThenSizeReturns0()
    {
        var expectedSize = 0;

        var actualSize = _sut.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void GivenSUT_WhenPushing_ThenSizeReturns1() throws ChanceException {
        var expectedSize = 1;
        var item = _chance.integer();

        _sut.push(item);
        var actualSize = _sut.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void GivenSUT_WhenPoping_ThenReturnsLastItem() throws ChanceException {
        var expectedItem = _chance.integer();

        _sut.push(expectedItem);
        var actualItem = _sut.pop();

        assertEquals(expectedItem, actualItem);
    }

    @Test
    void GivenSUT_WhenPopingStackOfSize1_ThenSizeReturns0() throws ChanceException {
        var expectedSize = 0;
        var item = _chance.integer();

        _sut.push(item);
        _sut.pop();
        var actualSize = _sut.size();


        assertEquals(expectedSize, actualSize);
    }

    @AfterEach
    void tearDown() {
    }
}