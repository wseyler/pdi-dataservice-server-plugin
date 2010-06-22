package org.pentaho.di.repository.pur.model;

import org.pentaho.di.core.exception.KettleException;

public interface ILockable {
  public RepositoryLock getRepositoryLock() throws KettleException;
  public void setRepositoryLock(RepositoryLock lock) throws KettleException;
}