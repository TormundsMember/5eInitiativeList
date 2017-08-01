package io.github.tormundsmember.a5einitiativelist.Persistence;

import io.github.tormundsmember.a5einitiativelist.Entities.Encounter;
import io.github.tormundsmember.a5einitiativelist.Entities.Fighter;
import io.reactivex.Observable;
import java.util.List;

/**
 * Copyright (c) 2015 Schneider Holding Wirtschaftsprüfungsgesellschaft mbH - All rights reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Created by Dominik Gudic on 01.08.2017.
 */

public interface InitiativeListPersistence {

  Observable<List<Encounter>> getEncounters();

  boolean saveEncounter(Encounter encounter);

  Observable<List<Fighter>> getInitiativeList();

  boolean saveInitiativeList(List<Fighter> fighters);

  boolean clearInitiativeList();

  boolean advanceInitiativeList();

  boolean removeFighterFromInitiativeList(Fighter f);
}
