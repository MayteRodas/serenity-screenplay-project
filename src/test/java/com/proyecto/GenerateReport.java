package com.proyecto;

import net.thucydides.core.reports.html.HtmlAggregateStoryReporter;
import net.thucydides.model.reports.TestOutcomes;
import net.thucydides.model.reports.TestOutcomeLoader;
import java.io.File;

public class GenerateReport {
    public static void main(String[] args) throws Exception {
        String sourceDir = args.length > 0 ? args[0] : "build/site/serenity";
        File source = new File(sourceDir);

        TestOutcomes outcomes = TestOutcomeLoader.loadTestOutcomes()
                .inFormat(net.thucydides.model.reports.OutcomeFormat.JSON)
                .from(source);

        HtmlAggregateStoryReporter reporter = new HtmlAggregateStoryReporter("Proyecto Serenity");
        reporter.setSourceDirectory(source);
        reporter.setOutputDirectory(source);
        reporter.generateReportsForTestResultsIn(outcomes);
        System.out.println("Reporte generado en: " + sourceDir);
    }
}