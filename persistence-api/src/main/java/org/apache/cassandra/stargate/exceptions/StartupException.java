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
package org.apache.cassandra.stargate.exceptions;

/**
 * An exception thrown during system startup, indicating the environment or system
 * is not in a valid state to startup.
 */
public class StartupException extends Exception
{
    public final static int ERR_WRONG_MACHINE_STATE = 1;
    public final static int ERR_WRONG_DISK_STATE = 3;
    public final static int ERR_WRONG_CONFIG = 100;

    public final int returnCode;

    public StartupException(int returnCode, String message)
    {
        super(message);
        this.returnCode = returnCode;
    }

    public StartupException(int returnCode, String message, Throwable cause)
    {
        super(message, cause);
        this.returnCode = returnCode;
    }
}