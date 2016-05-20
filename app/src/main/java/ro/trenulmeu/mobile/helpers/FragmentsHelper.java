package ro.trenulmeu.mobile.helpers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import ro.trenulmeu.mobile.AppContext;
import ro.trenulmeu.mobile.R;

/**
 * Helper Class for Fragments Management.
 */
public class FragmentsHelper {

    /**
     * Pops all the Fragments up to and including the one of the specified Tag.
     */
    public static boolean popInclusive(String tag) {
        FragmentManager fm = getFM();
        if (fm.findFragmentByTag(tag) != null) {
            fm.popBackStackImmediate(tag, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            return true;
        }
        return false;
    }

    /**
     * Pops all the Fragments in the Back Stack.
     */
    public static void popAll() {
        FragmentManager fm = getFM();
        while (fm.getBackStackEntryCount() > 0) {
            fm.popBackStackImmediate();
        }
    }

    /**
     * Goto the specified Fragment using the given Tag.
     */
    public static <T extends Fragment> void goTo(T fragment, String tag) {
        FragmentTransaction ft = getFM().beginTransaction();
        ft.replace(R.id.fragment, fragment, tag);
        ft.addToBackStack(tag);
        ft.commit();
    }

    /**
     * Similar to goTo, only that it popsInclusive before going to the Fragment.
     * Guarantees that only one instance of the Fragment is on the back Stack (by Tag).
     */
    public static <T extends Fragment> void goToSingleton(T fragment, String tag) {
        popInclusive(tag);
        goTo(fragment, tag);
    }

    /**
     * Gets the Support Fragment Manager.
     */
    private static FragmentManager getFM() {
        return AppContext.activity.getSupportFragmentManager();
    }

    /**
     * Static Class.
     */
    private FragmentsHelper() {}

}
