/**
 * Licensed to UbiCollab.org under one or more contributor
 * license agreements.  See the NOTICE file distributed 
 * with this work for additional information regarding
 * copyright ownership. UbiCollab.org licenses this file
 * to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
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
package org.societies.android.api.cis;

/**
 * A class that provides constant values for the 
 * acocunt types that are supported through latest
 * sync adapters.
 * 
 * @author Babak Farshchian
 *
 */
public final class SupportedAccountTypes {
	/**
	 * Account type used for local storage. All
	 * rows tagged with LOCAL should not be synchronized
	 * by sync adapters. 
	 */
	public static final String LOCAL = "LOCAL";
	/**
	 * Account type used by Box.com sync adapter.
	 */
	public static final String COM_BOX = "com.box";
}
