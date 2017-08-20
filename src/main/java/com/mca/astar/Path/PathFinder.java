package com.mca.astar.Path;

@FunctionalInterface
public interface PathFinder
{
    /**
     * Get the route from start to finish
     * @param startX The x coordinate of the start tile
     * @param startY The y coordinate of the start tile
     * @param goalX The x coordinate of the goal tile
     * @param goalY The y coordinate of the goal tile
     * @return The route from start to finish
     */
    Path findPath(int startX, int startY, int goalX, int goalY);
}