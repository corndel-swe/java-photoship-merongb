package com.corndel.photoship.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2b {
  // https://tech-docs.corndel.com/java/map-filter.html#map-and-filter-with-arrays

  /**
   * A list of numbers representing filesize in KB is passed in. The filesizes
   * should be converted to MB. Assume that 1MB = 1000KB.
   *
   * <p>
   * e.g. [1400, 500, 2100] => [1.4, 0.5, 2.1]
   *
   * @param {List<Double>} files - A list of KB
   * @returns {double[]} The list in MB
   */
  public static List<Double> convertFilesizes(List<Double> files) {
    // TODO
    return files.stream().map(file -> file / 1000).collect(Collectors.toCollection(ArrayList::new));
  }
}
