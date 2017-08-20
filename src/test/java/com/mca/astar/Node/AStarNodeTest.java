package com.mca.astar.Node;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AStarNodeTest
{
    private AStarNode node;

    @Before
    public void setUp() throws Exception
    {
        node = new AStarNode(1, 1);
    }

    @Test
    public void testDepth()
    {
        node.setDepth(2);
        assertEquals(node.getDepth(), 2);
    }
}