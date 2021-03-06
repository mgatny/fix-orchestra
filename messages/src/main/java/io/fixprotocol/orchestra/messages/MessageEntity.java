/**
 *    Copyright 2016 FIX Protocol Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package io.fixprotocol.orchestra.messages;

/**
 * A message entity to hide details of a message ontology
 * @author Don Mendelson
 *
 */
public interface MessageEntity {
	
	/**
	 * Returns the name of an underlying object, possibly abbreviated
	 * @return an object name
	 */
	String getName();
}
