package io.github.tormundsmember.a5einitiativelist.Entities;

import java.util.List;

/**
 * Copyright (c) 2015 Schneider Holding Wirtschaftsprüfungsgesellschaft mbH - All rights reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Created by Dominik Gudic on 01.08.2017.
 */

public class Encounter {

  String name;
  List<Fighter> fighters;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
