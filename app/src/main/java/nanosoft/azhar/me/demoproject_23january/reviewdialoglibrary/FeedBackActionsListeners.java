package nanosoft.azhar.me.demoproject_23january.reviewdialoglibrary;

import android.content.DialogInterface;

/**
 * Created by Nanosoft-Android on 1/23/2018.
 */

public interface FeedBackActionsListeners {
    void onPositiveFeedback(FeedBackDialog dialog);
    void onNegativeFeedback(FeedBackDialog dialog);
    void onAmbiguityFeedback(FeedBackDialog dialog);
    void onCancelListener(DialogInterface dialog);
}
