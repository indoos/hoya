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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hoya.api;

/**
 * Standard options for roles
 */
public interface RoleKeys {


  String ROLE_NAME = "role.name";
  /**
   * Number needed 
   */
  String ROLE_INSTANCES = "role.instances";
    /**
   * Number needed 
   */
  String ROLE_ACTUAL_INSTANCES = "role.instances";
  
  /**
   * 
   *  {@value}
   */
  String YARN_APP_RETRIES = "yarn.app.retries";

  /**
   *
   *  {@value}
   */
  int DEF_YARN_APP_RETRIES = 8;

  /**
   *  Amount of memory to ask YARN for in MB.
   *  <i>Important:</i> this may be a hard limit on the
   *  amount of RAM that the service can use
   *  {@value}
   */
  String YARN_MEMORY = "yarn.memory";

  /** {@value} */
  int DEF_YARN_MEMORY = 256;

  
  /**
   * Number of cores/virtual cores to ask YARN for
   *  {@value}
   */
  String YARN_CORES = "yarn.vcores";

  /** {@value} */
  int DEF_YARN_CORES = 1;



  /**
   *  Priority in YARN requests
   *  {@value}
   */
  String YARN_PRIORITY = "yarn.priority";

  /** {@value} */
  //int DEF_YARN_PRIORITY = 0;


  /**
   * For applications that support a web port that can be externally configured,
   * this is the value
   *  {@value}
   */
  String APP_INFOPORT = "app.infoport";

  /**
   *  JVM heap size for Java applications in MB.  Only relevant for Java applications.
   *  This MUST be less than or equal to the {@link #YARN_MEMORY} option
   *  {@value}
   */
  String JVM_HEAP = "jvm.heapsize";

  /**
   * JVM options other than heap size. Only relevant for Java applications.
   *  {@value}
   */
  String JVM_OPTS = "jvm.opts";


  /**
   * All keys w/ env. are converted into env variables and passed down
   */
  String ENV_PREFIX = "env.";
  
}
