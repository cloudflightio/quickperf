/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 *
 * Copyright 2019-2021 the original author or authors.
 */

package org.quickperf;

import org.quickperf.perfrecording.RecordablePerformance;

public class RecorderExecutionOrder implements Comparable<RecorderExecutionOrder> {

    private final Class<? extends RecordablePerformance> perfRecorderClass;

    private final int executionPriority;

    public RecorderExecutionOrder(Class<? extends RecordablePerformance> perfRecorderClass, int executionPriority) {
        this.perfRecorderClass = perfRecorderClass;
        this.executionPriority = executionPriority;
    }

    public Class<? extends RecordablePerformance> getPerfRecorderClass() {
        return perfRecorderClass;
    }

    public int getExecutionPriority() {
        return executionPriority;
    }

    @Override
    public int compareTo(RecorderExecutionOrder other) {
        return this.executionPriority - other.executionPriority;
    }

}
