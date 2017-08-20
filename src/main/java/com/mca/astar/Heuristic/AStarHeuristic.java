package com.mca.astar.Heuristic;

@FunctionalInterface
public interface AStarHeuristic
{
    /**
     * Calculate the estimate of a tile for the overall path
     * @param x The x coordinate of the current tile
     * @param y The y coordinate of the current tile
     * @param goalX The x coordinate of the goal tile
     * @param goalY The y coordinate of the goal tile
     * @return The cost of the given tile
     */
    float getCost(int x, int y, int goalX, int goalY);
}
