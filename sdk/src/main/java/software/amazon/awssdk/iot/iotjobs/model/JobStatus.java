/* Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License").
* You may not use this file except in compliance with the License.
* A copy of the License is located at
*
*  http://aws.amazon.com/apache2.0
*
* or in the "license" file accompanying this file. This file is distributed
* on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
* express or implied. See the License for the specific language governing
* permissions and limitations under the License.

* This file is generated
*/

package software.amazon.awssdk.iot.iotjobs.model;

public enum JobStatus {
    UNKNOWN_ENUM_VALUE("UNKNOWN_ENUM_VALUE"),
    IN_PROGRESS("IN_PROGRESS"),
    FAILED("FAILED"),
    QUEUED("QUEUED"),
    TIMED_OUT("TIMED_OUT"),
    SUCCEEDED("SUCCEEDED"),
    CANCELED("CANCELED"),
    REJECTED("REJECTED"),
    REMOVED("REMOVED");

    private String value;

    private JobStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    static JobStatus fromString(String val) {
        for (JobStatus e : JobStatus.class.getEnumConstants()) {
            if (e.toString().compareTo(val) == 0) {
                return e;
            }
        }
        return UNKNOWN_ENUM_VALUE;
    }
}
