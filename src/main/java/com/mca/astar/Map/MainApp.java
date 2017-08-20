package com.mca.astar.Map;

import com.mca.astar.algorithm.AStarMethod;
import com.mca.astar.Path.Path;
import org.apache.log4j.Logger;

/**
 * Main driving class
 */
public class MainApp
{
    // the map to build
    private static MapBuilder mapBuilder = new MapBuilder();
    private static String[][] tiledMap;

    // the path to find
    private static AStarMethod pathFinder;
    private static Path path;

    // for debugging
    private static final Logger LOG = Logger.getLogger(MainApp.class);

    public static void main(String[] args)
    {
        try
        {
            if (args.length == 0)
                mapBuilder.getFile("small_map.txt");
            else
                mapBuilder.getFile(args[0]);

            tiledMap = mapBuilder.getTiledMap();

            // finds the path based on start and goal position
            pathFinder = new AStarMethod(mapBuilder, 100);
            path = pathFinder.findPath(0, 0, tiledMap.length - 1, tiledMap.length - 1);

            originalMap();

            for (int i = 0; i < path.getLength(); i++)
            {
                tiledMap[path.getX(i)][path.getY(i)] = "#";
            }

            System.out.printf("%n");
            routeTaken();
        }

        catch (Exception e)
        {
            LOG.debug("Shall we try again?");
        }
    }

    /**
     * Print out the original tiled map
     */
    public static void originalMap()
    {
        System.out.println("Initial map");
        for (int i = 0; i < tiledMap.length; i++)
        {
            for (int j = 0; j < tiledMap.length; j++)
            {
                System.out.print(tiledMap[j][i]);
            }
            System.out.printf("%n");
        }
    }

    /**
     * Print out the tiled map after traversal
     */
    public static void routeTaken()
    {
        System.out.println("Traversed map");
        for (int i = 0; i < tiledMap.length; i++)
        {
            for (int j = 0; j < tiledMap.length; j++)
            {
                System.out.print(tiledMap[j][i]);
            }
            System.out.printf("%n");
        }
    }
}