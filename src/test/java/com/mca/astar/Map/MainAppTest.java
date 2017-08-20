package com.mca.astar.Map;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainAppTest
{
    private MapBuilder map;

    @Before
    public void setUp() throws Exception
    {
        map = new MapBuilder();
        map.getFile("small_map.txt");
    }

    @Test
    public void testGetTerrain()
    {
        assertEquals(map.getTerrain(0, 0), 1);
    }

    @Test
    public void testIsBlocked()
    {
        assertEquals(map.isBlocked(0, 1), true);
    }

    @Test
    public void testGetTiledMap()
    {
        assertNotNull(map.getTiledMap());
    }
}