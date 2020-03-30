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
    void GivenEmptyStack_WhenCallingSize_ThenReturn0()
    {
        var expectedSize = 0;

        var actualSize = _sut.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void GivenStack_WhenPushing_ThenSizeReturns1() throws ChanceException {
        var expectedSize = 1;
        var item = _chance.integer();

        _sut.push(item);
        var actualSize = _sut.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void GivenStack_WhenPoping_ThenReturnsTopItem() throws ChanceException {
        var expectedItem = _chance.integer();

        _sut.push(expectedItem);
        var actualItem = _sut.pop();

        assertEquals(expectedItem, actualItem);
    }

    @Test
    void GivenStackOfSize1_WhenPoping_ThenSizeReturns0() throws ChanceException {
        var expectedSize = 0;
        var item = _chance.integer();

        _sut.push(item);
        _sut.pop();
        var actualSize = _sut.size();


        assertEquals(expectedSize, actualSize);
    }

    @Test
    void GivenStack_WhenPeeking_ReturnsTopItem() throws ChanceException {
        var expectedItem = _chance.integer();

        _sut.push(expectedItem);
        var actualItem = _sut.peek();

        assertEquals(expectedItem, actualItem);
    }

    @Test
    void GivenStackSize1_WhenPeeking_ThenSizeReturns1() throws ChanceException {
        var expectedSize = 1;
        var item = _chance.integer();

        _sut.push(item);
        _sut.peek();
        var actualSize = _sut.size();


        assertEquals(expectedSize, actualSize);
    }

    @Test
    void GivenEmptyStack_WhenCallingEmpty_ThenReturnTrue()
    {
        var actual = _sut.empty();

        assertTrue(actual);
    }

    @Test
    void GivenStackWithItems_WhenCallingEmpty_ThenReturnFalse() throws ChanceException {
        _sut.push(_chance.integer());
        var actual = _sut.empty();

        assertFalse(actual);
    }

    @Test
    void GivenStackWithItems_WhenSearching_Returns1BasedIndexFromTop() throws ChanceException {
        var expectedIndex = 2;
        var itemToSearch = _chance.integer();

        _sut.push(_chance.integer());
        _sut.push(itemToSearch);
        _sut.push(_chance.integer());

        var actualIndex = _sut.search(itemToSearch);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void GivenStackWithItems_WhenAddingAllItems_ReturnsTotalValue() throws ChanceException {
        var item1 = _chance.integer(0, 10);
        var item2 = _chance.integer(0, 10);
        var item3 = _chance.integer(0, 10);
        var expectedTotal = item3 + item2 + item1;

        _sut.push(item1);
        _sut.push(item2);
        _sut.push(item3);

        var actualTotal = _sut.addAll();

        assertEquals(expectedTotal, actualTotal);
    }

    @Test
    void GivenStackWithStringItems_WhenAddingAllItems_ReturnsTotalValue() throws ChanceException {
        var item1 = _chance.word();
        var item2 = _chance.word();
        var item3 = _chance.word();
        var expectedTotal = item3 + item2 + item1;

        _sut.push(item1);
        _sut.push(item2);
        _sut.push(item3);

        var actualTotal = _sut.addAll();

        assertEquals(expectedTotal, actualTotal);
    }

    @AfterEach
    void tearDown() {
    }
}