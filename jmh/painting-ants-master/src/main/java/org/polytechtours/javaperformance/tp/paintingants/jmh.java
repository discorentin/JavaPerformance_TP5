package org.polytechtours.javaperformance.tp.paintingants;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class jmh {
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(CColonie.class.getSimpleName())
                .include(CFourmi.class.getSimpleName())
                .include(CPainting.class.getSimpleName())
                .include(PaintingAnts.class.getSimpleName())
                .forks(2)
                .warmupIterations(3)
                .measurementIterations(3)
                .output("./Output.log")
                .build();
        new Runner(opt).run();
    }
}
