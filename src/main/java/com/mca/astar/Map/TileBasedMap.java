package com.mca.astar.Map;

public interface TileBasedMap
{
    /**
     * Get the breadth of the map
     * @return The number of tiles horizontally
     */
    int getBreadthOfTiles();

    /**
     * Get the length of the map
     * @return The number of tiles vertically
     */
    int getHeightOfTiles();

    /**
     * Check if the considered tile is isBlocked
     * @param x The x coordinate of the tile
     * @param y The y coordinate of the tile
     * @return true if the considered tile is isBlocked
     */
    boolean isBlocked(int x, int y);

    /**
     * Get the cost of moving to a given tile
     * @param startX The x coordinate of the start tile
     * @param startY The y coordinate of the start tile
     * @param goalX The x coordinate of the goal tile
     * @param goalY The y coordinate of the goal tile
     * @return The cost of moving to a given tile
     */
    float getCost(int startX, int startY, int goalX, int goalY);

    /**
     * Notify the path finder that a tile has been checked
     * @param x The x coordinate of the tile visited
     * @param y The y coordinate of the tile visited
     */
    void pathFinderVisited(int x, int y);
}