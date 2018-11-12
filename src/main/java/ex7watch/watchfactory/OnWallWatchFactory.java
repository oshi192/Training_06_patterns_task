package ex7Watch.watchfactory;

import ex7Watch.watch.OnWallWatch;
import ex7Watch.watch.Watch;

public class OnWallWatchFactory implements WatchFactory {
    public Watch createWatch() {
        return new OnWallWatch();
    }
}
