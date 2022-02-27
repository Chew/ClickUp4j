/*
 * Copyright 2022 Chew and Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pw.chew.clickup4j.api.entities.customfields;

/**
 * <h2>URL Custom Field</h2>
 *
 * The URL custom field is used to store a URL.
 */
public interface URLCustomField extends ICustomField {
    /**
     * This returns the URL, but it's not necessarily a valid URL.
     *
     * @return the URL
     */
    @Override
    String getValue();

    @Override
    default CustomFieldType getType() {
        return CustomFieldType.URL;
    }
}