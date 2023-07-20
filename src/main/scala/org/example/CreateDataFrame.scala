/*
package org.example

import org.apache.spark.sql.SparkSession

object CreateDataFrame {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local[*]").appName("CreateDataFrame").getOrCreate()
    import spark.implicits._
    val data = Seq(("ayyappa",3000),("maruthi",5000)).toDF("name","salary")
    data.show()
  }

}
*/
