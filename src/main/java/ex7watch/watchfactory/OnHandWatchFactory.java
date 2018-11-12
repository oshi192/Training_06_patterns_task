package ex7Watch.watchfactory;

import ex7Watch.watch.OnHandWatch;
import ex7Watch.watch.Watch;

public class OnHandWatchFactory implements WatchFactory {
    public Watch createWatch() {
        return new OnHandWatch();
    }
}
