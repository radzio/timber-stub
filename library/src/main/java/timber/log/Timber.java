package timber.log;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/** Logging for lazy people. */
public final class Timber {
    /** Log a verbose message with optional format args. */
    public static void v(String message, Object... args) {

    }

    /** Log a verbose exception and a message with optional format args. */
    public static void v(Throwable t, String message, Object... args) {

    }

    /** Log a debug message with optional format args. */
    public static void d(String message, Object... args) {

    }

    /** Log a debug exception and a message with optional format args. */
    public static void d(Throwable t, String message, Object... args) {

    }

    /** Log an info message with optional format args. */
    public static void i(String message, Object... args) {

    }

    /** Log an info exception and a message with optional format args. */
    public static void i(Throwable t, String message, Object... args) {

    }

    /** Log a warning message with optional format args. */
    public static void w(String message, Object... args) {

    }

    /** Log a warning exception and a message with optional format args. */
    public static void w(Throwable t, String message, Object... args) {

    }

    /** Log an error message with optional format args. */
    public static void e(String message, Object... args) {

    }

    /** Log an error exception and a message with optional format args. */
    public static void e(Throwable t, String message, Object... args) {

    }

    /** Log an assert message with optional format args. */
    public static void wtf(String message, Object... args) {

    }

    /** Log an assert exception and a message with optional format args. */
    public static void wtf(Throwable t, String message, Object... args) {

    }

    /**
     * A view into Timber's planted trees as a tree itself. This can be used for injecting a logger
     * instance rather than using static methods or to facilitate testing.
     */
    public static Tree asTree() {
        return TREE_OF_SOULS;
    }

    /** Set a one-time tag for use on the next logging call. */
    public static Tree tag(String tag) {
        List<Tree> forest = FOREST;
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0, count = forest.size(); i < count; i++) {
            forest.get(i).explicitTag.set(tag);
        }
        return TREE_OF_SOULS;
    }

    /** Add a new logging tree. */
    public static void plant(Tree tree) {

    }

    /** Remove a planted tree. */
    public static void uproot(Tree tree) {

    }

    /** Remove all planted trees. */
    public static void uprootAll() {

    }

    private static final List<Tree> FOREST = new CopyOnWriteArrayList<Tree>();

    /** A {@link Tree} that delegates to all planted trees in the {@linkplain #FOREST forest}. */
    private static final Tree TREE_OF_SOULS = new Tree() {
        @Override public void v(String message, Object... args) {

        }

        @Override public void v(Throwable t, String message, Object... args) {

        }

        @Override public void d(String message, Object... args) {

        }

        @Override public void d(Throwable t, String message, Object... args) {

        }

        @Override public void i(String message, Object... args) {

        }

        @Override public void i(Throwable t, String message, Object... args) {

        }

        @Override public void w(String message, Object... args) {

        }

        @Override public void w(Throwable t, String message, Object... args) {

        }

        @Override public void e(String message, Object... args) {

        }

        @Override public void e(Throwable t, String message, Object... args) {

        }

        @Override public void wtf(String message, Object... args) {

        }

        @Override public void wtf(Throwable t, String message, Object... args) {

        }

        @Override protected void log(int priority, String tag, String message, Throwable t) {
            throw new AssertionError("Missing override for log method.");
        }
    };

    private Timber() {
        throw new AssertionError("No instances.");
    }

    /** A facade for handling logging calls. Install instances via {@link #plant Timber.plant()}. */
    public static abstract class Tree {
        private final ThreadLocal<String> explicitTag = new ThreadLocal<String>();

        String getTag() {
            String tag = explicitTag.get();
            if (tag != null) {
                explicitTag.remove();
            }
            return tag;
        }

        /** Log a verbose message with optional format args. */
        public void v(String message, Object... args) {

        }

        /** Log a verbose exception and a message with optional format args. */
        public void v(Throwable t, String message, Object... args) {

        }

        /** Log a debug message with optional format args. */
        public void d(String message, Object... args) {

        }

        /** Log a debug exception and a message with optional format args. */
        public void d(Throwable t, String message, Object... args) {

        }

        /** Log an info message with optional format args. */
        public void i(String message, Object... args) {

        }

        /** Log an info exception and a message with optional format args. */
        public void i(Throwable t, String message, Object... args) {

        }

        /** Log a warning message with optional format args. */
        public void w(String message, Object... args) {

        }

        /** Log a warning exception and a message with optional format args. */
        public void w(Throwable t, String message, Object... args) {

        }

        /** Log an error message with optional format args. */
        public void e(String message, Object... args) {

        }

        /** Log an error exception and a message with optional format args. */
        public void e(Throwable t, String message, Object... args) {

        }

        /** Log an assert message with optional format args. */
        public void wtf(String message, Object... args) {

        }

        /** Log an assert exception and a message with optional format args. */
        public void wtf(Throwable t, String message, Object... args) {

        }

        /** Return whether a message at {@code priority} should be logged. */
        protected boolean isLoggable(int priority) {
            return true;
        }

        private void prepareLog(int priority, Throwable t, String message, Object... args) {

        }

        protected abstract void log(int priority, String tag, String message, Throwable t);
    }
}