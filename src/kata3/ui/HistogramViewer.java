
package kata3.ui;

import kata3.model.Histogram;

public class HistogramViewer<T> {
    private Histogram<T> histogram;

    public HistogramViewer (Histogram<T> histogram) {
        this.histogram = histogram;
    }
    
    public void show() {
      for (T item: histogram.keySet()) {
          System.out.println(item + ":" + histogram.get(item));
      }
    
    }
    
}
