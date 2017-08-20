package com.mca.astar.Path;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StepTest
{
    private Step step;

    @Before
    public void setUp() throws Exception
    {
        step = new Step(1, 1);
    }

    @Test
    public void testGetX()
    {
        assertTrue(step.getX() > 0);
    }

    @Test
    public void testGetY()
    {
        assertTrue(step.getY() > 0);
    }

    @Test
    public void testEquals()
    {
        assertFalse(step.equals(new Step(0, 0)));
    }
}