package org.sunger.net.view;

import org.sunger.net.entity.MediaEntity;

import java.util.List;

/**
 * Created by sunger on 15/10/26.
 */
public interface HomeMediasView {
    void showError();

    void refreshView(List<MediaEntity> entities);

    void loadMoreView(List<MediaEntity> entities);
}
