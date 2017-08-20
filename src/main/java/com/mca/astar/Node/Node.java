package com.mca.astar.Node;

public interface Node
{
    /**
     * Get the x coordinate of the tile
     * @return The x coordinate of the tile
     */
    int getX();

    /**
     * Get the y coordinate of the tile
     * @return The y coordinate of the tile
     */
    int getY();

    /**
     * Get the cost incurred
     * @return The cost incurred
     */
    float getCost();

    /**
     * Get the heuristic used
     * @return The heuristic used
     */
    float getHeuristic();

    /**
     * Get the depth
     * @return The depth
     */
    int getDepth();

    /**
     * Get the tile under consideration
     * @return The tile under consideration
     */
    AStarNode getParent();

    /**
     * Set the new cost
     * @param newCost The new cost
     */
    void setCost(float newCost);

    /**
     * Set the new heuristic
     * @param newHeuristic The new heuristic
     */
    void setHeuristic(float newHeuristic);

    /**
     * Set the new depth
     * @param newDepth The new depth
     */
    void setDepth(int newDepth);

    /**
     * Set the new tile under consideration
     * @param newParent The new tile
     */
    void setParent(AStarNode newParent);

    /**
     * Set the depth of the new tile
     * @param parent The depth of the new tile
     */
    int setParentDepth(AStarNode parent);
}
