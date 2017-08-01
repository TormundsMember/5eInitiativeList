package io.github.tormundsmember.a5einitiativelist.Entities;

/**
 * Copyright (c) 2015 Schneider Holding Wirtschaftsprüfungsgesellschaft mbH - All rights reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Created by Dominik Gudic on 01.08.2017.
 */

public class Fighter {

  private String name;
  private int initiative;
  private boolean isActive = false;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getInitiative() {
    return initiative;
  }

  public void setInitiative(int initiative) {
    this.initiative = initiative;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }
}
