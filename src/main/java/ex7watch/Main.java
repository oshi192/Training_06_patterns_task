package ex7Watch;

import ex7Watch.watch.Watch;
import ex7Watch.watch.WatchType;
import ex7Watch.watchfactory.OnFloorWatchFactory;
import ex7Watch.watchfactory.OnHandWatchFactory;
import ex7Watch.watchfactory.OnWallWatchFactory;
import ex7Watch.watchfactory.WatchFactory;
import util.Reader;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Integer, WatchType> watchCatalog = new HashMap<>();

    static {
        watchCatalog.put(1, WatchType.ONHAND);
        watchCatalog.put(2, WatchType.ONWALL);
        watchCatalog.put(3, WatchType.ONFLOOR);
    }

    public static void main(String[] args) {
        System.out.println("Choose what type of watch will be created: ");
        System.out.println("1:\ton hand watch\n2:\ton wall watch\n3:\ton floor\n");
        WatchFactory watchFactory = createFactoryByType(
                watchCatalog.get(Reader.getNumber("your answer: ", 1, 3))
        );
        Watch watch = watchFactory.createWatch();
        watch.showTime();
    }

    static WatchFactory createFactoryByType(WatchType watchType) {
        WatchFactory watchFactory;
        if (watchType == WatchType.ONHAND) {
            watchFactory = new OnHandWatchFactory();
        } else if (watchType == WatchType.ONWALL) {
            watchFactory = new OnWallWatchFactory();
        } else watchFactory = new OnFloorWatchFactory();
        return watchFactory;
    }
}
