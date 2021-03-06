/*
 * Copyright (C) 2016-2020 zhongan.com
 * based on code by MyCATCopyrightHolder Copyright (c) 2013, OpenCloudDB/MyCAT.
 * License: http://www.gnu.org/licenses/gpl.html GPL version 2 or higher.
 */
package com.zhongan.dmds.exception;

public class ConfigException extends RuntimeException {

  private static final long serialVersionUID = -180146385688342818L;

  public ConfigException() {
    super();
  }

  public ConfigException(String message, Throwable cause) {
    super(message, cause);
  }

  public ConfigException(String message) {
    super(message);
  }

  public ConfigException(Throwable cause) {
    super(cause);
  }

}