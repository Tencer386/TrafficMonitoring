/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficmonitoring;

import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalTime;

/**
 *
 * @author dumph
 */
public class Sort 
{
    public static void BubbleSort (ArrayList<Object[]> arr, int collumn)
    {
        for(int j=0; j<arr.size(); j++)
        {
            for(int i = j + 1; i < arr.size(); i++)
            {
                if (Duration.between((LocalTime)arr.get(i)[collumn], (LocalTime)arr.get(j)[collumn]).toMillis() > 0)
                {
                    Object[] time = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, time);
                }
            }
        }
    }
    
    public static void SelectionSort (ArrayList<Object[]> arr, int collumn)
    {
        for (int i = 0; i < arr.size(); i++) 
        {
            // find position of smallest num between (i + 1)th element and last element
            int pos = i;
            for (int j = i; j < arr.size(); j++) 
            {
                if ((int)arr.get(j)[collumn] < (int)arr.get(pos)[collumn])
                    pos = j;
            }
            Object[] min = arr.get(pos);
            arr.set(pos, arr.get(i));
            arr.set(i, min);
        }
    }
    
    public static void InsertionSort (ArrayList<Object[]> arr, int collumn)
    {
        for(int i = 1; i < arr.size(); i++)
        {
            int valueToCompare = (int)arr.get(i)[collumn];
            Object[] valueToSort = arr.get(i);
            int j = i;
            while(j > 0 && (int)arr.get(j-1)[collumn] > valueToCompare)
            {
                arr.set(j, arr.get(j-1));
                j--;
            }
            arr.set(j, valueToSort);
        }
    }
}
