package com.mca.astar.Heuristic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManhattanHTest
{
    private ManhattanH heuristic;
    private float cost;

    @Before
    public void setUp() throws Exception
    {
        heuristic = new ManhattanH();
    }

    @Test
    public void testCost()
    {
        cost = heuristic.getCost(0, 0, 4, 4);
        assertNotNull((double) cost);
    }
}