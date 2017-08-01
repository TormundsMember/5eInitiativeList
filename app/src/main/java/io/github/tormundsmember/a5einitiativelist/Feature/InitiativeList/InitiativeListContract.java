package io.github.tormundsmember.a5einitiativelist.Feature.InitiativeList;

import io.github.tormundsmember.a5einitiativelist.BasePresenter;
import io.github.tormundsmember.a5einitiativelist.BaseView;
import io.github.tormundsmember.a5einitiativelist.Entities.Fighter;
import io.github.tormundsmember.a5einitiativelist.Persistence.InitiativeListPersistence;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.List;

/**
 * Copyright (c) 2015 Schneider Holding Wirtschaftsprüfungsgesellschaft mbH - All rights reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Created by Dominik Gudic on 01.08.2017.
 */

public interface InitiativeListContract {

  interface InitiativeListView extends BaseView {

    void displayFighters(List<Fighter> fighters);

    void displayNoFightersAvailable();

    void markNextFighterActive();

    void removeFighterFromList(Fighter f);
  }

  class InitiativeListPresenter extends BasePresenter<InitiativeListView> {

    InitiativeListPersistence persistence;

    public InitiativeListPresenter(CompositeDisposable compositeDisposable) {
      super(compositeDisposable);
    }

    public void getInitiativeList() {
      persistence.getInitiativeList().subscribe(new Observer<List<Fighter>>() {

        @Override public void onSubscribe(@NonNull Disposable d) {

        }

        @Override public void onNext(@NonNull List<Fighter> fighters) {
          if (view != null) {
            if (fighters.isEmpty()) {
              view.displayNoFightersAvailable();
            } else {
              view.displayFighters(fighters);
            }
          }
        }

        @Override public void onError(@NonNull Throwable e) {

        }

        @Override public void onComplete() {

        }
      });
    }

    public void advanceInitiativeList() {
      if (persistence.advanceInitiativeList() && view != null) {
        view.markNextFighterActive();
      }
    }

    public void removeFighterFromCompetition(final Fighter f) {
      persistence.removeFighterFromInitiativeList(f);
      if (view != null) {
        view.removeFighterFromList(f);
      }
    }
  }
}
