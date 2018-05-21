package Exc8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exc8
{
    public static void main(String[] args)
    {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(switchPairs(list));
    }
    private static List<Integer> switchPairs (List<Integer> list)
    {
        List<Integer> listFinal = new ArrayList<>();
        for (int i = 0; i < list.size()-1; i++)
        {
            if (i%2==0)
            {
                listFinal.add(list.get(i + 1));
                listFinal.add(list.get(i));
            }
        }
        listFinal.add(list.get(list.size()-1));
        return listFinal;
    }

}
