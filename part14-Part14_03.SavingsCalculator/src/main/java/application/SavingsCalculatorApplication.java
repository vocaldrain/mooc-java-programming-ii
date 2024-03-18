package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    private XYChart.Series<Number, Number> savingsSeries = new XYChart.Series<>();
    private XYChart.Series<Number, Number> totalSavingsSeries = new XYChart.Series<>();


    @Override
    public void start(Stage stage) {
        // Create sliders for monthly savings and yearly interest rate
        Slider monthlySavingsSlider = new Slider(25, 250, 50); // Initial value set to 50
        Slider yearlyInterestRateSlider = new Slider(0, 10, 0);

        // Create labels for sliders
        Label monthlySavingsLabel = new Label("Monthly savings");
        Label yearlyInterestRateLabel = new Label("Yearly interest rate");

        // Create labels to display slider values
        Label monthlySavingsValueLabel = new Label(Double.toString(monthlySavingsSlider.getValue()));
        Label yearlyInterestRateValueLabel = new Label(Double.toString(yearlyInterestRateSlider.getValue()));

        // Update value labels when sliders are changed
        monthlySavingsSlider.valueProperty().addListener((obs, oldValue, newValue) -> {
            monthlySavingsValueLabel.setText(String.format("%.2f", newValue));
            updateLineChart((double) newValue, yearlyInterestRateSlider.getValue());
        });

        yearlyInterestRateSlider.valueProperty().addListener((obs, oldValue, newValue) -> {
            yearlyInterestRateValueLabel.setText(String.format("%.2f", newValue));
            updateLineChart(monthlySavingsSlider.getValue(), (double) newValue);
        });

        // Create VBox to hold sliders and their labels
        VBox slidersVBox = new VBox(10);
        slidersVBox.getChildren().addAll(
                createSliderPane(monthlySavingsLabel, monthlySavingsSlider, monthlySavingsValueLabel),
                createSliderPane(yearlyInterestRateLabel, yearlyInterestRateSlider, yearlyInterestRateValueLabel)
        );

        // Create line chart with axes
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.getData().add(savingsSeries);
        lineChart.getData().add(totalSavingsSeries);

        // Set layout
        BorderPane layout = new BorderPane();
        layout.setTop(slidersVBox);
        layout.setCenter(lineChart);
        layout.setPadding(new Insets(10));

        // Create scene and set stage
        Scene scene = new Scene(layout, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Savings Calculator");
        stage.show();

        // Initialize line chart with default values
        updateLineChart(monthlySavingsSlider.getValue(), yearlyInterestRateSlider.getValue());
    }

    // Helper method to create a BorderPane containing a label, slider, and value label
    private BorderPane createSliderPane(Label label, Slider slider, Label valueLabel) {
        BorderPane sliderPane = new BorderPane();
        sliderPane.setLeft(label);
        sliderPane.setCenter(slider);
        sliderPane.setRight(valueLabel);
        sliderPane.setPadding(new Insets(5));
        return sliderPane;
    }

    // Update the line chart with new data based on monthly savings and yearly interest rate
    private void updateLineChart(double monthlySavings, double yearlyInterestRate) {
        savingsSeries.getData().clear();
        totalSavingsSeries.getData().clear();// Clear existing data

        double totalSavings = 0;
        for (int year = 0; year <= 30; year++) {
            totalSavings += monthlySavings * 12; // Add monthly savings for each year
            double interest = totalSavings * (yearlyInterestRate / 100); // Calculate yearly interest
            totalSavings += interest; // Add yearly interest to total savings
            savingsSeries.getData().add(new XYChart.Data<>(year, monthlySavings*12*year));
            totalSavingsSeries.getData().add(new XYChart.Data<>(year, totalSavings));
            
        }
    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }
}

