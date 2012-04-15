package basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/3/12
 * Time: 10:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class ListProcessTest {
    @Test
    public void test_every_element_in_list_add_one() throws Exception {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4);
        assertThat(ListProcess.addOne(inputList), is(Arrays.asList(2, 3, 4, 5)));
    }

    @Test
    public void test_every_element_in_list_multiply_two() throws Exception {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4);
        assertThat(ListProcess.multiplyTwo(inputList), is(Arrays.asList(2, 4, 6, 8)));
    }

    @Test
    public void test_get_even_number_from_input_list() throws Exception {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4);
        assertThat(ListProcess.getEvenList(inputList), is(Arrays.asList(2, 4)));
    }
}
