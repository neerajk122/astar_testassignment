package com.mca.astar.Path;

import java.util.ArrayList;
import java.util.List;

public class Path
{
    // steps taken on the map
    private List<Step> steps;

    public Path()
    {
        this.steps = new ArrayList<>();
    }

    /**
     * Get the length of the path
     * @return The number of steps
     */
    public int getLength()
    {
        return steps.size();
    }

    /**
     * Get the step at a given location
     * @param location the location of the step
     * @return The position of the step on the map
     */
    public Step getStep(int location)
    {
        return steps.get(location);
    }

    /**
     * Get the x coordinate of the step at a given location
     * @param location The x coordinate of the tile
     * @return The x coordinate of the step
     */
    public int getX(int location)
    {
        return getStep(location).getX();
    }

    /**
     * Get the y coordinate of the step at a given location
     * @param location The y coordinate of the tile
     * @return The y coordinate of the step
     */
    public int getY(int location)
    {
        return getStep(location).getY();
    }

    /**
     * Add a step to the path
     * @param x The x coordinate of the step
     * @param y The y coordinate of the step
     */
    public void addStep(int x, int y)
    {
        steps.add(new Step(x, y));
    }

    /**
     * Add a step to the beginning of the path
     * @param x The x coordinate of the step
     * @param y The y coordinate of the step
     */
    public void addStepToStart(int x, int y)
    {
        steps.add(0, new Step(x, y));
    }

    /**
     * Check if the path contains the given step
     * @param x The x coordinate of the step to check
     * @param y The y coordinate of the step to check
     * @return true if the step is found in the path
     */
    public boolean contains(int x, int y)
    {
        return steps.contains(new Step(x, y));
    }
}