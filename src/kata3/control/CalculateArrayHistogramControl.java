package kata3.control;

import kata3.model.HistogramBuilder;
import kata3.ui.HistogramViewer;

public class CalculateArrayHistogramControl <T> {
   private T[] array;

    public CalculateArrayHistogramControl(T[] array) {
        this.array = array;
    }
    
    public void execute() {
        HistogramBuilder<T> builder = new HistogramBuilder<>();
        builder.calculate(array);
        HistogramViewer<T> viewer = new HistogramViewer<>(builder.getHistogram());
        viewer.show();
    }
}