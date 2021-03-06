/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.file.watch.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The file-watch is used to monitor file events in directory using
 * java.nio.file.WatchService
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.file-watch")
public class FileWatchComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the file-watch component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The number of concurrent consumers. Increase this value, if your route is
     * slow to prevent buffering in queue.
     */
    private Integer concurrentConsumers = 1;
    /**
     * Maximum size of queue between WatchService and consumer. Unbounded by
     * default.
     */
    private Integer queueSize = 2147483647;
    /**
     * The number of threads polling WatchService. Increase this value, if you
     * see OVERFLOW messages in log.
     */
    private Integer pollThreads = 1;
    /**
     * Reference to io.methvin.watcher.hashing.FileHasher. This prevents
     * emitting duplicate events on some platforms. For working with large files
     * and if you dont need detect multiple modifications per second per file,
     * use #lastModifiedTimeFileHasher. You can also provide custom
     * implementation in registry. The option is a
     * io.methvin.watcher.hashing.FileHasher type.
     */
    private String fileHasher;
    /**
     * Enables or disables file hashing to detect duplicate events. If you
     * disable this, you can get some events multiple times on some platforms
     * and JDKs. Check java.nio.file.WatchService limitations for your target
     * platform.
     */
    private Boolean useFileHashing = true;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public Integer getConcurrentConsumers() {
        return concurrentConsumers;
    }

    public void setConcurrentConsumers(Integer concurrentConsumers) {
        this.concurrentConsumers = concurrentConsumers;
    }

    public Integer getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(Integer queueSize) {
        this.queueSize = queueSize;
    }

    public Integer getPollThreads() {
        return pollThreads;
    }

    public void setPollThreads(Integer pollThreads) {
        this.pollThreads = pollThreads;
    }

    public String getFileHasher() {
        return fileHasher;
    }

    public void setFileHasher(String fileHasher) {
        this.fileHasher = fileHasher;
    }

    public Boolean getUseFileHashing() {
        return useFileHashing;
    }

    public void setUseFileHashing(Boolean useFileHashing) {
        this.useFileHashing = useFileHashing;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }
}