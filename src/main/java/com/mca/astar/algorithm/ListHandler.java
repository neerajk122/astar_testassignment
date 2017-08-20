package com.mca.astar.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mca.astar.Node.AStarNode;

/**
 * Methods to define ListHandler
 */
public class ListHandler
{
    // open list that keeps track of tiles to be processed
    private List<AStarNode> open;

    // closed list that has tiles already processed
    private List<AStarNode> closed;

    public ListHandler()
    {
        open = new ArrayList<>();
        closed = new ArrayList<>();
    }

    /**
     * Get the open list
     * @return The open list
     */
    public List<AStarNode> getOpenList()
    {
        return open;
    }

    /**
     * Get the closed list
     * @return The closed list
     */
    public List<AStarNode> getClosedList()
    {
        return closed;
    }

    /**
     * Get the first tile in the open list
     * @return The first tile
     */
    public AStarNode getFirstInOpenList()
    {
        return open.get(0);
    }

    /**
     * Add a new tile to the open list
     * @param node The new tile
     */
    public void addToOpenList(AStarNode node)
    {
        open.add(node);
        Collections.sort(open);
    }

    /**
     * Add an evaluated tile to the closed list
     * @param node The evaluated tile
     */
    public void addToClosedList(AStarNode node)
    {
        closed.add(node);
        Collections.sort(closed);
    }

    /**
     * Check if a tile exists in the open list
     * @param node The tile under consideration
     */
    public boolean checkInOpenList(AStarNode node)
    {
        return open.contains(node);
    }

    /**
     * Check if a tile exists in the closed list
     * @param node The tile under consideration
     */
    public boolean checkInClosedList(AStarNode node)
    {
        return closed.contains(node);
    }

    /**
     * Remove a tile in the open list
     * @param node The tile under consideration
     */
    public void removeFromOpenList(AStarNode node)
    {
        open.remove(node);
    }

    /**
     * Remove a tile in the closed list
     * @param node The tile under consideration
     */
    public void removeFromClosedList(AStarNode node)
    {
        closed.remove(node);
    }

    /**
     * Get the size of the open list
     * @return The size of the open list
     */
    public int getOpenListSize()
    {
        return open.size();
    }

    /**
     * Get the size of the closed list
     * @return The size of the closed list
     */
    public int getClosedListSize()
    {
        return closed.size();
    }
}
