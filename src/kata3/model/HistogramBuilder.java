package kata3.model;


public class HistogramBuilder<T> {
    
    private Histogram<T> histogram;
    
    public void calculate(T[] array) {
        histogram = new Histogram<>();
        for (T item : array) {
           histogram.put(item, getCurrentCount(item)+1);
        }
    }
    
    public Histogram<T> getHistogram() {
        return histogram;
    }
    
    private int getCurrentCount(T item) {
       Integer count = histogram.get(item);
       if (count == null) count = 0;
       return count;
    }

    
    
}
