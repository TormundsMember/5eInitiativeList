package io.github.tormundsmember.a5einitiativelist;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Copyright (c) 2015 Schneider Holding Wirtschaftsprüfungsgesellschaft mbH - All rights reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Created by Dominik Gudic on 01.08.2017.
 */

public class BasePresenter<V extends BaseView> {

  private CompositeDisposable compositeDisposable;

  public BasePresenter(CompositeDisposable compositeDisposable) {
    this.compositeDisposable = compositeDisposable;
  }

  protected V view;

  public void attachView(V view) {
    this.view = view;
  }

  public void detachView() {
    this.view = null;
    compositeDisposable.dispose();
  }
}
