package vn.khanhpdt.spark_playground

import org.apache.spark.{SparkConf, SparkContext}

object WordCount {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("My WordCount App")
    val sc = new SparkContext(conf)

    val input = sc.textFile("file:/home/khanh/projects/spark-playground/src/main/resources/sample_data/word_count")

    val words = input.flatMap(line => line.split("\\s+"))

    val wordCounts = words.map((_, 1)).reduceByKey(_ + _)

    println("Word count result:")

    wordCounts.sortByKey().foreach { case (w, c) => println(s"$w -> $c") }
  }

}
