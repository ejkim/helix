package org.apache.helix;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * factory that creates cluster managers
 *
 * for zk-based cluster managers, the getZKXXX(..zkClient) that takes a zkClient parameter
 *   are intended for session expiry test purpose
 */
import org.apache.helix.manager.zk.ZKHelixManager;
import org.apache.log4j.Logger;


public final class HelixManagerFactory
{
  private static final Logger logger = Logger.getLogger(HelixManagerFactory.class);

  /**
   * Construct a zk-based cluster manager enforce all types (PARTICIPANT, CONTROLLER, and
   * SPECTATOR to have a name
   * 
   * @param clusterName
   * @param instanceName
   * @param type
   * @param zkAddr
   * @return
   * @throws Exception
   */
  public static HelixManager getZKHelixManager(String clusterName,
                                               String instanceName,
                                               InstanceType type,
                                               String zkAddr) throws Exception
  {
    return new ZKHelixManager(clusterName, instanceName, type, zkAddr);
  }

}