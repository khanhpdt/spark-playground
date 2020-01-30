#!/bin/bash

SPARK_HOME="/home/khanh/opt/spark-2.4.4-bin-hadoop2.7"

CLASS_NAME=$1

$SPARK_HOME/bin/spark-submit \
 --class="vn.khanhpdt.spark_playground.$CLASS_NAME" \
 /home/khanh/projects/spark-playground/target/scala-2.11/spark-playground_2.11-1.0.jar
