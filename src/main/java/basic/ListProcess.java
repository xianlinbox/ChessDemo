package basic;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.sun.istack.internal.Nullable;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/3/12
 * Time: 10:39 AM
 * To change this template use File | Settings | File Templates.
 */
class ListProcess {
    public static List<Integer> addOne(List<Integer> inputList) {
        return Lists.transform(inputList, new Function<Integer, Integer>() {
            @Override
            public Integer apply(@Nullable Integer integer) {
                return ++integer;
            }
        });
    }

    public static List<Integer> multiplyTwo(List<Integer> inputList) {
        return Lists.transform(inputList, new Function<Integer, Integer>() {
            @Override
            public Integer apply(@Nullable Integer integer) {
                return integer * 2;
            }
        });
    }

    public static List<Integer> getEvenList(List<Integer> inputList) {
        //注：不知为何，Google Collections没有把Filter也做在Lists里面，而是放到Collections2里面
        List<Integer> result = new ArrayList<Integer>();
        result.addAll(
                Collections2.filter(inputList, new Predicate<Integer>() {
                    @Override
                    public boolean apply(@Nullable Integer integer) {
                        return integer % 2 == 0;
                    }
                }));

        return result;
    }
}
