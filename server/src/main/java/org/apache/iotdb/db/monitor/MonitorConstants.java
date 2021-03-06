/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.iotdb.db.monitor;

public class MonitorConstants {

  public static final String INT64 = "INT64";
  public static final String PATH_SEPARATOR = ".";
  // statistic for data inserting module
  public static final String STAT_STORAGE_GROUP_NAME = "root.stats";
  public static final String[] STAT_STORAGE_GROUP_ARRAY = {"root", "stats"};
  public static final String[] STAT_GLOBAL_ARRAY = {"root", "stats", "\"global\""};


  /**
   * Stat information.
   */
  public enum StatMeasurementConstants {
    TOTAL_POINTS("TOTAL_POINTS"), TOTAL_REQ_SUCCESS("TOTAL_REQ_SUCCESS"),
    TOTAL_REQ_FAIL("TOTAL_REQ_FAIL");

    StatMeasurementConstants(String measurement) {
      this.measurement = measurement;
    }

    private String measurement;

    public String getMeasurement() {
      return measurement;
    }
  }

  public enum OsStatConstants {
    NETWORK_REC, NETWORK_SEND, CPU_USAGE, MEM_USAGE, IOTDB_MEM_SIZE, DISK_USAGE, DISK_READ_SPEED,
    DISK_WRITE_SPEED, DISK_TPS
  }
}
