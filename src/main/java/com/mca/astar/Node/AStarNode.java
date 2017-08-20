package com.mca.astar.Node;

/**
 * Implementation of Node in AStarNode class
 */
public class AStarNode implements Node, Comparable
{
    // x and y coordinates of a given tile
    private int x;
    private int y;

    // depth to search
    private int depth;

    // cost of search
    private float cost;

    // heuristic used
    private float heuristic;

    // tile under consideration
    private AStarNode parent;

    /**
     * Create a new tile
     * @param x The new x coordinate
     * @param y The new y coordinate
     */
    public AStarNode(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // get the x coordinate of the tile
    @Override
    public int getX()
    {
        return x;
    }

    // get the y coordinate of the tile
    @Override
    public int getY()
    {
        return y;
    }

    // get the cost incurred
    @Override
    public float getCost()
    {
        return cost;
    }

    // get the heuristic used
    @Override
    public float getHeuristic()
    {
        return heuristic;
    }

    // get the depth
    @Override
    public int getDepth()
    {
        return depth;
    }

    // get the tile under consideration
    @Override
    public AStarNode getParent()
    {
        return parent;
    }

    // set the new cost
    @Override
    public void setCost(float newCost)
    {
        cost = newCost;
    }

    // set the new heuristic
    @Override
    public void setHeuristic(float newHeuristic)
    {
        heuristic = newHeuristic;
    }

    // set the new depth
    @Override
    public void setDepth(int newDepth)
    {
        depth = newDepth;
    }

    // set the new parent
    @Override
    public void setParent(AStarNode newParent)
    {
        parent = newParent;
    }

    // set the depth of the new tile
    @Override
    public int setParentDepth(AStarNode parent)
    {
        depth = parent.depth + 1;
        this.parent = parent;

        return depth;
    }

    // returns comparison of two objects
    @Override
    public int compareTo(Object object)
    {
        AStarNode newObject = (AStarNode) object;

        float f = heuristic + cost;
        float newF = newObject.heuristic + newObject.cost;

        if (f < newF)
            return -1;

        else if (f > newF)
            return 1;

        else
            return 0;

    }

    // returns comparison of two objects
    @Override
    public boolean equals(Object object)
    {
        if (object instanceof AStarNode)
        {
            AStarNode newObject = (AStarNode) object;

            if (newObject.x == x && newObject.y == y)
                return true;
        }
        return false;
    }

    // returns hash code of an object
    @Override
    public int hashCode()
    {
        return x * y;
    }
}
