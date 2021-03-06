/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 */

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Use to create or update the event stream for an app.
 */
public class PutEventStreamRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * ApplicationId
     */
    private String applicationId;

    /**
     * EventStream to write.
     */
    private WriteEventStream writeEventStream;

    /**
     * ApplicationId
     *
     * @return ApplicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * ApplicationId
     *
     * @param applicationId ApplicationId
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * ApplicationId
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId ApplicationId
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutEventStreamRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * EventStream to write.
     *
     * @return EventStream to write.
     */
    public WriteEventStream getWriteEventStream() {
        return writeEventStream;
    }

    /**
     * EventStream to write.
     *
     * @param writeEventStream EventStream to write.
     */
    public void setWriteEventStream(WriteEventStream writeEventStream) {
        this.writeEventStream = writeEventStream;
    }

    /**
     * EventStream to write.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param writeEventStream EventStream to write.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutEventStreamRequest withWriteEventStream(WriteEventStream writeEventStream) {
        this.writeEventStream = writeEventStream;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getWriteEventStream() != null)
            sb.append("WriteEventStream: " + getWriteEventStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getWriteEventStream() == null) ? 0 : getWriteEventStream().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEventStreamRequest == false)
            return false;
        PutEventStreamRequest other = (PutEventStreamRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getWriteEventStream() == null ^ this.getWriteEventStream() == null)
            return false;
        if (other.getWriteEventStream() != null
                && other.getWriteEventStream().equals(this.getWriteEventStream()) == false)
            return false;
        return true;
    }
}
