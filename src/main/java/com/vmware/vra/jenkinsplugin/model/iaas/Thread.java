/*
 * Copyright (c) 2020 VMware, Inc
 *
 *  SPDX-License-Identifier: MIT
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/*
 * VMware Cloud Assembly IaaS API
 * A multi-cloud IaaS API for Cloud Automation Services
 *
 * OpenAPI spec version: 2019-01-15
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.vra.jenkinsplugin.model.iaas;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Thread */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class Thread {
  @SerializedName("threadGroup")
  private ThreadGroup threadGroup = null;

  @SerializedName("contextClassLoader")
  private ClassLoader contextClassLoader = null;

  @SerializedName("alive")
  private Boolean alive = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("interrupted")
  private Boolean interrupted = null;

  @SerializedName("stackTrace")
  private List<StackTraceElement> stackTrace = null;

  @SerializedName("id")
  private Long id = null;

  /** Gets or Sets state */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    NEW("NEW"),
    RUNNABLE("RUNNABLE"),
    BLOCKED("BLOCKED"),
    WAITING("WAITING"),
    TIMED_WAITING("TIMED_WAITING"),
    TERMINATED("TERMINATED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("uncaughtExceptionHandler")
  private UncaughtExceptionHandler uncaughtExceptionHandler = null;

  @SerializedName("daemon")
  private Boolean daemon = null;

  public Thread threadGroup(ThreadGroup threadGroup) {
    this.threadGroup = threadGroup;
    return this;
  }

  /**
   * Get threadGroup
   *
   * @return threadGroup
   */
  @Schema(description = "")
  public ThreadGroup getThreadGroup() {
    return threadGroup;
  }

  public void setThreadGroup(ThreadGroup threadGroup) {
    this.threadGroup = threadGroup;
  }

  public Thread contextClassLoader(ClassLoader contextClassLoader) {
    this.contextClassLoader = contextClassLoader;
    return this;
  }

  /**
   * Get contextClassLoader
   *
   * @return contextClassLoader
   */
  @Schema(description = "")
  public ClassLoader getContextClassLoader() {
    return contextClassLoader;
  }

  public void setContextClassLoader(ClassLoader contextClassLoader) {
    this.contextClassLoader = contextClassLoader;
  }

  public Thread alive(Boolean alive) {
    this.alive = alive;
    return this;
  }

  /**
   * Get alive
   *
   * @return alive
   */
  @Schema(description = "")
  public Boolean isAlive() {
    return alive;
  }

  public void setAlive(Boolean alive) {
    this.alive = alive;
  }

  public Thread name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Thread interrupted(Boolean interrupted) {
    this.interrupted = interrupted;
    return this;
  }

  /**
   * Get interrupted
   *
   * @return interrupted
   */
  @Schema(description = "")
  public Boolean isInterrupted() {
    return interrupted;
  }

  public void setInterrupted(Boolean interrupted) {
    this.interrupted = interrupted;
  }

  public Thread stackTrace(List<StackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  public Thread addStackTraceItem(StackTraceElement stackTraceItem) {
    if (this.stackTrace == null) {
      this.stackTrace = new ArrayList<StackTraceElement>();
    }
    this.stackTrace.add(stackTraceItem);
    return this;
  }

  /**
   * Get stackTrace
   *
   * @return stackTrace
   */
  @Schema(description = "")
  public List<StackTraceElement> getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(List<StackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
  }

  public Thread id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Thread state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   *
   * @return state
   */
  @Schema(description = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Thread priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   *
   * @return priority
   */
  @Schema(description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Thread uncaughtExceptionHandler(UncaughtExceptionHandler uncaughtExceptionHandler) {
    this.uncaughtExceptionHandler = uncaughtExceptionHandler;
    return this;
  }

  /**
   * Get uncaughtExceptionHandler
   *
   * @return uncaughtExceptionHandler
   */
  @Schema(description = "")
  public UncaughtExceptionHandler getUncaughtExceptionHandler() {
    return uncaughtExceptionHandler;
  }

  public void setUncaughtExceptionHandler(UncaughtExceptionHandler uncaughtExceptionHandler) {
    this.uncaughtExceptionHandler = uncaughtExceptionHandler;
  }

  public Thread daemon(Boolean daemon) {
    this.daemon = daemon;
    return this;
  }

  /**
   * Get daemon
   *
   * @return daemon
   */
  @Schema(description = "")
  public Boolean isDaemon() {
    return daemon;
  }

  public void setDaemon(Boolean daemon) {
    this.daemon = daemon;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Thread thread = (Thread) o;
    return Objects.equals(this.threadGroup, thread.threadGroup)
        && Objects.equals(this.contextClassLoader, thread.contextClassLoader)
        && Objects.equals(this.alive, thread.alive)
        && Objects.equals(this.name, thread.name)
        && Objects.equals(this.interrupted, thread.interrupted)
        && Objects.equals(this.stackTrace, thread.stackTrace)
        && Objects.equals(this.id, thread.id)
        && Objects.equals(this.state, thread.state)
        && Objects.equals(this.priority, thread.priority)
        && Objects.equals(this.uncaughtExceptionHandler, thread.uncaughtExceptionHandler)
        && Objects.equals(this.daemon, thread.daemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        threadGroup,
        contextClassLoader,
        alive,
        name,
        interrupted,
        stackTrace,
        id,
        state,
        priority,
        uncaughtExceptionHandler,
        daemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Thread {\n");

    sb.append("    threadGroup: ").append(toIndentedString(threadGroup)).append("\n");
    sb.append("    contextClassLoader: ").append(toIndentedString(contextClassLoader)).append("\n");
    sb.append("    alive: ").append(toIndentedString(alive)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    interrupted: ").append(toIndentedString(interrupted)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    uncaughtExceptionHandler: ")
        .append(toIndentedString(uncaughtExceptionHandler))
        .append("\n");
    sb.append("    daemon: ").append(toIndentedString(daemon)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
