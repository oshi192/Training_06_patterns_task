package ex7Watch.watchfactory;

import ex7Watch.watch.OnFloorWatch;
import ex7Watch.watch.Watch;

public class OnFloorWatchFactory implements WatchFactory {
    public Watch createWatch() {
        return new OnFloorWatch();
    }
}
