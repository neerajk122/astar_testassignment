package com.mca.astar.algorithm;

import com.mca.astar.Node.AStarNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListHandlerTest
{
    private ListHandler open;
    private AStarNode check;

    @Before
    public void setUp() throws Exception
    {
        open = new ListHandler();
        check = new AStarNode(3, 5);
        open.addToOpenList(check);
    }

    @Test
    public void testGetList()
    {
        assertNotNull(open.getOpenList());
    }

    @Test
    public void testAddAndCheck()
    {
        open.addToOpenList(new AStarNode(4, 1));
        assertNotNull(open.checkInOpenList(new AStarNode(4, 1)));
    }

    @Test
    public void testRemoveFromList()
    {
        open.removeFromClosedList(new AStarNode(4, 1));
        assertNotNull(open.checkInOpenList(new AStarNode(4, 1)));
    }
}